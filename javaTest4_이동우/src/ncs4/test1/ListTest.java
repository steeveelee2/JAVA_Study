package ncs4.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<11;i++) {
			list.add(new Random().nextInt(100)+1);
		}
		
		list.sort(new Decending());
		
		new ListTest().display(list);
	}
	
	public void display(List list) {
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}

}
