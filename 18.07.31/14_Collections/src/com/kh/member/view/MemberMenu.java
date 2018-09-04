package com.kh.member.view;

import java.util.*;

import com.kh.member.controller.MemberManager;
import com.kh.member.model.vo.*;

public class MemberMenu {
	
	// private static Member m;
	
	// 회원 정보 관리를 위한 화면 메소드
	public static void menuView(){
		Scanner sc = new Scanner(System.in);
		MemberManager mm=new MemberManager();
		
		do{
			System.out.println("");
			System.out.println("== OOO's 회원 관리 프로그램 ==");
			System.out.println("총 가입 가능 회원 수: "+mm.SIZE);
			System.out.println("현재 가입한 회원수 : "+mm.getCount());
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 회원 정보 삭제");
			System.out.println("4. 전체 회원 정보 조회");
			System.out.println("5. 회원 한 명 정보 조회");
			System.out.println("6. 회원 이름별 오름차순 정렬하기");
			System.out.println("7. 회원 이름별 내림차순 정렬하기");
			System.out.println("9. 프로그램 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			switch(sel){
			case 1:
				mm.insertMember();
				break;
			case 2: 
				modifyMenu(mm);
				break;
			case 3:
				mm.deleteMember();
				break;
			case 4:
				mm.printAllMember();
				break;
			case 5:
				mm.printOneMember();
				break;
			case 6:
				mm.sortAscName();
				break;
			case 7:
				mm.sortDescName();
				break;
			case 9:
				System.out.print("정말로 종료하시겠습니까?(Y/N) : ");
				if(sc.next().toUpperCase().charAt(0) == 'Y'){
					System.out.println("프로그램을 종료합니다.");
					return;
				} else {
					System.out.println("다시 메뉴를 불러옵니다.");
					break;
				}
			default:
				System.out.println("잘못 입력 하셨습니다.");
			}
		}while(true);
	}
	
	public static void modifyMenu(MemberManager mm){
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("수정 메뉴입니다.");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 연락처 변경");
			System.out.println("4. 이전 메뉴로...");			
			System.out.println("-----------");
			System.out.print("메뉴 선택 : ");
			int sel=sc.nextInt();
			switch(sel){
			case 1:
				mm.updateMemberPassword();
				break;
			case 2:
				mm.updateMemberPassword();
				break;
			case 3:
				mm.updateMemberPassword();
				break;
			case 4:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;			
			default:
				System.out.println("잘못입력하쎳브니다");
			}
			
			
			
		}while(true);
	}
	

	
	
	
}




