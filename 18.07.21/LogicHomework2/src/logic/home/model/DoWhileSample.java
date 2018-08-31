package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
	
	Scanner sc=new Scanner(System.in);
	
	public void addDashToken(){
		
		System.out.print("문자열 입력 : ");
		String word=sc.next();
		int i=0;
		
		do{
			System.out.print(word.charAt(i)+"-");
			i++;			
		}while(i!=word.length()-1);
		System.out.println(word.charAt(i));
		
	}
	
	public void burgerKingMenu(){
		
		int ea=0,sum=0,bul=0,chi=0,pot=0,che=0,sal=0,col=0,aid=0,cof=0;
		boolean chk=false;
		String item=null;
		
		do {
			System.out.println("**** 메뉴를 선택하세요 ****");
			System.out.println("햄버거 *****************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("추가 ******************");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 치즈스틱	400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료 ******************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("*********************");
			System.out.println("9. 이전 메뉴로 이동");
			System.out.println();
			System.out.print("메뉴 선택 : ");
			
			switch (sc.nextInt()) {
			case 1:
				item="불고기버거";
				break;
			case 2:
				item="치킨버거";
				break;
			case 3:
				item="감자튀김";	
				break;
			case 4:
				item="치즈스틱";
				break;
			case 5:
				item="샐러드";
				break;
			case 6:
				item="콜라";
				break;
			case 7:
				item="에이드";
				break;
			case 8:
				item="커피";
				break;
			case 9:
				if(sum==0) {
					return;
				}else {
					break;
				}
			default:
				System.out.println("다시 입력해주세요");
				chk=true;
			}
			
			System.out.println(item+" 주문 하셨습니다 ");
			System.out.print("수량 : ");
			ea=sc.nextInt();
			
			if(ea<=0) {
				System.out.println("다시 입력해주세요");
			}else {
				if(item=="불고기버거") {
					bul+=ea;
				}else if (item=="치킨버거") {
					chi+=ea;
				}else if (item=="감자튀김") {
					pot+=ea;
				}else if (item=="치즈스틱") {
					che+=ea;
				}else if (item=="샐러드") {
					sal+=ea;
				}else if (item=="콜라") {
					col+=ea;
				}else if (item=="에이드") {
					aid+=ea;
				}else if (item=="커피") {
					cof+=ea;
				}
				System.out.println(ea+"개를 선택하셨습니다");
			}
			
			System.out.print("추가 주문 하시겠습니까? Y/N : ");
			char plus=sc.next().toUpperCase().charAt(0);
			
			if(plus=='Y') {
				chk=true;
			}else {
				chk=false;
				System.out.println("======== 주문 결제 ========");
				if(bul!=0) {
					System.out.println("불고기버거 "+bul+"개 : "+(bul*3500));
					sum+=(bul*3500);
				}
				if(chi!=0) {
					System.out.println("치킨버거 "+chi+"개 : "+(chi*3200));
					sum+=(chi*3200);
				}
				if(pot!=0) {
					System.out.println("감자튀김 "+pot+"개 : "+(pot*1000));
					sum+=(pot*1000);
				}
				if(che!=0) {
					System.out.println("치즈스틱 "+che+"개 : "+(che*400));
					sum+=(che*400);
				}
				if(sal!=0) {
					System.out.println("샐러드 "+sal+"개 : "+(sal*2000));
					sum+=(sal*2000);
				}
				if(col!=0) {
					System.out.println("콜라 "+col+"개 : "+(col*700));
					sum+=(col*700);
				}
				if(aid!=0) {
					System.out.println("에이드 "+aid+"개 : "+(aid*1200));
					sum+=(aid*1200);
				}
				if(cof!=0) {
					System.out.println("커피 "+cof+"개 : "+(cof*1000));
					sum+=(cof*1000);
				}
				System.out.println("---------------------");
				System.out.println("총 가격은 "+sum+"입니다");
			}
			System.out.println("");
		} while(chk);
		
	}
				
	public void isStringAlphabet(){
		
		System.out.print("문자열 입력 : ");
		String word=sc.next();
		char wArr[]=new char[word.length()];
		for(int i=0;i<wArr.length;i++) {
			wArr[i]=word.charAt(i);
		}
		
		int i=0;
		
		do {
			if((wArr[i]>90&&wArr[i]<97)||wArr[i]<65||wArr[i]>122) {
				System.out.println("모든 글자가 영문자는 아니다");
				return;
			}else {
				i++;
			}
		}while(i!=wArr.length);
		System.out.println("모든 글자가 영문자다");
				
	}
		
		

}
