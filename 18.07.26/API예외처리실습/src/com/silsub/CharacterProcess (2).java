package com.silsub;

import com.silsub.*;

public class CharacterProcess {
	
	public CharacterProcess() {}
	
	public int countAlpha(String s)throws CharCheckException{
		int cnt = 0;
		for(int i= 0; i<s.length();i++){
			char ch = s.toUpperCase().charAt(i);
			if(s.charAt(i)==' '){
				throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
			}
			if('A'<=ch && ch<='Z'){
				cnt++;
			}
		}return cnt;
		
		
		
	}

}
