package com.kh.member.controller;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberManager {
	// 화면과 객체를 연결하는클래스
	
	// 회원 목록을 관리할 객체 배열
	Member m;
	ArrayList mb=new ArrayList();
	
	// 회원 배열을 최대로 담을 수 있는 공간 선언
	public static final int SIZE=10;
	
	// 현재 값이 담겨 있는 회원 수 카운트
	private static int count;
	
	Scanner sc=new Scanner(System.in); 
	
	// 초기화 블럭
	{
		
		mb.add(new Member("김금김","threekim","samkim","01033333333","kim@kim.kim",'M',20));
		mb.add(new Member("박점례","dotrae","park1","01022222222","jom@s.un",'F',87));
		mb.add(new Member("임정팔","eightjung","imsee","01011111111","nong@sa.wang",'M',91));
		mb.add(new Member("최막시무스","maxie","choi23","01044444444","max@i.e",'M',33));	
		count=4; // 초기화한 회원 수에 따른 카운트
	}
	
	// 생성자
	public MemberManager(){} // 초기화 블럭의 내용을 기본생성자에 넣어도 상관없다
	
	// Setter&Getter
	/*public void setCount(int count){
		MemberManager.count=count;
	}*/
	public int getCount(){
		return mb.size();
	}
	
	public void printAllMember(){
		for(Object o:mb){
			System.out.println(o.toString());
		}
	}
	
	// 회원 가입 기능 메소드
	public void insertMember(){
		
		System.out.print("이름 입력 : ");
		String name=sc.next();
			
		System.out.print("아이디 입력 : ");
		String id=sc.next();
			
		System.out.print("비밀번호 입력 : ");
		String password=sc.next();
			
		System.out.print("이메일 입력 : ");
		String email=sc.next();
			
		System.out.print("연락처 입력 : ");
		String phone=sc.next();
			
		System.out.print("성별 입력 : ");
		char gender=sc.next().charAt(0);
			
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
			
		mb.add(new Member(name,id,password,email,phone,gender,age));
			
			count++;				
	}
	
	// 회원 한 명의 아이디를 사용하여 해당 회원의 인덱스를 반환하는 메소드
	public int selectMember(){
		int idx=-1;//에러발생코드
		
		System.out.print("선택할 회원의 아이디 : ");
		String id=sc.next();
		
		for(int i=0;i<count;i++){
			if(((Member)mb.get(i)).getId().equals(id)){
				idx=i;
			}
		}
		
		return idx;
	}
	
	// 회원 정보 수정 기능 메소드
	public void updateMemberPassword(){
		int idx=selectMember();
		
		if(idx<0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		} else{
			System.out.println("현재 회원의 비밀번호 : ");
			System.out.println(((Member)mb.get(idx)).getPassword());
			System.out.print("변경할 비밀번호 : ");
			((Member)mb.get(idx)).setPassword(sc.next());
		}		
	}
	public void updateMemberEmail(){
		int idx=selectMember();
		
		if(idx<0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		} else{
			System.out.println("현재 회원의 이메일 : ");
			System.out.println(((Member)mb.get(idx)).getEmail());
			System.out.print("변경할 이메일 : ");
			((Member)mb.get(idx)).setEmail(sc.next());
		}		
	}
	public void updateMemberPhone(){
		int idx=selectMember();
		
		if(idx<0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		} else{
			System.out.println("현재 회원의 연락처 : ");
			System.out.println(((Member)mb.get(idx)).getPhone());
			System.out.print("변경할 연락처 : ");
			((Member)mb.get(idx)).setPhone(sc.next());
		}		
	}
	
	// 회원 한 명 정보 조회
	public void printOneMember(){
		int idx=selectMember();
		
		if(idx<0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		}else{
			System.out.println(mb.get(idx));
		}
	}
	
	// 회원 정보 삭제 기능 메소드
	public void deleteMember(){
		int idx=selectMember();
		
		if(idx<0){
			System.out.println("해당 아이디를 가진 회원이 없습니다.");
		}else{
			System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
			char answer=sc.next().toUpperCase().charAt(0);
			if(answer=='Y'){
				mb.remove(idx);
				count--;
			}else{
				System.out.println("메뉴 화면으로 돌아갑니다.");
				return;
			}
		}
	}
	
	public void sortAscName(){
		mb.sort(new AscNameSort());
	}
	
	public void sortDescName(){
		mb.sort(new DescNameSort());
	}
	
}
