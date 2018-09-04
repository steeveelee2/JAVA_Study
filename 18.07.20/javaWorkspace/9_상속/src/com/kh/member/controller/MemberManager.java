package com.kh.member.controller;

import com.kh.member.model.vo.Gold;
import com.kh.member.model.vo.Silver;
import com.kh.member.model.vo.VIP;
import com.kh.member.model.vo.VVIP;

public class MemberManager {
	private Silver[] silver = new Silver[10];
	private Gold[] gold = new Gold[10];
	private VIP[] vip = new VIP[10];
	private VVIP[] vvip = new VVIP[10];
	
	private int silverCnt;
	private int goldCnt;
	private int vipCnt;
	private int vvipCnt;
	
	public MemberManager(){
		
	}
	
	public void insertSilver(Silver s){
		this.silver[silverCnt++] = s;
	}
	
	public void insertGold(Gold g){
		this.gold[goldCnt++] = g;
	}
	
	public void insertVip(VIP v){
		this.vip[vipCnt++] = v;
	}
	
	public void insertVVip(VVIP vv){
		this.vvip[vvipCnt++] = vv;
	}
	
	public void memberPrint(){
		System.out.println("-------- 정보 출력 --------");
		System.out.printf("%-15s %-15s %-15s %-15s\n",
				"이름", "등급", "포인트", "이자적립율");
		for(int i = 0; i < silverCnt; i++){
			System.out.printf("%-15s%-15s%-15d%-15.2f\n",
					silver[i].getName(),
					silver[i].getGrade(),
					silver[i].getPoint(),
					silver[i].getIncen());
		}
		for(int i = 0 ; i < goldCnt ; i++){
			System.out.printf("%-15s%-15s%-15d%-15.2f\n",
					gold[i].getName(),
					gold[i].getGrade(),
					gold[i].getPoint(),
					gold[i].getIncen());
		}
		for(int i = 0; i < vipCnt ; i++){
			System.out.printf("%-15s%-10s%-15d%-15.2f\n",
					vip[i].getName(),
					vip[i].getGrade(),
					vip[i].getPoint(),
					vip[i].getIncen());
		}
		for(int i = 0; i < vvipCnt ; i++){
			System.out.printf("%-15s%-10s%-15d%-15.2f",
					vvip[i].getName(),
					vvip[i].getGrade(),
					vvip[i].getPoint(),
					vvip[i].getIncen());
		}
	}
}





