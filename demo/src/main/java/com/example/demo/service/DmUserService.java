package com.example.demo.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Optional;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Base64Utils;

import com.example.demo.server.repository.DmUserRepository;
import com.example.demo.server.repository.data.User;
import com.google.api.client.extensions.appengine.http.UrlFetchTransport;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;






@Service
public class DmUserService {
	
	@Autowired
	DmUserRepository userRepo;
	
	private static String GOOGLE_CLIENT_ID = "770160971350-e9lj0uteorphshi7qi2hqutb0sgmmqjp.apps.googleusercontent.com";
	
	// 사용자 구글 인증 - 처음
	public User upsertUser(String idTokenString) throws Exception {
			
		if (idTokenString != null) {
				
			StringTokenizer tokenizer = new StringTokenizer(idTokenString, ".");
			tokenizer.nextToken();
			String payload_str = tokenizer.nextToken();
				
			payload_str = new String(Base64Utils.decodeFromString(payload_str));
//			payload_str = new String(Base64.decodeBase64(payload_str));
				
			JsonParser parser = new JsonParser();
			JsonObject obj = (JsonObject) parser.parse(payload_str);
			String email = obj.get("email").getAsString();
			System.out.println("email : " + email);
				
			// 랜덤으로 임의로 값을 accessKey 값을 준다---추후 수정--
			String accessKey = Base64Utils.encodeToString(getRandom());
			return saveUser(email, accessKey);
		} 
			
		throw new Exception("fail..");
	}
	
	// 첫 로그인(사용자 구글 인증)하면 accesskey를 DB에 저장
	@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public User saveUser(String email, String accessKey) {
		User user = new User();
		user.setEmail(email);
		user.setAccessKey(accessKey);
		
		return userRepo.save(user);
	}
	
	// 사용자 자체 인증 ("서버"에서 자체 인증) - 한번 로그인 후,
	public boolean verifyUser(String email, String accessKey) {
		User user = getUser(email);
		if(user != null && user.getAccessKey().equals(accessKey))
			return true;
		else
			return false;
	}
	
	// 사용자가 null이면, null로 표시
	@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public User getUser(String email) {
		Optional<User> user = userRepo.findById(email);
		return user.orElse(null);
	}
	
	// 암호용 난수 
	private byte[] getRandom() throws NoSuchAlgorithmException {
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		byte[] b = new byte[20];
		sr.nextBytes(b); // 난수 바이트를 생성.
		return b;
	}
	
	
	
	
	
	// 사용안하는 코드 ----
	public String getAcceessKey_bak(String idTokenString) throws Exception {
		
		//TODO : verify token
//		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), JacksonFactory.getDefaultInstance())	
//				 .setAudience(Collections.singletonList(GOOGLE_CLIENT_ID))
//				    .build();
		
		JsonFactory jacksonFactory = new JacksonFactory();
//		JsonFactory jacksonFactory = new GsonFactory();
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(UrlFetchTransport.getDefaultInstance(), jacksonFactory)
	            .setAudience(Collections.singletonList(GOOGLE_CLIENT_ID))
	            .build();
		
		GoogleIdToken idToken = verifier.verify(idTokenString);
		
		if (idToken != null) {
			
			Payload payload = idToken.getPayload();

			// Print user identifier
			String userId = payload.getSubject();
			System.out.println("User ID: " + userId);

			// Get profile information from payload
			String email = payload.getEmail();
			boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
			String name = (String) payload.get("name");
			String pictureUrl = (String) payload.get("picture");
			String locale = (String) payload.get("locale");
			String familyName = (String) payload.get("family_name");
			String givenName = (String) payload.get("given_name");
			
			return new String(getRandom());
		}
		
		throw new Exception("fail..");
	}
}
