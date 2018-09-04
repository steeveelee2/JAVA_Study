package ncs.test1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();

		// 입력한 값을 출력하는 문장 작성 
		System.out.println(str);
		
		// 각 문자열을 ' '단위로 쪼개기 위한
		// for 반복문 사용
		/*String[] strArr = new String[5];
		for(int i = 0; i < strArr.length ; i ++){
			int idx = 0;
			if(str.charAt(i) == ' '){
				String strTemp = "";
				for(int j = idx; j <= i; j++){
					strTemp += str.charAt(j);
				}
				strArr[i] = strTemp;
				idx = i;
			}
		}*/
		
		// split() 메소드 사용 시
		String[] strArr = str.split(" ");
		
		// 점수 기입을 위한 배열 선언
		double[] score = new double[5];
		
		// 입력한 점수가 5개 일 때
		if( str.length() == 5){
			for(int i = 0; i < strArr.length; i++){
				// 입력한 점수 각각이 10 ~ 99 사이가 아닐 때
				if(Integer.parseInt(strArr[i]) < 10 || 
				   Integer.parseInt(strArr[i]) > 99){
					System.out.println("다시 입력 하세요.");
				} else {
					score[i] = Integer.parseInt(strArr[i]);
				}
			}
			// 입력한 점수가 5개가 아닐 때
		} else {
			System.out.println("다시 입력 하세요.");
		}
		
		// 점수 계산을 위한 계산식 사용하기
		/*(A+B)/2 : 60% 적용
		(C+D)/2 : 20% 적용
		E : 20% 적용
		
		90 이상이면: Gold Class
		80 이상이면: Silver Class
		70 이상이면: Bronze Class
		70 미만이면: Normal Class*/
		double score1 = (score[0] + score[1])/2 * 0.6;
		double score2 = (score[2] + score[3])/2 * 0.2;
		double score3 = score[4] * 0.2;

		String result;
		switch((int)(score1+score2+score3)/10){
		case 10: 
		case 9 : 
			result = "Gold Class"; 
			break;
		case 8:
			result = "Silver Class"; 
			break;
		case 7:
			result = "Bronze Class"; 
			break;
		default:
			result = "Normal Class"; 
			break;
		}
	}
}





