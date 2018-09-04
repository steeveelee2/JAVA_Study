package test.bundle.controller;

import test.bundle.model.Function;

public class Run {
	
	private Function myF;
	
	public Run(){
		myF = new Function();
		myF.initFunction();
	}
	
	public static void main(String[] args) {
		
		Run r=new Run();
		
		r.myF.myFunction();		
		

	}

}
