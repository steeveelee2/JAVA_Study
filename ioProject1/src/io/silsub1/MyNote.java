package io.silsub1;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	
	private Scanner sc=new Scanner(System.in);
	
	public MyNote() {}
	
	public void fileSave() {
		
		System.out.println("파일에 저장할 내용을 입력하시오(종료할 시 exit 입력)");		
		StringBuilder sb=new StringBuilder();
		do {
			System.out.print("▷ ");
			String str=sc.nextLine()+"\n";			
			if(str.equals("exit\n")) {
				break;
			}
			sb.append(str);
		}while(true);
		System.out.print("저장하시겠습니까? (y/n) : ");
		if(sc.next().toLowerCase().charAt(0)=='y') {
			System.out.print("저장할 파일명 : ");
			String name=sc.next();
			try(FileWriter fw=new FileWriter(name+".txt");){
				fw.write(sb.toString());
				System.out.println(name+".txt 파일에 성공적으로 저장하였습니다");
				fw.flush();
				return;
			}catch(IOException e) {
				System.out.println("저장 중 문제가 발생했습니다");
			}
		}
		return;
	}
	
	public void fileOpen() {
		
		System.out.print("열기 할 파일 명 : ");
		String name=sc.next();
		try(BufferedReader br=new BufferedReader(new FileReader(name+".txt"));){
			while(br.ready()==true) {
				System.out.println(br.readLine());
			}
		}catch(FileNotFoundException e) {
			System.out.println("찾으시는 파일이 없습니다");
		}catch(EOFException e) {
			System.out.println("내용을 모두 출력했습니다");
		}catch(IOException e) {
			System.out.println("파일을 읽는 중 문제가 발생했습니다");
		}
		return;
	}
	
	public void fileEdit() {
		
		System.out.print("수정할 파일 명 : ");
		String name=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		try(BufferedReader br=new BufferedReader(new FileReader(name+".txt"));
			FileWriter fw=new FileWriter(name+".txt",true);){
			System.out.println("파일에 추가할 내용을 입력하시오(종료할 시 exit 입력)");
			do {
				System.out.print("▷ ");
				String str=sc.nextLine()+"\n";
				if(str.equals("exit\n")) {
					break;
				}
				sb.append(str);
			}while(true);
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			if(sc.next().toLowerCase().charAt(0)=='y') {
				fw.write(sb.toString());
				System.out.println(name+".txt 파일의 내용이 변경되었습니다");
				fw.flush();
			}
		}catch(FileNotFoundException e) {
			System.out.println("찾으시는 파일이 없습니다");
		}catch(EOFException e) {
			System.out.println("내용을 모두 출력했습니다");
		}catch(IOException e) {
			System.out.println("파일을 읽는 중 문제가 발생했습니다");
		}
		return;		
	}
}
