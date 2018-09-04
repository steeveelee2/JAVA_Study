package com.kh.variable;

public class ChangeInfo {
	
	public void changeValue(){
		// 변수를 미리 선언하고 값을 입력한 후에
		// 변수에 저장된 값을 화면에 출력해보고
		// 스캐너를 사용해 해당 변수의 값을 변경해 보고
		// 화면에 출력하여 그 결과를 확인해보기
		
		// 1. 변수 선언 (개인정보)
		String name;
		int age;
		String phone;
		char gender;
		
		// ----------- //
		
		// 2. 선언한 변수에 값 입력하기
		name = "홍길동";
		age = 10;
		phone = "01011112222";
		gender = 'M';
		
		// ----------- //
		
		// 3. 입력받은 값 출력하기
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("연락처 : "+phone);
		System.out.println("성별 : "+gender);
		
		// --------------- //
		
		// 4. 스캐너를 선언하기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 5. 이미 등록되어 있는 변수의 값을
		//    스캐너 sc를 통해 변경하기
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.print("연락처를 입력하세요 (-제외): ");
		// sc.nextLine();
		phone = sc.next();
		
		System.out.print("성별을 입력하세요(M/F) : ");
		gender = sc.next().charAt(0);
		
		// male 이라고 입력 했다면
		// ^ 이 부분의 문자의 순서는 0번째가 된다.
		
		// 6. 변경한 값 출력하여 다시 확인하기
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("연락처 : " + phone);
		System.out.println("성별 : " + gender);
		
	}
}
