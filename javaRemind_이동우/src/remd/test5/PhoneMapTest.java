package remd.test5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PhoneMapTest {

	public static void main(String[] args) {
		
		// 사용 데이타
		Map<String, Phone> map = new HashMap<String, Phone>();
		
		// 맵에 저장
		{
			map.put("galaxy S7",new Phone("galaxy S7",563500,"삼성",7));
			map.put("iphone 6s",new Phone("iphone 6s",840000,"애플",3));
			map.put("G5",new Phone("G5",563500,"LG",5));
		}
		
		// 프로퍼티스 생성
		Properties prop=new Properties();
				
		// 엔트리셋으로 적절히 출력
		System.out.println("맵에 저장된 정보는 다음과 같습니다.");
		Iterator<Entry<String,Phone>> iter=map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String,Phone> entry=iter.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			// 프로퍼티스에 입력
			prop.put(entry.getKey(),entry.getValue());
		}
		
		// 파일로 저장
		try(FileOutputStream fos=new FileOutputStream("phone.xml")){
			prop.storeToXML(fos,null);
			System.out.println("phone.xml 파일에 성공적으로 저장되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("띠용!");
		} catch (IOException e) {
			System.out.println("띠용!");
		}
	}

}
