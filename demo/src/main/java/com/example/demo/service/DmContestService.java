package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.server.repository.DmContestRepository;
import com.example.demo.server.repository.data.Contest;


@Service
public class DmContestService {
	
	@Autowired
	DmContestRepository contestRepo;
	
	// 모든 콘테스트 조회
	public List<Contest> getContests(){
		return contestRepo.findAllByOrderByLikeNumDesc();
	}
	
	// 특정 분야의 모든 콘테스트 조회 
	public List<Contest> getContestByField(String field) {
		List<Contest> contest = contestRepo.findByFieldOrderByLikeNumDesc(field);
		return contest;
	}
	
	// 특정 콘테스트 하나 조회 
	public Contest getContest(int contestId) {
		Optional<Contest> contest = contestRepo.findById(contestId);
		return contest.orElse(null);  // null인 경우, null반환
	}
	
	
	 // 특정 콘테스트 "좋아요+1"기능
	public Contest updateContest(int contestId) {
		if(contestRepo.existsById(contestId)) { //해당 id를 가진 데이터가 있으면
			Optional<Contest> one = contestRepo.findById(contestId);
			Contest one0 = one.get();
			one0.setLikeNum(one0.getLikeNum() + 1);
			contestRepo.save(one0);  //테이블에 반영
			return one0;
		}else {
			return null;
		}
	}
	
}
