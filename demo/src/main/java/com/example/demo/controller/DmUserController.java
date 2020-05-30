package com.example.demo.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.server.data.DmResponseCode;
import com.example.demo.server.data.DmResponseMsg;
import com.example.demo.server.repository.data.User;
import com.example.demo.service.DmUserService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class DmUserController implements InitializingBean {

	@Autowired
	DmUserService userService;
	
	// InitializingBean 인터페이스를 이용해서 초기화 작업
	@Override
	public void afterPropertiesSet() throws Exception {
		 
	}
	
	// 사용자 구글 인증 - 처음
	@PostMapping("/googleAuth")
    @ResponseBody
    public DmResponseMsg googleAuth(@RequestParam String idTokenString) throws Exception {
		
		User user = userService.upsertUser(idTokenString);
		
		DmResponseMsg res = new DmResponseMsg();
		res.setResCode(DmResponseCode.SUCCESS.getCode());
		res.setResMsg(DmResponseCode.SUCCESS.getMsg());
		res.setResult(user.getAccessKey());
		return res;
    }
	
	// 사용자 자체 인증 ("서버"에서 자체 인증) - 한번 로그인 후,
	@PostMapping("/auth")
    @ResponseBody
    public DmResponseMsg auth(@RequestParam String email, @RequestParam String accessKey) throws Exception {

		boolean isVerify = userService.verifyUser(email, accessKey);
		
		DmResponseMsg res = new DmResponseMsg();
		if(isVerify == true) {
			res.setResCode(DmResponseCode.SUCCESS.getCode());
			res.setResMsg(DmResponseCode.SUCCESS.getMsg());
		}else {
			res.setResCode(DmResponseCode.FAIL.getCode());
			res.setResMsg(DmResponseCode.FAIL.getMsg());
		}
		return res;
    }
	
	// 에러 처리
	@ExceptionHandler(Exception.class) 
	public DmResponseMsg exception(Exception e) { 
		DmResponseMsg res = new DmResponseMsg();
		res.setResCode(DmResponseCode.FAIL.getCode());
		res.setResMsg(DmResponseCode.FAIL.getMsg());
		return res;
	}
	
}
