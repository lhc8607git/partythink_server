package com.example.demo.server.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.server.repository.data.Contest;

//JPA
public interface DmContestRepository extends CrudRepository<Contest,Integer>{

	// 모든 콘테스트 조회
	List<Contest> findAllByOrderByLikeNumDesc();
	// 특정 분야의 모든 콘테스트 조회 
	List<Contest> findByFieldOrderByLikeNumDesc(String field);
}
