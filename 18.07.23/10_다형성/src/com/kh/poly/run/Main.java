package com.kh.poly.run;

import com.kh.poly.model.vo.*;

public class Main {

	public static void main(String[] args) {
		//다형성 테스트용 실행 메소드
		
		// 상속만을 사용한 경우
		/*Parents p=new Parents();
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Child3 c3=new Child3();
		
		p.sayMyName();
		c1.sayMyName();
		c2.sayMyName();
		c3.sayMyName();*/		
		
		// 다형성을 적용한 경우
		Parents p=new Parents();  // 정적 바인딩
		Parents c1=new Child1();  // 동적 바인딩
		Parents c2=new Child2();  // 동적 바인딩
		Parents c3=new Child3();  // 동적 바인딩
		
		p.sayMyName();
		c1.sayMyName();
		c2.sayMyName();
		c3.sayMyName();
		
		// 부모가 가진 메소드 접근 확인
		p.setLastName("김");
		c1.setLastName("김");
		c2.setLastName("김");
		
		// 자식이 가진 메소드 접근 확인
		// 상속 관계에서 부모는 자식의 메소드, 필드 등을 사용할 수 없다
		
		// 자식 객체이지만 부모 클래스로 생성하였기 때문에 자식의 기능은 접근할 수 없다
		// c1.setFirstName("금김");
		
		// 이를 해결하기 위해 자식 객체로 Down Casting을 수행한다
		((Child1)c1).setFirstName("금김");
		
		// 다형성을 사용하지 않는다면...
		Child1 child1=new Child1();
		Child2 child2=new Child2();
		Child3 child3=new Child3();
		
		// 다형성을 사용한다면...
		Parents[] siblings=new Parents[3];
		siblings[0]=new Child1();
		siblings[1]=new Child2();
		siblings[2]=new Child3();
		
		// sing() 메소드를 사용하고 싶다면
		
		// Child1으로 만든 객체는 같은 형제라고 하더라도 Child3이라는 전혀 다른(공통점이 없는) 클래스의 메소드를 공유할 수 없고, 해당 클래스로 형변환도 할 수 없다
		// ((Child3)siblings[0]).sing();
		
		for(int i=0;i<siblings.length;i++){
			if(siblings[i] instanceof Child3){
				((Child3)siblings[i]).sing();
			}else{
				System.out.println("난 3번째 자식이 아닙니다");
			}
		}
		
	}	             

}
