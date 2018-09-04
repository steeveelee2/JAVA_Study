package ncs.test2;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		
		String str="1.22,4.12,5.93,8.71,9.34";
		double data[]=new double[5];
		double sum=0;
		
		StringTokenizer stk=new StringTokenizer(str,",");
		for(Double d:data){
			d=Double.parseDouble(stk.nextToken());
			sum+=d;
		}
		System.out.printf("합계 : %.3f\n평균 : %.3f\n",sum,sum/5);
		
		
		

	}

}
