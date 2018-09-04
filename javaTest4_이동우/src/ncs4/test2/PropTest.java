package ncs4.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {
	// Properties는 정말 모르겠습니다... JAVA에서 제일 어렵읍니다

	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("1",new Fruit("apple",1200,3));
		prop.put("2",new Fruit("banana",2500,2));
		prop.put("3",new Fruit("grape",4500,5));
		prop.put("4",new Fruit("orange",800,10));
		prop.put("5",new Fruit("melon",5000,2));
		
		PropTest pt=new PropTest();
		pt.fileSave(prop);
		pt.fileOpen(prop);
		

	}
	
	public void fileSave(Properties p) {
		try(FileOutputStream fos=new FileOutputStream("data.xml")){
			p.storeToXML(fos,null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen(Properties p) {
		try(FileInputStream fis=new FileInputStream("data.xml")){
			p.loadFromXML(fis);
			for(int i=0;i<p.size();i++) {
				System.out.println((i+1)+" = "+p.get(String.valueOf(i+1)).toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
