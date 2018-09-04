package com.silsub;

public class CharacterProcess {
	
	public CharacterProcess() {}
	
	public int countAlpha(String s) throws CharCheckException{
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
			}
			count+=s.toUpperCase().charAt(i)>64&&s.toUpperCase().charAt(i)<91?1:0;			
		}
		return count;
	}
	
}
