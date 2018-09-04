package com.kh.loop;

public class JumpLoopTest {
	// 만약에 여러 중첩 반복문을 실행할 때
	// 한 번에 여러 개의 반복문을 빠져 나갈 필요가 있을 경우
	// 라벨 붙여 한 번에 빠져 나간다.
	
	public void testJumpBreak(){
		// 1부터 10까지의 합을 무한 반복 하는 도중
		// 라벨을 통해 빠져 나가기
		label:
		for(;;){ // while(true){}
			int sum = 0;
			for(int i = 1; i < 11; i++){
				sum += i;
				if(i == 3){
					System.out.println(sum); // 6
					break label;
				}
			}
		}
		
	}
}
