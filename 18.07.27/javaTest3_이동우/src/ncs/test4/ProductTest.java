package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Product p=new Product();
		Scanner sc=new Scanner(System.in);
		System.out.print("상품명 : ");
		p.setName(sc.nextLine());		
		System.out.print("가격 : ");
		p.setPrice(sc.nextInt());		
		System.out.print("수량 : ");
		p.setQuantity(sc.nextInt());		
		long sum=p.getPrice()*p.getQuantity();
		
		System.out.printf("상품명 : %s\n가격 : %d 원\n수량 : %d 개\n총 구매 가격 : %d 원",p.getName(),p.getPrice(),p.getQuantity(),sum);

	}

}
