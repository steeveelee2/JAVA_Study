package practice2;

import java.util.*;

public class BookManager {
	
	private ArrayList bookList=new ArrayList();;
	
	public BookManager(){}
	
	public BookManager(List list){
		new ArrayList();
	}
	
	public void addBook(Book book){
		bookList.add(book);
	}
	
	public void deleteBook(int index){
		bookList.remove(index);
	}
	
	public int searchBook(String bTitle){
		int chk=-1;
		for(int i=0;i<bookList.size();i++){
			chk=((Book)bookList.get(i)).getTitle().equals(bTitle)?i:-1;
		}
		return chk;
	}
	
	public void printBook(int index){
		System.out.println(bookList.get(index).toString());
	}
	
	public void displayAll(){
		for(Object o:bookList){
			System.out.println(o.toString());
		}
	}
	
	public Object[] sortedBookList(){
		bookList.sort(new AscCategory());
		return (Object[]) bookList.toArray();
	}
	
	public void printBookList(Object[] br){
		for(Object o:br){
			System.out.println(o.toString());
		}
	}

}
