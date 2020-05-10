package com.example.demo.server.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DmResponseMsg {
	
	// 결과 코드
	private int resCode;
	// 결과 메시지
	private String resMsg;
	// 결과 Object
	private Object result;	
}