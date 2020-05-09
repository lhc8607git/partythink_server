package com.example.demo.server.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.server.repository.data.Contest;

//JPA
public interface ContestRepository extends CrudRepository<Contest,Integer>{
	List<Contest> findByFieldOrderByLikeNumDesc(String field);
	List<Contest> findAllByOrderByLikeNumDesc();
}
