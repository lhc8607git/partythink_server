package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.D1;
import com.example.demo.service.DmService2;


@Controller
@RequestMapping("/contest")
public class PlacticeContestController {

	@Autowired
	DmService2 demoservice;
	
	// 첫번째 방법 - test infos (포스트맨)
	@GetMapping("/infos")
	@ResponseBody
	public String contests() {

		return "hello world";
	}

	// 두번째 방법 - contest info (포스트맨)
	// @PathVariable : PathVariable의 경우 url에서 각 구분자에 들어오는 값을 처리해야 할 때 사용합니다.
	@GetMapping("/infos11/{page}")
	@ResponseBody
	public ArrayList<String> contests(@PathVariable int page) {
		Map<Integer, ArrayList<String>> db = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> data = new ArrayList<String>();
		data.add("harry potter");
		data.add("ring of king");
		data.add("hello world");
		db.put(1, data);
		db.put(2, data);

		return db.get(page);
	}

	// 셋번째 방법 - contest info3 (포스트맨)-------------
	@GetMapping("/infosField")
	@ResponseBody
	public String contest(String field) {
		String a = field + "받음";

		return a;
	}

	// 넷번째 방법 - contest info2 (포스트맨)-------
	// @RequestBody : 객체 받을 때 사용하는거
	// 특정 분야 콘테스트 조회
	@GetMapping("/infos12")
	@ResponseBody
	public List<Integer> contest(@RequestBody D1 d1) {
		List<Integer> db2 = new ArrayList<Integer>();
		db2.add(d1.test1);
		db2.add(d1.test2);
		db2.add(d1.test3);
		db2.add(demoservice.test().size()+1);
		
		return db2;
	}

	// like (포스트맨)--------------
	// 특정 콘테스트 좋아요
	@PostMapping("/like")
	@ResponseBody
	public List<Integer> like(@RequestParam int test1, @RequestParam int test2, @RequestParam int test3) {
		List<Integer> db2 = new ArrayList<Integer>();
//		db2.add(test1);
		db2.add(test2);
		db2.add(test3);

		return db2;
	}
	
	

}
