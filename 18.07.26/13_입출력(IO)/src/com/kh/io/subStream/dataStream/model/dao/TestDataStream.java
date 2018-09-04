package com.kh.io.subStream.dataStream.model.dao;

import java.io.*;

public class TestDataStream {
	// 입력한 데이터를 해당 타입(자료형)에 맞게 저장하고 출력하는 보조 스트림
	// 각각의 자료형을 byte 기준으로 쪼개어 담고 출력 시에 해당 byte 기준으로 꺼내어 변환한다
	// 입력 : DataInputStream, 출력 : DataOutputStream
	
	public void testDataStream(){
		// 데이터 자료형 단위로 정보를 저장하고 저장한 내용을 출력하는 기능 메솓
		
		try(DataOutputStream dout=new DataOutputStream(new FileOutputStream("score.dat"));
			DataInputStream din=new DataInputStream(new FileInputStream("score.dat"));){
			
			// --------- score.dat 파일로 출력하는 내용-------------- //
			dout.writeUTF("홍마라카치");
			dout.writeInt(95);
			dout.writeChar('A');
			dout.writeUTF("김테베우스");
			dout.writeInt(85);
			dout.writeChar('B');
			dout.writeUTF("신엘리자베스");
			dout.writeInt(75);
			dout.writeChar('C');
			
			// --------- score.dat 파일로부터 읽어오는 내용-------------- //
			while(true){
				System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
			}
			
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			
		}catch(EOFException e){
			// End Of File의 약자로 파일 읽기가 완료되었을 때(끝까지 다 읽었을 때 발생하는 에러)
			System.out.println("파일 읽기 완료");
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
