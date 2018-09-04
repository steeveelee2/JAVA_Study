package silsub3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class BookManager {
	
	Scanner sc=new Scanner(System.in);
	
	public BookManager() {}
	
	public void fileSave() {
		Book[] b=new Book[5];
		{
			b[0]=new Book("배추 농사, 알아야 한다","김정팔",25000,new GregorianCalendar(2016,06,23),0.15);
			b[1]=new Book("쌈지 레볼루션","최점례",16500,new GregorianCalendar(2016,07,06),0.10);
			b[2]=new Book("사야 할 쟁기, 팔아야 할 호미","박춘흠",24000,new GregorianCalendar(2015,11,20),0.20);
			b[3]=new Book("1인 가구 불씨 관리","이옥분",22000,new GregorianCalendar(2014,10,10),0.25);
			b[4]=new Book("소 육성 오늘부터 1일","정병국",33500,new GregorianCalendar(2017,04,31),0.05);
		}
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("book.dat"));){
			for(int i=0;i<b.length;i++) {
				oos.writeObject(b[i]);
			}
			System.out.println("book.dat에 저장 완료");
		}catch(IOException e) {
			System.out.println("파일을 저장하는 중 문제가 발생했습니다");
		}
	}
	
	public void fileRead() {
		Book[] b=new Book[10];
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("book.dat"));) {
			Book value;
			int idx=0;
			while((value=(Book)ois.readObject())!=null) {
				b[idx]=value;
				System.out.println(b[idx]);
				idx++;
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(ClassNotFoundException e) {
			System.out.println("파일을 읽을 수 없습니다");
		}catch(EOFException e) {
			System.out.print("");
		}catch(IOException e) {
			System.out.println("파일을 읽는 중 문제가 발생했습니다");
		}finally {
			System.out.println("book.dat 읽기 완료");
		}
	}

}
