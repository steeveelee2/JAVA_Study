package silsub2;

import java.io.*;
import java.util.Scanner;

public class SungjukProcess {
	
	private Scanner sc=new Scanner(System.in);
	private int all=0;

	public static void main(String[] args) {
		SungjukProcess sp=new SungjukProcess();
		sp.sungjukSave();
		sp.scoreRead();

	}
	
	public void sungjukSave() {
		try(DataOutputStream dOut=new DataOutputStream(new FileOutputStream("score.dat"));){
			char chk;
			do {
				System.out.print("국어 점수 : ");
				int kor=sc.nextInt();
				dOut.writeInt(kor);
				System.out.print("영어 점수 : ");
				int eng=sc.nextInt();
				dOut.writeInt(eng);
				System.out.print("수학 점수 : ");
				int mat=sc.nextInt();
				dOut.writeInt(mat);
				dOut.writeInt(kor+eng+mat);
				dOut.writeDouble((double)(kor+eng+mat)/3);
				System.out.print("계속 저장하시겠습니까? (y/n) : ");
				chk=sc.next().toLowerCase().charAt(0);
				this.all++;
			}while(chk!='n');
			System.out.println("score.dat에 저장 완료");
			
		}catch(IOException e) {
			System.out.println("파일 저장 중 문제가 발생했습니다");
		}
		
	}
	
	public void scoreRead() {
		try(DataInputStream dIn=new DataInputStream(new FileInputStream("score.dat"));){
			int count=0,sumS=0;
			int[] kor=new int[all];
			int[] eng=new int[all];
			int[] mat=new int[all];
			int[] sum=new int[all];
			double[] ave=new double[all];
			for(int i=0;i<all;i++) {
				kor[count]=dIn.readInt();
				eng[count]=dIn.readInt();
				mat[count]=dIn.readInt();
				sum[count]=dIn.readInt();
				ave[count]=dIn.readDouble();
				sumS+=sum[count];
				System.out.printf("국어 : %d 영어 : %d 수학 : %d 총점 : %d 평균 : %.2f\n",kor[count],eng[count],mat[count],sum[count],ave[count]);
				count++;
			}
			System.out.printf("읽은 횟수 : %d 전체 총점 : %d 전체 평균 : %.2f\n",all,sumS,(double)sumS/(all*3));
			System.out.println("score.dat 파일 읽기 완료");			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(EOFException e) {
			System.out.println("끝");
		}catch(IOException e) {
			System.out.println("파일을 읽어오는 중 문제가 발생했습니다");
		}
	}

}
