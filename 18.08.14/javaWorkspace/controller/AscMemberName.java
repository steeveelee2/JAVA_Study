package com.kh.member.controller;

import java.util.Comparator;

import com.kh.member.model.vo.Member;

public class AscMemberName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Member m1 = (Member)o1;
		Member m2 = (Member)o2;
		int result = 0;
		
		if(m1.getName().compareTo(m2.getName()) > 0) {
			result = 1;
		} else if(m1.getName().compareTo(m2.getName()) < 0) {
			result = -1;
		}
		
		return result;
	}

}
