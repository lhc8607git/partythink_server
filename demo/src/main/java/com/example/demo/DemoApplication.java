package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.server.repository.DmContestRepository;
import com.example.demo.server.repository.DmUserRepository;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// 초기 데이터 삽입
	@Bean
	public CommandLineRunner runner(DmContestRepository contestRepo,
			DmUserRepository userRepo) throws Exception{
		return (args)->{
			DmPTContestDump.insertContestDump(contestRepo);
			DmPtUserDump.insertDump(userRepo);
		};
	}
	
}
