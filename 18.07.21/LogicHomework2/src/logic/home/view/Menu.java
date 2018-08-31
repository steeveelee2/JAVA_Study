package logic.home.view;

import logic.home.model.*;
import java.util.Scanner;

public class Menu {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void mainMenu(){
		
		do {
			System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");
			System.out.println("1. 변수 테스트");
			System.out.println("2. 기본 자료형 테스트");
			System.out.println("3. if문 테스트");
			System.out.println("4. switch문 테스트");
			System.out.println("5. for문 테스트");
			System.out.println("6. while문 테스트");
			System.out.println("7. do~while문 테스트");
			System.out.println("8. break문 테스트");
			System.out.println("9. continue문 테스트");
			System.out.println("10. static 메소드 사용 테스트");
			System.out.println("11. non-static 메소드 사용 테스트");
			System.out.println("12. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			switch(sc.nextInt()) {
			case 1:
				subVarMenu();
				break;
			case 2:
				subPTypeMenu();
				break;
			case 3:
				subIfMenu();
				break;
			case 4:
				subSwitchMenu();
				break;
			case 5:
				subForMenu();
				break;
			case 6:
				subWhileMenu();
				break;
			case 7:
				subDoWhileMenu();
				break;
			case 8:
				subBreakMenu();
				break;
			case 9:
				subContinueMenu();
				break;
			case 10:
				subStaticMethodMenu();
				break;
			case 11:
				subNonStaticMethodMenu();
				break;
			case 12:
				System.out.print("정말 종료하시겠습니까? (y/n) : ");
				if(sc.next().toLowerCase().charAt(0)=='y') {
					System.out.println("프로그램을 종료합니다.");
					return;
				}else {
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}
	
	public static void subVarMenu(){
		
		VariableSample v=new VariableSample();
		
		do {
			System.out.println("*** 변수 테스트 부메뉴 ***");
			System.out.println("1. 내 신상정보 변수에 담아 출력하기");
			System.out.println("2. 학생정보를 키보드로 입력받아 출력하기");
			System.out.println("3. 기본 자료형 변수의 초기값 확인하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				v.myProfile();
				break;
			case 2:
				v.studentInformation();
				break;
			case 3:
				v.defaultValue();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}
	
	public static void subPTypeMenu(){
		
		PrimitiveTypeSample p=new PrimitiveTypeSample();
		
		do {
			System.out.println("*** 기본자료형 테스트 부메뉴 ***");
			System.out.println("1. 기본자료형 메모리 할당크기 확인하기");
			System.out.println("2. 기본자료형 값의 최소값, 최대값 출력하기");
			System.out.println("3. 기본자료형 비트 갯수 확인하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				p.typeSize();
				break;
			case 2:
				p.minMaxValue();
				break;
			case 3:
				p.bitSize();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}
	
	public static void subIfMenu(){
		
		IfSample i=new IfSample();
		
		do {
			System.out.println("*** if문 테스트 부메뉴 ***");
			System.out.println("1. 두 개의 정수를 입력받아, 두 수 중 큰 값 출력하기");
			System.out.println("2. 두 개의 정수를 입력받아, 두 수 중 작은 값 출력하기");
			System.out.println("3. 세 개의 정수를 입력받아, 세 수 중 가장 큰 수와 가장 작은 수 출력하기");
			System.out.println("4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기");
			System.out.println("5. 국, 영, 수 세 과목의 점수를 입력받아 합격/불합격 확인하기");
			System.out.println("6. 점수를 입력받아, 학점 확인하기");
			System.out.println("7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기");
			System.out.println("8. 문자 하나를 입력받아, 영어 대문자인지 소문자인지 숫자인지 기타인지 확인하기");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			
			switch(sc.nextInt()) {
			case 1:
				i.maxNumber();
				break;
			case 2:
				i.minNumber();
				break;
			case 3:
				i.threeMaxMin();
				break;
			case 4:
				i.checkEven();
				break;
			case 5:
				i.isPassFail();
				break;
			case 6:
				i.scoreGrade();
				break;
			case 7:
				i.checkPlusMinusZero();
				break;
			case 8:
				i.whatCaracter();
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}
	
	public static void subSwitchMenu(){
		
		SwitchSample s=new SwitchSample();
		
		do {
			System.out.println("*** switch문 테스트 부메뉴 ***");
			System.out.println("1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기");
			System.out.println("2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				s.calculator();
				break;
			case 2:
				s.fruitPrice();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}	
	
	public static void subForMenu(){
		
		ForSample f=new ForSample();
		
		do {
			System.out.println("*** for문 테스트 부메뉴 ***");
			System.out.println("1. 1~10까지 정수들의 합계 구하기");
			System.out.println("2. 1~100사이의 짝수들의 합계 구하기");
			System.out.println("3. 정수하나 입력받아, 그 수의 구구단 출력하기");
			System.out.println("4. 두 개의 정수를 입력받아, 두 수 중 작은 값에서 큰 값까지의 합계 구하기");
			System.out.println("5. 줄 수와 칸 수 입력받아, 입력된 줄 수/칸 수만큼 별표 문자 출력하기");
			System.out.println("6. 7줄 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");
			System.out.println("7. 줄 수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수: 직각삼각형, 음수: 역삼각형");
			System.out.println("8. 구구단 2단부터 9단까지 출력하기");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 번호 입력 : ");
			
			switch(sc.nextInt()) {
			case 1:
				f.sum1To10();
				break;
			case 2:
				f.sumEven1To100();
				break;
			case 3:
				f.oneGugudan();
				break;
			case 4:
				f.sumMinToMax();
				break;
			case 5:
				f.printStar();
				break;
			case 6:
				f.printNumberStar();
				break;
			case 7:
				f.printTriangleStar();
				break;
			case 8:
				f.guguDan();
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}						
		}while(true);
		
	}
	
	public static void subWhileMenu(){
		
		WhileSample w=new WhileSample();
		
		do {
			System.out.println("*** while문 테스트 부메뉴 ***");
			System.out.println("1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복 종료)");
			System.out.println("2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)");
			System.out.println("3. 1~100 사이의 임의의 정수를 발생시켜, 숫자 알아맞추기");
			System.out.println("4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");
			System.out.println("5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기");
			System.out.println("6. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				w.printUniCode();
				break;
			case 2:
				w.sum1To100();
				break;
			case 3:
				w.numberGame();
				break;
			case 4:
				w.countCharacter();
				break;
			case 5:
				w.countInChar();
				break;
			case 6:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}
	
	public static void subDoWhileMenu(){
		
		DoWhileSample d=new DoWhileSample();
		
		do {
			System.out.println("*** do~while문 테스트 부메뉴 ***");
			System.out.println("1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기");
			System.out.println("2. 버거킹 메뉴 주문 테스트");
			System.out.println("3. 문자열 입력받아, \"모든 글자가 영문자다\"/\"모든 글자가 영문자는 아니다\" 출력하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				d.addDashToken();
				break;
			case 2:
				d.burgerKingMenu();
				break;
			case 3:
				d.isStringAlphabet();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}
	
	public static void subBreakMenu(){
		
		BreakSample b=new BreakSample();
		
		do {
			System.out.println("*** break문 테스트 부메뉴 ***");
			System.out.println("1. 1~100까지 정수들의 합계 출력하기(while문, break문 사용)");
			System.out.println("2. 구구단 1단~9단까지 출력하되, *5 계산에서 반복문 빠지기(break 이름 사용)");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				b.sumBreak();
				break;
			case 2:
				b.guguDanBreak();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}
	
	public static void subContinueMenu(){
		
		ContinueSample c=new ContinueSample();
		
		do {
			System.out.println("*** continue문 테스트 부메뉴 ***");
			System.out.println("1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기");
			System.out.println("2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				c.sumJumpThree();
				break;
			case 2:
				c.rowColJump();
				break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(true);
	}
	
	public static void subStaticMethodMenu(){
		
		StaticMethodSample s=new StaticMethodSample();
		
		do {
			System.out.println("*** static 메소드 사용 테스트 부메뉴 ***");
			System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력");
			System.out.println("2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기");
			System.out.println("3. Math 클래스의 두 정수 중 큰 값 구하는 메소드 : 120, 54 중 큰 값 출력하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				s.testMathRandom();
				break;
			case 2:
				s.testMathAbs();
				break;
			case 3:
				s.testMathMax();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(true);
		
	}
	
	public static void subNonStaticMethodMenu(){
		
		NonStaticMethodSample n=new NonStaticMethodSample();
		
		do {
			System.out.println("*** non-static 메소드 사용 테스트 부메뉴 ***");
			System.out.println("1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기");
			System.out.println("2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기");
			System.out.println("3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기");
			System.out.println("4. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			
			switch(sc.nextInt()) {
			case 1:
				n.testScanner();
				break;
			case 2:
				n.testDate();
				break;
			case 3:
				n.testRandom();
				break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}			
		}while(true);
		
	}	

}