package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	// 변수들을 통제하는 클래스
	
	// 최대 회원수를 상수로 지정(모든 클래스에서 통용되기때문에 static)
	public static final int SIZE=10;
	// 현재 회원수를 기록할 변수(유동적인 수치라 상수X)
	public static int memberCount=0;
	// 스캐너 많이 쓸거라 선언
	Scanner sc=new Scanner(System.in);
	// 멤버 클래스의 변수를 다루어야 하기 때문에 SIZE 크기의 객체배열 선언
	private Member[] mArr=new Member[SIZE];
	
	// 회원 정보를 기록하는 메소드
	public void memberInput() {
		// 키보드로 값을 입력받아서 생성자를 통해 값 부여하기
		
		// 회원이 꽉 차면 등록을 하지 못하도록 if문 구성
		if(memberCount==SIZE) {
			System.out.println("정원이 초과되었습니다.");
		}else {
			System.out.print("아이디 입력 : ");
			String id=sc.next();
			System.out.print("이름 입력 : ");
			String name=sc.next();
			System.out.print("비밀번호 입력 : ");
			String password=sc.next();
			System.out.print("이메일 입력 : ");
			String email=sc.next();
			System.out.print("성별 입력 : ");
			char gender=sc.next().toLowerCase().charAt(0); // 통일성을 위해 소문자로 저장
			System.out.print("나이 입력 : ");
			int age=sc.nextInt();
			
			// 생성자에 쑤셔넣기 (동시에 카운트를 올린다)
			mArr[memberCount++]=new Member(id,name,password,email,gender,age);			
		}		
	}
	
	// 아이디를 통해 유효성을 체크하는 메소드 
	public int selectMemberId(String id) {
		// 기본 인덱스는 -1, 아이디를 받아와 유효성 체크 후 계정이 존재한다면 해당 인덱스를 반환한다
		int idx=-1;
		
		for(int i=0;i<memberCount;i++) {
			if(mArr[i].getId().equals(id)) {
				idx=i; // 아이디가 존재한다면 인덱스 갱신
			}
		}
		return idx;
	}
	
	// 이름으로 체크하는 메소드	
	public int selectMemberName(String name) {
		int idx=-1;
		
		for(int i=0;i<memberCount;i++) {
			if(mArr[i].getName().equals(name)) {
				idx=i;
			}
		}
		return idx;
	}
	
	// 이메일로 체크하는 메소드
	public int selectMemberEmail(String email) {
		int idx=-1;
		
		for(int i=0;i<memberCount;i++) {
			if(mArr[i].getEmail().equals(email)) {
				idx=i;
			}
		}
		return idx;
	}
	
	// 인덱스에 따라 결과를 반환하는 메소드 (자주 사용하기 때문에 따로 작성)
	public void resultDist(int idx) {		
		if(idx<0) {
			System.out.println("해당하는 회원이 없습니다.");
		}else {
			System.out.println(mArr[idx].memberInfo());
		}
	}
	
	// 배열 스왑하는 메소드 (역시 자주 사용해서 따로 작성)
	public void swap(int j) {
		Member tmp=mArr[j];
		mArr[j]=mArr[j+1];
		mArr[j+1]=tmp;
	}
	
	// 회원 정보를 삭제하는 메소드
	public void deleteMember() {
		// 1. 삭제할 아이디의 비밀번호를 체크한다
		// 2. 맞다면 정말 삭제할 것인지 묻고 처리한다
		// 3. 삭제 한 후 배열을 앞당겨 빈 공간이 없도록 한다
		
		System.out.print("삭제할 아이디 : ");
		int idx=selectMemberId(sc.next()); // 아이디가 있는지 찾아서 인덱스를 반환받는다
		
		if(idx<0) {
			System.out.println("해당하는 회원이 없습니다.");
		}else {
			System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
			if(sc.next().toLowerCase().charAt(0)=='y') { // 대문자든 소문자든 y를 입력할 경우 데이터 삭제				
				for(int i=idx;i<memberCount;i++) {
					if(i==memberCount-1) {
						mArr[idx]=null; // 마지막 배열이라면 그냥 삭제
					}else {
						mArr[idx]=null;
						mArr[i]=mArr[i+1]; // 마지막 배열이 아니라면 앞당김
					}
				} memberCount--; // for구문이 끝나면 카운트 -1
			}
		}		
	}
	
	// 모든 회원 정보를 출력하는 메소드
	public void printAllMember() {
		for(int i=0;i<memberCount;i++) {
			System.out.println(mArr[i].memberInfo()); // 반복문을 통해 전부 출력한다
		}
	}
	
	// 아이디 체크 메소드와 검색 메뉴를 이어주는 메소드
	public void searchMemberId() {
		System.out.print("검색할 아이디 : ");
		int idx=selectMemberId(sc.next());
		
		// 인덱스에 따라 결과를 반환한다
		resultDist(idx);
	}
	
	// 이름 체크 메소드와 검색 메뉴를 이어주는 메소드
	public void searchMemberName() {
		System.out.print("검색할 이름 : ");
		int idx=selectMemberName(sc.next());
		resultDist(idx);
	}
	
	// 이메일 체크 메소드와 검색메뉴를 이어주는 메소드
	public void searchMemberEmail() {
		System.out.print("검색할 이메일 : ");
		int idx=selectMemberEmail(sc.next());
		resultDist(idx);
	}
	
	// 이름 오름차순 정렬 메소드
	public void sortIdAsc() {
		// 버블정렬 이용
		for(int i=0;i<memberCount-1;i++) {
			for(int j=0;j<memberCount-1-i;j++) {
				if(mArr[j].getName().compareTo(mArr[j+1].getName())>0) {
					// 만들어둔 swap메소드 이용
					swap(j); //compareTo를 이용하여 오름차순으로 잘 스까준다
				}
			}
		}
		printAllMember(); // 정렬 후 모든 회원 출력 메소드를 통해 정렬되었음을 보여준다
	}
	
	// 이름 내림차순 정렬 메소드
	public void sortIdDes() {
		for(int i=0;i<memberCount-1;i++) {
			for(int j=0;j<memberCount-1-i;j++) {
				if(mArr[j].getName().compareTo(mArr[j+1].getName())<0) {
					swap(j); 
				}
			}
		}
		printAllMember();
	}
	
	// 나이 오름차순 정렬 메소드
	public void sortAgeAsc() {
		for(int i=0;i<memberCount-1;i++) {
			for(int j=0;j<memberCount-1-i;j++) {
				if(mArr[j].getAge()>mArr[j+1].getAge()) { // 나이는 int이기 때문에 그냥 비교하면 된다
					swap(j); 
				}
			}
		}
		printAllMember();
	}
	
	// 나이 내림차순 정렬 메소드
	public void sortAgeDes() {
		for(int i=0;i<memberCount-1;i++) {
			for(int j=0;j<memberCount-1-i;j++) {
				if(mArr[j].getAge()<mArr[j+1].getAge()) {
					swap(j); 
				}
			}
		}
		printAllMember();
	}
	
	// 성별 내림차순 정렬 메소드
	public void sortGenderDes() {
		for(int i=0;i<memberCount-1;i++) {
			for(int j=0;j<memberCount-1-i;j++) {
				if(mArr[j].getGender()<mArr[j+1].getGender()) { // char이라 걍 비교가능
					swap(j); 
				}
			}
		}
		printAllMember();
	}
	
	// 암호 변경 메소드
	public void modifyPassword() {
		System.out.print("검색할 아이디 : ");
		int idx=selectMemberId(sc.next());
		resultDist(idx); // 인덱스를 계속 활용해야한다
		
		System.out.print("변경할 암호 : ");
		mArr[idx].setPassword(sc.next()); // 인덱스를 통해 배열에 새로운 암호를 저장
		System.out.println("회원의 정보가 변경되었습니다.");
	}
	
	// 이메일 변경 메소드
	public void modifyEmail() {
		System.out.print("검색할 아이디 : ");
		int idx=selectMemberId(sc.next());
		resultDist(idx);
		
		System.out.print("변경할 이메일 : ");
		mArr[idx].setEmail(sc.next());
		System.out.println("회원의 정보가 변경되었습니다.");
	}
	
	// 나이 변경 메소드
	public void modifyAge() {
		System.out.print("검색할 아이디 : ");
		int idx=selectMemberId(sc.next());
		resultDist(idx);
			
		System.out.print("변경할 나이 : ");
		mArr[idx].setAge(sc.nextInt());
		System.out.println("회원의 정보가 변경되었습니다.");
	}

}
