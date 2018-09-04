package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	// 화면 제공용 클래스 (최소한의 처리 외엔 전부 멤버 매니저 클래스에게 맡긴다)
	
	// 필드에 스캐너와 매니저 객체 생성
	private Scanner sc=new Scanner(System.in); // 각 메소드마다 스캐너 초기화 할수도 있지만 귀찮아서 필드에서 초기화
	private MemberManager mManager;
	
	// 기본 생성자
	public MemberMenu() {}
	
	// 주 메뉴 메소드
	public void mainMenu() {
		mManager=new MemberManager(); // 초기화
		do { // 반복출력을 위한 do-while구문
			
			// 매니저 클래스의 사이즈, 카운트 불러오기
			System.out.println("최대 등록 가능한 회원수는 "+MemberManager.SIZE+"명 입니다.");
			System.out.println("현재 등록된 회원수는 "+MemberManager.memberCount+"명 입니다.");
			
			System.out.println("***** 회원 관리 프로그램 *****");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");			
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) { // 키보드로 입력받은 값을 바로 switch 구문으로 처리
			case 1:
				mManager.memberInput(); // 매니저 객체를 통해 메소드 이동
				break;
			case 2:
				searchMenu(); // 같은 클래스 내
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.print("정말로 끝내시겠습니까? (y/n) : ");
				if(sc.next().toLowerCase().charAt(0)=='y') { // 대문자든 소문자든 y를 입력할 경우 return을 통해 종료
					return;
				} else {
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다."); // break 필요 없음
			}			
		}while(true);		
	}
	
	// 조회 메뉴 메소드
	public void searchMenu() {
		do {
			System.out.println("***** 회원 정보 검색 메뉴 *****");
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");			
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				mManager.searchMemberId();
				break;
			case 2:
				mManager.searchMemberName();
				break;
			case 3:
				mManager.searchMemberEmail();
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);		
	}
	
	// 정렬 메뉴 메소드
	public void sortMenu() {
		do {
			System.out.println("***** 회원 정보 정렬 출력 메뉴 *****");
			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
			System.out.println("9. 이전 메뉴로 가기");			
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				mManager.sortIdAsc();
				break;
			case 2:
				mManager.sortIdDes();
				break;
			case 3:
				mManager.sortAgeAsc();
				break;
			case 4:
				mManager.sortAgeDes();
				break;
			case 5:
				mManager.sortGenderDes();
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);		
	}
	
	// 수정 메뉴 메소드
	public void modifyMenu() {
		do {
			System.out.println("***** 회원 정보 수정 메뉴 *****");
			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");			
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				mManager.modifyPassword();
				break;
			case 2:
				mManager.modifyEmail();
				break;
			case 3:
				mManager.modifyAge();
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);		
	}

}
