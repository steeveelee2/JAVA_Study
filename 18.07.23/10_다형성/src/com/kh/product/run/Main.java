package com.kh.product.run;

import com.kh.product.model.vo.*;

public class Main {

	public static void main(String[] args) {
		// 다형성 테스트용 실행 메소드
		
		Product tv=new Tv("PAVVM",3200000);
		Product ph=new SmartPhone("Galaxiy-note8",2000000);
		Product ta=new Tablet("Galaxiy-Tab2",1700000);
		
		tv.display();
		ph.display();
		ta.display();
		

	}

}
