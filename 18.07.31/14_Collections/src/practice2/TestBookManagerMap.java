package practice2;

import java.util.Scanner;

public class TestBookManagerMap {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		menu();

	}
	
	public static void menu(){
		BookManagerMap bm=new BookManagerMap();
		do{
			System.out.println();
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println();
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴 입력 : ");
			switch(sc.nextInt()){
			case 1:
				bm.putBook(inputBook());
				break;
			case 2:
				bm.printBookMap(bm.sortedBookMap());
				break;
			case 3:
				bm.removeBook(bm.searchBook(inputBookTitle()));
				break;
			case 4:
				bm.printBook(bm.searchBook(inputBookTitle()));
				break;
			case 5:
				bm.displayAll();
				break;
			case 6:
				System.out.println("종료합니다");
				return;
			default:
			}
		}while(true);
	}
	
	public static Book inputBook(){
		System.out.print("도서번호 : ");
		String bNo=sc.next();
		System.out.print("도서분류코드 : ");
		int category=sc.nextInt();
		System.out.print("책제목 : ");
		String title=sc.next();
		System.out.print("저자 : ");
		String author=sc.next();
		return new Book(bNo,category,title,author);
	}
	
	public static String inputBookTitle(){
		System.out.print("찾을 책 제목 입력 : ");
		return sc.next();
	}

}
