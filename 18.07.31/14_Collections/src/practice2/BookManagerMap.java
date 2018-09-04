package practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookManagerMap {
	
	private HashMap booksMap=new HashMap();
	
	BookManagerMap(){
		new HashMap();
	}
	
	private BookManagerMap(HashMap map){
		new HashMap(map);
	}
	
	public void putBook(Book book){
		booksMap.put(book.getBNo(),book);
	}
	
	public void removeBook(String key){
		booksMap.remove(key);
	}
	
	public String searchBook(String bTitle){
		String result=null;
		Iterator iter=booksMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			if(((Book)(entry.getValue())).getTitle().equals(bTitle)){
				result=((Book)(entry.getValue())).getBNo();
			}
		}
		return result;
	}
	
	public void displayAll(){
		Set keys=booksMap.keySet();
		Iterator iter=keys.iterator();
		while(iter.hasNext()){
			Object o=(Object)iter.next();
			System.out.println(booksMap.get(o));
		}
	}
	
	public ArrayList sortedBookMap(){
		ArrayList bk=new ArrayList();
		Iterator iter=booksMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry)iter.next();
			bk.add(entry.getValue());
		}
		return bk;
	}
	
	public void printBookMap(ArrayList br){
		br.sort(new AscTitle());
		Iterator iter=br.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public void printBook(String key){
		System.out.println(booksMap.get(key));
	}

}
