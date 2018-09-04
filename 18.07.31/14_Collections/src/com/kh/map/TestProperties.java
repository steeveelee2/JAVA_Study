package com.kh.map;

import java.io.*;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// Properties
		// 프로그램을 실행할 때 함께 읽어오는 설정들(언어 설정, 화면 사이즈 등)을 저장하는 파일을 말한다
		// 최근에는 XML방식으로 대체되었으나 아직 많은 응용프로그램들이 이 파일을 설정파일로써 사용하고 있다
		// Properties는 Key와 Value로 이루어진 Map 형식을 가지고 있으나 Key와 Value 모두 문자열 형태로 저장하여 사용한다
		
		Properties prop=new Properties();
		
		// 값을 저장할때에는 setProperty() 메소드를 사용
		prop.setProperty("driver","oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url","jdbc:oracle:thin:@localhost:1521:XE");
		prop.setProperty("username","student");
		prop.setProperty("password","student");
		
		System.out.println(prop);
		
		try{
		prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
		prop.store(new FileWriter("driver.properties"),"jdbc driver");
		} catch(FileNotFoundException e){
			
		} catch(IOException e){
			
		}
		
		try {
			prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
