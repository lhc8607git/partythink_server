package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.server.data.DmResponseCode;
import com.example.demo.server.data.DmResponseMsg;
import com.example.demo.server.repository.data.Contest;
import com.example.demo.service.DmContestService;


@Controller
@RequestMapping("/contest")
public class DmContestController {
	
	@Autowired
	DmContestService contestService;
	
	// 모든 콘테스트 조회
	@PostMapping("/dminfos")
	@ResponseBody
	public List<Contest> contests(){
		List<Contest> list = contestService.getContests();
		return list;
	}
	
	
	// 특정 분야의 모든 콘테스트 조회 
    // ex) 검색 -> /dminfoByField?field=Algorithm
	@PostMapping("/dminfoByField")
    @ResponseBody
    public List<Contest> contest(String field) {
		return contestService.getContestByField(field);
	}

	
	// 특정 콘테스트 하나 조회 
	// ex) 검색 -> /dminfo/2
    @PostMapping("/dminfo/{contestId}")
    @ResponseBody
    public Contest contest(@PathVariable int contestId) {
    	return contestService.getContest(contestId);
    }
    
    
	// 특정 콘테스트 "좋아요+1"기능
    @PostMapping("/dmlike")
    @ResponseBody
    public DmResponseMsg like(@RequestParam int contestId) {
    	
    	Contest result = contestService.updateContest(contestId);
    	if(result != null) {
    		DmResponseMsg res = new DmResponseMsg();
    		res.setResCode(DmResponseCode.SUCCESS.getCode());
    		res.setResMsg(DmResponseCode.SUCCESS.getMsg());
    		res.setResult(result);
    		return res;
    	}
    	else {
    		DmResponseMsg res = new DmResponseMsg();
    		res.setResCode(DmResponseCode.FAIL.getCode());
    		res.setResMsg(DmResponseCode.FAIL.getMsg());
    		return res;
    	}
    }
  
    
    
    
    
	// 연습
//	@PostMapping("/ppp")
//	@ResponseBody
//	public List<String> contestssss(){
//		List<String> list = new ArrayList<>();
//		list.add("aaaaa");
//
//		
//		return list;
//	}
	

}
