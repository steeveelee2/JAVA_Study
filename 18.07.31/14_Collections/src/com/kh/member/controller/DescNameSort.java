package com.kh.member.controller;

import java.util.Comparator;

import com.kh.member.model.vo.Member;

public class DescNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Member m1=(Member)o1;
		Member m2=(Member)o2;
		return m1.getName().compareTo(m2.getName())*-1;
	}

}
