package com.kh.member.run;

import com.kh.member.controller.MemberManager;
import com.kh.member.model.vo.*;

public class Main {

	public static void main(String[] args) {
		// 각 회원별 등급 확인 테스트
		
		MemberManager m = new MemberManager();
		
		// 실버 등급 회원 저장
		m.insertSilver(new Silver("홍길동", "실버", 1000));
		m.insertSilver(new Silver("고길동", "실버", 2000));
		m.insertSilver(new Silver("박길동", "실버", 3000));
		
		// 골드 등급 회원 저장
		m.insertGold(new Gold("김유신", "골드", 10000));
		m.insertGold(new Gold("황유신", "골드", 20000));
		m.insertGold(new Gold("최유신", "골드", 30000));
		
		// vip 등급 회원 저장
		m.insertVip(new VIP("이성계", "VIP", 100000));
		m.insertVip(new VIP("왕건", "VIP", 200000));
		m.insertVip(new VIP("대조영", "VIP", 300000));
		
		// vvip 등급 회원 저장
		m.insertVVip(new VVIP("광개토대왕", "VVIP", 500000));
		
		// 저장한 회원 정보 출력
		m.memberPrint();
		
	}

}
