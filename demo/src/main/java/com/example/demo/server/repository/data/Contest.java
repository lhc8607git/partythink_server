package com.example.demo.server.repository.data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contest")
public class Contest {
	// 연습용 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private @Column(name = "id") int id;
	
	//공모전 이름/설명
	private @Column(name = "name") String name;
	private @Column(name = "intro") String intro;
	
	//공모전 분야/부문
	/**
	 * 알고리즘 : Algorithm
	 * 디자인 : Design
	 * 임베디드 : Embedded
	 * 빅데이터 : Bigdata
	 * 모바일 : Mobile
	 * 게임 : Game
	 * 블록체인 : Blockchain
	 * 해킹보안 : Security
	 */
	private @Column(name = "field") String field;
	private @Column(name = "department") String department;
	
	//공모전 주최명/지역명
	private @Column(name = "organizationName") String organizationName;
	private @Column(name = "organizationArea") String organizationArea;
	
	//공모전 접수기간
	private @Column(name = "subStart") LocalDateTime subStart;
	private @Column(name = "subEnd") LocalDateTime subEnd;
	
	//공모전 예선기간
	private @Column(name = "preStart") LocalDateTime preStart;
	private @Column(name = "preEnd") LocalDateTime preEnd;
	
	//공모전 본선기간
	private @Column(name = "onStart") LocalDateTime onStart;
	private @Column(name = "onEnd") LocalDateTime onEnd;
	
	//공모전 좋아요
	private @Column(name = "likeNum") int likeNum;
	
	//공모전 URL
	private @Column(name = "homepageURL") String homepageURL;
	
	//공모전 이미지 (URL)
	private @Column(name = "imageURL") String imageURL;
	
	//공모전 추가자료 (URL)
	private @Column(name = "attachedFileURL") String attachedFileURL;
}