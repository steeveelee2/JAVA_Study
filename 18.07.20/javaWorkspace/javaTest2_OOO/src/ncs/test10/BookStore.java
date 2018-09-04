package ncs.test10;

public class BookStore {

	public static void main(String[] args) {
		// book 객체 생성하기
		Book book
		  = new Book("IT", "HTML5", 30000, 0.15);
		
		System.out.println("기본 정보 출력");
		System.out.println(book.getCategory()+
				" " +book.getBookName()+ 
				" " +(int)book.getBookPrice()+
				" " +book.getBookDiscountRate());
		
		// BookUpdate 객체 생성 
		// ( 생성시 Book 객체를 생성자를 통해 셋팅 )
		BookUpdate bookupdate = new BookUpdate(book);
		
		// updateBookPrice 함수를 통해 
		// Book 객체의 할인율을 적용시켜 가격 변경
		bookupdate.updateBookPrice();
		
		 // getBookData 함수를 통해 Book 객체를 리턴받는다.
		 //(기존 bookdata 객체를 통해 리턴받는다 )
		 // Book 객체의 변경된 정보 출력
		
		book = bookupdate.getBookData();
		
		System.out.println("변경된 정보 출력");
		
		System.out.println(book.getCategory() +
				" " + book.getBookName() + 
				" " + (int)book.getBookPrice() +
				" " + book.getBookDiscountRate());
	}

}