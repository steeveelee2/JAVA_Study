package com.kh.io.subStream.buffered.model.dao;

import java.io.*;

public class TestBufferedStream {
	// 입력 혹은 출력에 대한 임시 저장공간을 만들어서 데이터를 한 번에 처리하는 보조 스트림 테스트 클래스
	// 입력 : BufferedInputStream / BufferedReader, 출력 : BufferedOutputStream / BufferedWriter
	
	public void fileSave(){
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("sample3.dat"));){
			
			bw.write("안녕 못하다\n");
			bw.write("오늘 날씨가 좀 심하게 덥다\n");
			
			// 현재까지 작성한 내용을 전부 전송하여 처리하고 현재 버퍼를 비운다
			bw.flush();
			
			
		}catch(IOException e){
			System.out.println("버그임");
		}
	}
	
	public void fileOpen(){
		
		try(BufferedReader br=new BufferedReader(new FileReader("sample3.dat"));){
			
			String tmp;
			while((tmp=br.readLine())!=null){
				System.out.println(tmp);
			}
						
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	

}
