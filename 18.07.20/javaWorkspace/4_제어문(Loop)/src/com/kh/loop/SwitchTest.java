package com.kh.loop;

import java.util.*;

public class SwitchTest {
	// switch 문은 특정 조건문을
	// 작성하는 것이 아니라
	// 해당 값이 무엇인지 비교를 하여
	// 그 값에 대한 문장을 실행하는 문법
	// 사용 형식
	// int menoNum = 000;
	//
	// switch(menoNum) {
	//     case 1: . . . break;
	//     case 2: . . . break;
	//     default: . . . [break];
	// }

	Scanner sc = new Scanner(System.in);

	public void testSwitch1(){
		// switch를 활용한 과일 메뉴
		// 구현하기
		
		System.out.println("-- OOO's 과일가게 --");
		System.out.println("1. 수박");
		System.out.println("2. 키위");
		System.out.println("3. 메론");
		System.out.println("4. 포도");
		System.out.println("5. 블루베리");
		System.out.println("------------------");
		
		// 1. 안내 문구
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 과일을 선택하세요 : ");
		int select = sc.nextInt();
		
		// switch문을 활용한 과일 선택
		switch(select){ 
		   // select 변수의 값을 가지고 선택하겠다.
			case 1:  
				// if(select == 1)
				System.out.println("수박을 선택하였습니다.");
				break; // 해당 case 구문의 종료를 의미
				
			case 2: 
				System.out.println("키위를 선택하였습니다.");
				break;
			case 3:
				System.out.println("메론을 선택하였습니다.");
				break;
			case 4:
				System.out.println("포도를 선택하였습니다.");
				break;
			case 5:
				System.out.println("블루베리를 선택하였습니다.");
				break;
				
			default: // else
				System.out.println("잘못 선택 하셨습니다.");
		}
	}
	
	public void testSwitch2(){
		// fall-through 현상
		// switch 구문은 각 case 별로 break; 를
		// 삽입하지 않으면 자기 자신의 구문을 실행하고, 
		// 이어서 다음 구문으로 내려가 버린다.
		// 따라서, 이러한 현상이 발생하지 않게
		// break 문을 각각 적어 주어야 한다.
		
		// 혹은, 이를 응용한 코드 구현도 가능하다.
		
		// 한 자리의 정수를 입력 받아서
		// 그 수가 짝수인지, 홀수인지 나타내는 코드를 구현
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리의 수를 입력하세요 : ");
		
		int num = sc.nextInt() % 10;
		
		switch(num){ // switch 시작
		
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("홀수입니다.");
			break;
			
		case 0: case 2: case 4: case 6: case 8:
			System.out.println("짝수입니다.");
			break;
			
		default:
			System.out.println("그건 숫자가 아닙니다.");
			
		} // switch 끝
		
	}
	
	public void testSwitch3(){
		// switch를 활용한 점수 계산
		// 학생의 점수를 입력 받아
		// 학점 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		// 안내문구
		System.out.print("학생의 점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		switch(score/10){
		// case 에는 조건식이나 계산식, 메소드를 
		// 비교 대상으로 사용할 수가 없다!!!!
		// case score/10 > 8 :
		//	System.out.println("A학점 입니다.");
		// -- Error!!!
		
		case 10: case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		default :
			System.out.println("F학점 입니다.");
		}
	}
	
	public void testSwitch4(){
		// switch에 들어갈 수 있는 값은
		// 숫자, 문자 하나, 문자열이 있다.
		
		 System.out.println("숫자 계산기입니다.");
		 
		 System.out.print("첫번째 정수를 입력하세요 : ");
		 int num1 = sc.nextInt();
		 
		 System.out.print("두번째 정수를 입력하세요 : ");
		 int num2 = sc.nextInt();
		
		 System.out.print("수행할 연산을 입력하세요 : ");
		 char ch = sc.next().charAt(0);
		 
		 int result = 0;
		 
		 switch(ch){
		 case '+':
			 result = num1+num2;
			 break;
			 
		 case '-':
			 result = num1-num2;
			 break;
			 
		 case '*':
			 result = num1 * num2;
			 break;
			 
		 case '/':
			 result = num1 / num2;
			 break;
			 
		 default:
			 System.out.println("없는 계산식입니다.");
			 
			 return; // 현재 실행되는 메소드를 종료하겠다.
			 
		 }
		 
		 System.out.println("결과 확인 : "+result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}












