package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		int sel = 0, ea = 0;
		int total_price = 0;
		int bul = 0, chi = 0;
		int pot = 0, che = 0, sal = 0;
		int cola = 0, aid = 0, cof = 0;
		//int item_total = 8;
		boolean sw = false;
		String item = null;
		
		label:
		do {
			System.out.println("*** 메뉴를 선택하세요 ***");
			System.out.println("햄버거 **************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거		3200원");
			System.out.println("추가 **************");
			System.out.println("3. 감자튀김		1000원");
			System.out.println("4. 치즈스틱		400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료 **************");
			System.out.println("6. 콜라			700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피			1000원");
			System.out.println("*********************");
			System.out.println("9. 주문 안할래요.");
			System.out.println();
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			switch (sel) {
			case 1:	item = "불고기버거"; break;
			case 2:	item = "치킨버거";	break;
			case 3:	item = "감자튀김";	break;
			case 4:	item = "치즈스틱";	break;
			case 5:	item = "샐러드";	break;
			case 6:	item = "콜라";		break;
			case 7:	item = "에이드";	break;
			case 8:	item = "커피";		break;
			case 9:
				if (total_price == 0) {
					System.out.println("이용해 주셔서 감사합니다~");
					break label;
				} else break;
			default:
				System.out.println("--- --- ERROR --- ---");
				System.out.println("주문을 다시 입력 해주세요.");
				sw = true;
			}
			System.out.println(item + " 주문 받았습니다. ");
			System.out.print("수량은요? : ");
			ea = sc.nextInt();
			if (ea <= 0) {
				System.out.println("주문 에러입니다.");
			} else {
				if (item == "불고기버거")
					bul += ea;
				else if (item == "치킨버거")
					chi += ea;
				else if (item == "감자튀김")
					pot += ea;
				else if (item == "치즈스틱")
					che += ea;
				else if (item == "샐러드")
					sal += ea;
				else if (item == "콜라")
					cola += ea;
				else if (item == "에이드")
					aid += ea;
				else if (item == "커피")
					cof += ea;
				System.out.println(ea + "개를 선택하셨습니다.");
			}
			System.out.print("추가 주문 하시겠습니까? Y/N : ");
			char plus = sc.next().charAt(0);
			if (plus == 'Y' || plus == 'y')
				sw = true;
			else {
				sw = false;
				System.out.println("======== 주문 결제 ========");
				if (bul != 0) {
					System.out.println("불고기버거 " + bul + "개 : " + (bul * 3500));
					total_price += (bul * 3500);
				}
				if (chi != 0) {
					System.out.println("치킨버거 " + chi + "개 : " + (chi * 3200));
					total_price += (chi * 3200);
				}
				if (pot != 0) {
					System.out.println("감자튀김 " + pot + "개 : " + (pot * 1000));
					total_price += (pot * 1000);
				}
				if (che != 0) {
					System.out.println("치즈스틱 " + che + "개 : " + (che * 400));
					total_price += (che * 400);
				}
				if (sal != 0) {
					System.out.println("샐러드 " + sal + "개 : " + (sal * 2000));
					total_price += (sal * 2000);
				}
				if (cola != 0) {
					System.out.println("콜라 " + cola + "개 : " + (cola * 700));
					total_price += (cola * 700);
				}
				if (aid != 0) {
					System.out.println("에이드 " + aid + "개 : " + (aid * 1200));
					total_price += (aid * 1200);
				}
				if (cof != 0) {
					System.out.println("커피 " + cof + "개 : " + (cof * 1000));
					total_price += (cof * 1000);
				}
				System.out.println("---------------------");
				System.out.println("총 가격은 " + total_price + "입니다~!");
			}
			System.out.println();
		} while (sw);
	}
}
