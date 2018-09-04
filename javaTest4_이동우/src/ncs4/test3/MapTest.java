package ncs4.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String,Inventory> map=new HashMap<String,Inventory>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyymmdd");
		
		try {
			map.put("삼성 갤럭시S7",new Inventory("삼성 갤럭시S7",sdf.parse("20160315"),null,30,0,30));
			map.put("LG G5",new Inventory("LG G5",sdf.parse("20160225"),null,20,0,20));
			map.put("애플 아이패드 Pro",new Inventory("애플 아이패드 Pro",sdf.parse("20160123"),null,15,0,15));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		
		Inventory[] ivArr=new Inventory[3];
		int idx=0;
		Iterator<Entry<String, Inventory>> iter=map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,Inventory> entry=iter.next();
			System.out.println(entry.getValue().toString());
			ivArr[idx++]=entry.getValue();
		}
		
		for(int i=0;i<ivArr.length;i++) {
			
			try {
				ivArr[i].setGetDate(sdf.parse("20180824"));
				ivArr[i].setGetAmount(10);
			} catch (AmountNotEnough|ParseException e) {
				System.out.println(e.getMessage());
			}
		}
		
		for(Inventory i:ivArr) {
			System.out.println(i);
		}
		
		
		
	}

}
