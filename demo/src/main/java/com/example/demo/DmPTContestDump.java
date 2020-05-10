package com.example.demo;

import java.time.LocalDateTime;

import com.example.demo.server.repository.ContestRepository;
import com.example.demo.server.repository.data.Contest;



public class DmPTContestDump {
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
	
	//전체
	//대학부
	//청소년부
	
	
	public static void insertContestDump(ContestRepository contestRepo) {
		/**
		 * Algorithm
		 */
		{
			Contest contest = new Contest();
			contest.setName("제4회 국민대학교 알고리즘 대회");
			contest.setIntro("국민*인의 소프트웨어에서 국민 모두의 소프트웨어로 제4회 국민대학교 알고리즘 대회는 소프트웨어와 알고리즘, 프로그래밍에 관심 있는 고등학생들이라면 누구나 참가할 수 있는 새로운 도전의 장입니다.국민대학교 소프트웨어융합대학은 본 대회를 통하여 창의적인 소프트웨어 개발능력을 보유한 고등학생을 발굴, 4차 산업혁명의 초석으로 육성하고자 합니다.본 대회는 국민대학교 소프트웨어융합대학과 SW중심대학사업단에서 주관하며 ㈜그렙(Grepp, Inc.)에서 후원합니다.");
			contest.setField("Algorithm");
			contest.setDepartment("청소년부");
			contest.setOrganizationName("국민대학교");  //주최자
			contest.setOrganizationArea("서울");
			contest.setSubStart(LocalDateTime.of(2019, 7, 1, 0, 0, 0)); //접수시작
			contest.setSubEnd(LocalDateTime.of(2019, 5, 10, 0, 0, 0));   //접수마감
			contest.setOnStart(LocalDateTime.of(2019, 6, 14, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 8, 24, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.kookmin.ac.kr/storage/CALENDAR/event/1560499584.png"); //이미지
			contest.setHomepageURL("http://softwarecontest.kookmin.ac.kr/"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
	
		
		/**
		 * Design
		 */
		{
			Contest contest = new Contest();
			contest.setName("KOTRA 해외전시 한국관 공간디자인 공모전");
			contest.setIntro("디자인 전문가, 전공 학생 등의 창의적이고 참신한 의견을 수렴하여 한국관 디자인 개선에 활용하기 위해 글로벌 전시 트렌드 및 한국의 상징성을 반영한 한국관 디자인 개발 공모를 진행합니다.");
			contest.setField("Design");
			contest.setDepartment("대학부");
			contest.setOrganizationName("KOTRA");  //주최자
			contest.setOrganizationArea("서울");
			contest.setSubStart(LocalDateTime.of(2019, 9, 19, 0, 0, 0)); //접수시작
			contest.setSubEnd(LocalDateTime.of(2019, 10, 31, 0, 0, 0));   //접수마감
			contest.setOnStart(LocalDateTime.of(2019, 9, 19, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 29, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20190923153518_307d479b.jpg"); //이미지
			contest.setHomepageURL("http://www.allcomm.co.kr/"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("2019 미니소 어워드 MINISO AWARD");
			contest.setIntro("THE POWER OF DESIGN’ 이라는 주제로 디자인을 사랑하고 관심을 갖고 있는 모든 사람들을 위한 오리지널 프로덕트 대회로써 디자인이 개발 공모를 진행 합니다.");
			contest.setField("Design");
			contest.setDepartment("전체");
			contest.setOrganizationName("미니소,인튠드");  //주최자
			contest.setOrganizationArea("경기"); //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0)); //접수시작
			contest.setSubEnd(LocalDateTime.of(2019, 11, 13, 0, 0, 0));   //접수마감
			contest.setOnStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 12, 5, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20191023231440_163e28f6.jpg"); //이미지
			contest.setHomepageURL("http://www.intund.com/miniso/award_about.php"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("2019 전라남도 콘텐츠 창작 공모전<전남에 캐릭터를 더+하다>");
			contest.setIntro("전라남도 22개 시ㆍ군의 축제, 관광지, 문화재 등에 얽힌 문학(설화, 전설)을 대표할 수 있는 캐릭터 디자인 개발 공모를 진행합니다.");
			contest.setField("Design");
			contest.setDepartment("전체");
			contest.setOrganizationName("전남콘테츠닷컴");  //주최자
			contest.setOrganizationArea("전라남도"); //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 11, 13, 0, 0, 0)); //접수시작
			contest.setSubEnd(LocalDateTime.of(2019, 11, 15, 0, 0, 0));   //접수마감
			contest.setOnStart(LocalDateTime.of(2019, 10, 17, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 15, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20191018201245_881080aa.jpg"); //이미지
			contest.setHomepageURL("http://jncontents.com/main/"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("태안산업 브랜드네임 네이밍·로고 공모전");
			contest.setIntro("네이밍과 로고 공모전 함께 동시 지원을 했을 시 참여가능한 공모전입니다.");
			contest.setField("Design");
			contest.setDepartment("전체");
			contest.setOrganizationName("(주)태안산업");  //주최자
			contest.setOrganizationArea("충청남도"); //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 11, 1, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 30, 0, 0, 0));   //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 11, 1, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 12, 9, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.thinkcontest.com/ufiles/contest/a78066bbbd169dee3b0a785229b1371f5b17e004.png"); //이미지
			contest.setHomepageURL("https://taeanidea.modoo.at/"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("2019 제 2회 한국가스공사 홍보콘텐츠 공모전");
			contest.setIntro("한국가스공사 및 청정에너지를 쉽고 재미있게 영상,징글,굿즈디자인,이미지로 소개해주세요!");
			contest.setField("Design");
			contest.setDepartment("전체");
			contest.setOrganizationName("부산정보산업진흥원");  //주최자
			contest.setOrganizationArea("서울");  //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 1, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 4, 0, 0, 0));   //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 1, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 12, 1, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(20);
			contest.setImageURL("https://s3.ap-northeast-2.amazonaws.com/media.linkareer.com/activity_manager/posters/2019-10-021249186921300_f5f67a41770065fe017450c4391fb102de48edf4.png"); //이미지
			contest.setHomepageURL("http://www.한국가스공사콘텐츠공모전.com/"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("물과 사람 사진 공모전");
			contest.setIntro("한 컷으로 담아낸 물의 순간들을 이미지로 표현해주세요!");
			contest.setField("Design");
			contest.setDepartment("전체");
			contest.setOrganizationName("할리스커피,OB좋은세상");  //주최자
			contest.setOrganizationArea("서울");  //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 4, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 3, 0, 0, 0));   //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 4, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 20, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(3);
			contest.setImageURL("http://www.civilnet.net/xe/files/attach/images/2552/002/199/f6530330f9163ebfc3fc8826d88c7371.jpg"); //이미지
			contest.setHomepageURL("http://waterandhuman.kr/"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("순천 3E 프로젝트 영상콘텐츠 공모전");
			contest.setIntro("순천시만의 자원을 바탕으로 지속가능한 도시 성장 동력을 갖추기 위한‘3E 프로젝트’를널리 알릴 수 있는 기발한 홍보 콘텐츠를 발굴하고자 순천 3E 프로젝트 영상콘텐츠 공모전을 진행합니다.");
			contest.setField("Design");
			contest.setDepartment("전체");
			contest.setOrganizationName("순천시");  //주최자
			contest.setOrganizationArea("순천");  //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 1, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 14, 0, 0, 0));   //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 1, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 12, 1, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://s3.ap-northeast-2.amazonaws.com/media.linkareer.com/activity_manager/posters/2019-10-161656447173840_ea0e6caf828e34790467ec71c1d142cb0500c9c5.jpg"); //이미지
			contest.setHomepageURL("http://www.suncheon.go.kr/kr/news/0004/0005/0001/?eminwonMode=VIEW&seq=33410"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		
		/**
		 * Embedded
		 */
		{
			Contest contest = new Contest();
			contest.setName("제 17회 임베디드 소프트웨어 경진대회");
			contest.setIntro("당신의 상상이 현실이 되는 스토리, 임베디드 소프트웨어 경진대회");
			contest.setField("Embedded");
			contest.setDepartment("전체");
			contest.setOrganizationName("산업통산자원부");
			contest.setOrganizationArea("서울");
			contest.setSubStart(LocalDateTime.of(2019, 04, 29, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 05, 29, 0, 0, 0)); //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 04, 29, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 12, 30, 0, 0, 0));   //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));
			contest.setLikeNum(0);
			contest.setImageURL("http://kessia.kr/images/embedded/contest/17thPresentation/ContestPresentation1.jpg");
			contest.setHomepageURL("http://www.eswcontest.com/htm/main.php");
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		
		/**
		 * Bigdata
		 */
		{
			Contest contest = new Contest();
			contest.setName("제1회 문화체육관광빅데이터 활용 아이디어 공모전");
			contest.setIntro("문화체육관광빅데이터를 활용한 대국민 서비스 아이디어");
			contest.setField("Bigdata");
			contest.setDepartment("전체"); 
			contest.setOrganizationName("문화체육관광부");  //주최자
			contest.setOrganizationArea("서울");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 1, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 6, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("http://www.detizen.com/uploads/contest/2019/CONTEST_20191024170209_2241245.jpg"); //이미지
			contest.setHomepageURL("https://www.culture.go.kr/data/bigContest/main.do"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("2019 금융 빅데이터 활용 아이디어 공모전");
			contest.setIntro("금융 빅데이터 플랫폼의 데이터를 활용한 금융 서비스 및 사업 아이디어");
			contest.setField("Bigdata");
			contest.setDepartment("전체"); 
			contest.setOrganizationName("비씨카드");  //주최자
			contest.setOrganizationArea("서울");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 8, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 22, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://cfile1.onoffmix.com/images/event/197799/s"); //이미지
			contest.setHomepageURL("https://onoffmix.com/event/197799"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("스마트팜 빅데이터 활용 아이디어 공모전");
			contest.setIntro("데이터로 더욱 스마트해지는 스마트팜");
			contest.setField("Bigdata");
			contest.setDepartment("전체"); 
			contest.setOrganizationName("농림수산식품교육문화정보원");  //주최자
			contest.setOrganizationArea("세종");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 4, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 3, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 4, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 10, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20191011203549_579a2e90.jpg"); //이미지
			contest.setHomepageURL("http://www.smartfarmkorea.net/board/view.do?menuId=M010705&searchBbsId=BBSMSTR_000000000021&searchNttId=2653"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("2019 학생 빅데이터 분석 경진대회");
			contest.setIntro("빅데이터 활용 아이디어 및 빅데이터 분석");
			contest.setField("Bigdata");
			contest.setDepartment("전체"); 
			contest.setOrganizationName("한밭대학교");  //주최자
			contest.setOrganizationArea("대전");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 25, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 5, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 25, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 22, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20191026132855_f732d922.jpg"); //이미지
			contest.setHomepageURL("https://www.hanbat.ac.kr/_prog/gboard/board.php?code=news&mode=view&no=746067&parentno=746067"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("제6회 엘포인트 빅데이터 컴피티션");
			contest.setIntro("제6회 엘포인트 빅데이터 컴피티션 (L.POINT Big Data Competition)");
			contest.setField("Bigdata");
			contest.setDepartment("대학부");
			contest.setOrganizationName("롯데멤버스");  //주최자
			contest.setOrganizationArea("서울");
			contest.setSubStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0)); //접수시작
			contest.setSubEnd(LocalDateTime.of(2019, 11, 26, 0, 0, 0));   //접수마감
			contest.setOnStart(LocalDateTime.of(2019, 10, 21, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2020, 2, 18, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(1);
			contest.setImageURL("https://cdnweb01.wikitree.co.kr/webdata/editor/201910/17/img_20191017084803_59643c31.jpg.webp"); //이미지
			contest.setHomepageURL("https://competition.lpoint.com/index.tran"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("2019미래에셋대우 대학생 디지털 금융 페스티벌");
			contest.setIntro("2019미래에셋대우 대학생 디지털 금융 페스티벌");
			contest.setField("Bigdata");
			contest.setDepartment("대학부");
			contest.setOrganizationName("미래에셋대우");  //주최자
			contest.setOrganizationArea("서울");
			contest.setSubStart(LocalDateTime.of(2019, 9, 9, 0, 0, 0)); //접수시작
			contest.setSubEnd(LocalDateTime.of(2019, 10, 4, 0, 0, 0));   //접수마감
			contest.setOnStart(LocalDateTime.of(2019, 9, 9, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 8, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20198210181/20190917101844_f0e8e275.jpg"); //이미지
			contest.setHomepageURL("https://www.miraeassetdaewoo.com/hki/hki7110/n01.do"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		
		/**
		 * Mobile
		 */
		{
			Contest contest = new Contest();
			contest.setName("무장애여행 관광지 길안내 모바일앱 명칭 공모전");
			contest.setIntro("편의시설, 이동약자 추천코스 등의 정보를 제공하고 관광지내 출발지와 목적지를 설정하여 음성으로 안내");
			contest.setField("Mobile");
			contest.setDepartment("전체"); 
			contest.setOrganizationName("무장애여행 관광지 길안내 구축 사업단");  //주최자
			contest.setOrganizationArea("제주");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 14, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 3, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 14, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 12, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20191017161343_3c88814c.jpg"); //이미지
			contest.setHomepageURL("https://jejudsi.kr/notice/notice.htm?act=view&seq=60"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("2019년 서울시 앱 공모전");
			contest.setIntro("스마트폰 애플리케이션");
			contest.setField("Mobile");
			contest.setDepartment("전체"); 
			contest.setOrganizationName("서울특별시");  //주최자
			contest.setOrganizationArea("서울");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 8, 1, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 9, 30, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 7, 31, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 8, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(13);
			contest.setImageURL("https://www.seoulappcontest.org/_img/mo/main/visual.jpg"); //이미지
			contest.setHomepageURL("https://www.seoulappcontest.org/"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		
		/**
		 * Game
		 */
		{
			Contest contest = new Contest();
			contest.setName("2019 폴리곤에이드 VR 콘텐츠 공모전");
			contest.setIntro("폴리곤에이드 갤러리에 은거하고 있는 VR 코딩 장인을 찾습니다.");
			contest.setField("Game");
			contest.setDepartment("청소년부"); 
			contest.setOrganizationName("(주)에이다코딩랩");  //주최자
			contest.setOrganizationArea("서울");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 10, 8, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 4, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 10, 8, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 11, 18, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20191010152020_41ec65d7.jpg"); //이미지
			contest.setHomepageURL("http://adacodinglab.com/153"); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		{
			Contest contest = new Contest();
			contest.setName("제4회 Bu:Star 챌린지 게임공모전");
			contest.setIntro("부산정보산업진흥원에서 부산·경남지역의 창의적이고 독창적인 게임콘텐츠 발굴과 게임 개발 역량을 지닌 예비 창업자 육성을 위하여「제4회 Bu:Star 챌린지 게임 공모전」을 개최");
			contest.setField("Game");
			contest.setDepartment("대학부"); 
			contest.setOrganizationName("부산정보산업진흥원");  //주최자
			contest.setOrganizationArea("부산");   //주최/주관 지역
			contest.setSubStart(LocalDateTime.of(2019, 11, 1, 0, 0, 0)); //접수시작(신청접수)
			contest.setSubEnd(LocalDateTime.of(2019, 11, 11, 0, 0, 0));    //접수마감(신청종료)
			contest.setOnStart(LocalDateTime.of(2019, 11, 1, 0, 0, 0));  //시작날짜 (접수 or 아애 시작 날짜)
			contest.setOnEnd(LocalDateTime.of(2019, 12, 6, 0, 0, 0));     //종료날짜 (아애 끝나는 날짜)
			contest.setPreStart(LocalDateTime.of(2019, 1, 1, 0, 0, 0)); //예선시작
			contest.setPreEnd(LocalDateTime.of(2019, 1, 1, 0, 0, 0));   //예선종료
			contest.setLikeNum(0);
			contest.setImageURL("https://www.wevity.com/upload/contest/20190829174252_f5a9df2b.jpg"); //이미지
			contest.setHomepageURL("http://www.busanit.or.kr/board/view.asp?bidx=8774&bcode=notice&ipage=3&sword=&search_txt="); //홈페이지url
			contest.setAttachedFileURL("");
			contestRepo.save(contest);
		}
		
	}
	
}
