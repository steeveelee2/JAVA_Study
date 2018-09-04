package com.week4;

public class ExamString {
	
	public String preChar(String s) {
		String[] sA=new String[s.length()];
		for(int i=0;i<sA.length;i++) {
			sA[i]=i==0?String.valueOf(s.toUpperCase().charAt(i)):String.valueOf(s.charAt(i));
		}
		return String.join("",sA);
	}
	
	public int charSu(String s,char ch) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			count+=s.charAt(i)==ch?1:0;
		}
		return count;
	}

}
