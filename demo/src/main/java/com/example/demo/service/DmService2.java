package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.server.repository.DmContestRepository;
import com.example.demo.server.repository.data.Contest;


@Service
public class DmService2 {

	@Autowired
	DmContestRepository contestRepo;
	
	public List<Contest> test() {
		return contestRepo.findAllByOrderByLikeNumDesc();
	}
	
}
