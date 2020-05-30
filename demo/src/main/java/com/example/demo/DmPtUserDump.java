package com.example.demo;

import com.example.demo.server.repository.DmUserRepository;
import com.example.demo.server.repository.data.User;

public class DmPtUserDump {
	
	public static void insertDump(DmUserRepository userRepo) {
		{
			User user = new User();
			user.setEmail("user1@gmail.com");
			user.setAccessKey("AAAA1234");
			userRepo.save(user);
		}
		
		{
			User user = new User();
			user.setEmail("user2@gmail.com");
			user.setAccessKey("BBBBASDF");
			userRepo.save(user);
		}
		
		{
			User user = new User();
			user.setEmail("user3@gmail.com");
			user.setAccessKey("CCCC0000");
			userRepo.save(user);
		}
	}
}
