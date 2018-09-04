package com.kh.io.subStream.objectStream.model.dao;

import java.io.*;
import com.kh.io.subStream.objectStream.model.vo.Member;

public class TestObjectIO {
	
	public void fileSave(){
		Member[] mArr={
				new Member("홍그레고리",10,"함안","010",150.0,40.0),
				new Member("심엘리제",20,"창녕","010",180.0,80.0),
				new Member("박개리슨",30,"김삿갓골","010",170.0,60.0),
		};
		
		try(ObjectOutputStream oOut=new ObjectOutputStream(new FileOutputStream("member.dat"));){
			
			for(int i=0;i<mArr.length;i++){
				oOut.writeObject(mArr[i]);
			}
			oOut.flush();
			System.out.println("객체 저장 완료");
			
		}catch(IOException e){
			
		}
	}
	
	public void fileOpen(){
		
		Member[] mArr=new Member[3];
		
		try(ObjectInputStream oIn=new ObjectInputStream(new FileInputStream("member.dat"));){
			
			for(int i=0;i<mArr.length;i++){
				mArr[i]=(Member)oIn.readObject();
				System.out.println(mArr[i]);
			}
			
		}catch(FileNotFoundException e){
			
		}catch(IOException|ClassNotFoundException e){
			
			
		}
	}	
}
