package com.week4;

public class ExamString {

	public ExamString() {
	}

	public String preChar(String s) {

		char[] ch = s.toCharArray();

		ch[0] = s.toUpperCase().charAt(0);
		StringBuilder sb = new StringBuilder();

		System.out.print(ch[0]);
		for (int i = 1; i < ch.length; i++) {
			ch[i] = s.charAt(i);
			System.out.print(ch[i]);
		}

		return sb.toString();

	}

	public int charSu(String s, char ch) {
		int count = 0;
		char[] ch1 = s.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ch) {
				count++;
			}
		}return count;
	}

}
