package com.example.demo.server.data;

import lombok.Getter;

@Getter
public enum DmResponseCode {
	
	SUCCESS(100, "성공"), 
	FAIL(200, "실패"),
	FAIL_ALREADY_APPLYED(201, "이미 신청된 방입니다."),
	FAIL_ALREADY_ENTERED(202, "이미 입장된 방입니다.");
	
	// 결과 코드
	private int code;
	// 결과 메시지
	private String msg;
	
	DmResponseCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}	
}
