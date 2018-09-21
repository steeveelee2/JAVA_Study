package remd.test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class NoticeTest {

	public static void main(String[] args) {
		
		// 사용 데이타
		Object[] obArray=new Object[3];
		Scanner sc=new Scanner(System.in);
					
		// 3번 반복 입력 받기
		System.out.println("등록할 공지사항을 입력하시오.(3번 반복 입력 처리함)");
		
		// Date에 억지로 날짜 집어넣기 위한 준비물
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		String[] arr={"20160315","20160423","20160512"};
		try {
			for(int i=0;i<3;i++){
				System.out.print("제목 : ");
				String title=sc.nextLine();
				System.out.print("작성자 : ");
				String writer=sc.nextLine();
				System.out.print("내용 : ");
				String content=sc.nextLine();
				// SimpleDateFormat으로 문제없이 Date 지정
				obArray[i]=new Notice(i+1,title,sdf.parse(arr[i]),writer,content);
			}
		} catch (ParseException e) {
			System.out.println("띠용!");
		}
		
		NoticeTest nt=new NoticeTest();
		// 저장
		nt.fileSave(obArray);
					
		// 어레이리스트에 담기
		ArrayList<Notice> al=nt.fileRead();
					
		// 출력
		for(Notice n:al){
			System.out.println(n.toString());
		}
	}
	
	public void fileSave(Object[] array){
		// notice.dat에 저장
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("notice.dat"));){
			for(Object o:array){
				oos.writeObject(o);
			}
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
			System.out.println("띠용!");
		} catch (IOException e) {
			System.out.println("띠용!");
		}
	}
	
	public ArrayList<Notice> fileRead(){
		ArrayList<Notice> al=new ArrayList<>();
		// notice.dat을 불러와서 리스트로 리턴
		try{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("notice.dat"));
			while(al.size()!=3){
				al.add((Notice)ois.readObject());
			}
			ois.close();
		}catch(Exception e){
			System.out.println("띠용!");
		}
		return al;
		
	}

}
