package ncs4.test1;

import java.util.Comparator;

public class Decending implements Comparator {
	
	@Override
	public int compare(Object o1,Object o2) {
		return ((Integer)o1-(Integer)o2)*-1;
	}
}
