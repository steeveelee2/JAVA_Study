package remd.test2;

import java.util.Stack;

public class StringTest {

	public static void main(String[] args) {
		// 사용 데이터
		String str="A, b, c, D, a, B, C, d, f, F";
		
		// 데이터 분리해서 배열로
		String[] st=str.split(", ");
		
		// char 배열로 옮김
		char[] data=new char[st.length];
		int idx=0;;
		for(String s:st){
			data[idx++]=s.charAt(0);
		}
		
		// while문으로 대문자만 골라냄
		Stack<String> stk=new Stack<>();
		while(--idx>-1){
			if(data[idx]>64&&data[idx]<91) stk.push("data["+idx+"] : "+data[idx]);
		}
		while(!stk.isEmpty()){
			System.out.println(stk.pop());
		}
	}

}
