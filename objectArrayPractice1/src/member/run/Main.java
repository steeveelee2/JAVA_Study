package member.run;

import member.view.MemberMenu;

public class Main {

	public static void main(String[] args) {
		// 메인 클래스(주 메뉴를 불러오는 역할만 수행)
		MemberMenu mMenu=new MemberMenu();
		mMenu.mainMenu();
		
		// 종료했을때 안내멘트 추가
		System.out.println("회원관리 프로그램을 종료합니다.");

	}

}
