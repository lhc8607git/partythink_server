package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.server.repository.data.Contest;
import com.example.demo.service.DmContestService;

@Controller
@RequestMapping("/contest")
public class DmContestController {
	
	@Autowired
	DmContestService contestService;
	
	@GetMapping("/demoinfos")
	@ResponseBody
	public List<Contest> contests(){
		List<Contest> list = contestService.getContests();
		return list;
	}
	
	

}
