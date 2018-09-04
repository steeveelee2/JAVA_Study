package com.kh.io.subStream.byteToCharStream.model.dao;

import java.io.*;

public class TestByteToCharStream {
	// 바이트 스트림을 문자 스트림으로 바꿔주는 보조 스트림
	// 입력 : InputStreamReader, 출력 : OutputStreamWriter
	
	public void fileSave(){
		
		try(OutputStreamWriter ow=new OutputStreamWriter(new FileOutputStream("sample2.dat"));){
			
			ow.write("헬로\n");
			ow.write("12345\n");
			ow.write("HOT");
			
			System.out.println("파일 저장 완료");
			
			
		}catch(IOException e){
			System.out.println("파일 저장 중 문제가 발생했읍니다");
		}
	}
	
	public void fileOpen(){
		
		try(InputStreamReader ir=new InputStreamReader(new FileInputStream("sample2.dat"));){
			int value;
			while((value=ir.read())!=-1){
				System.out.print((char)value);
			}
			
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("파일 업슴");
		}catch(IOException e){
			System.out.println("파일 여는 중 문제 발생");
		}
	}

}
