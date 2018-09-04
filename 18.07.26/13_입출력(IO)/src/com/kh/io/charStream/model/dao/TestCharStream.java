package com.kh.io.charStream.model.dao;

import java.io.*;

public class TestCharStream {
	// 문자 기반 데이터 입출력 테스트 클래스
	// 입력 : Reader, 출력 : Writer
	
	public void fileOpen(){
		
		try(FileReader fr=new FileReader("sample.txt");){
			
			int value;
			while((value=fr.read())!=-1){
				System.out.println((char)value+" ");
			}
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void fileSave(){
		
		try(FileWriter fw=new FileWriter("sample.txt",true);){
			
			fw.write("배가 고프다");
			
			char[] writeData={'덥','다','괴','롭','다'};
			fw.write(writeData);
			
		}catch(IOException e){
			e.getMessage();
		}
	}
	
	
}
