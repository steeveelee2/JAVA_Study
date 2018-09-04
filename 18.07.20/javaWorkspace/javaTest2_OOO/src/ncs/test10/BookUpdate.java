package ncs.test10;

public class BookUpdate {
	private Book bookData;

	public BookUpdate(){ }
	
	public BookUpdate(Book bookData){
		this.bookData = bookData;
	}

	public Book getBookData(){
		return bookData;
	}

	public void updateBookPrice(){
		// 내용 구현
		double price = bookData.getBookPrice();
		double dis = bookData.getBookDiscountRate();
		
		double result = price - (price*dis); 
				
		bookData.setBookPrice(result);
	}
	
	public void setBookData(Book bookData){
		this.bookData = bookData;
	}
}