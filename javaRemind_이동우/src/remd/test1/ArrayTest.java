package remd.test1;

import java.util.*;

public class ArrayTest {

	public static void main(String[] args) {
		// 사용 데이터
		int[] array=new int[10];
		
		// 1~100 임의의 정수 기록
		Random rnd=new Random();
		for(int i=0;i<array.length;i++){
			array[i]=rnd.nextInt(100)+1;
		}
		
		ArrayTest at=new ArrayTest();
		// 할당된 배열의 크기
		System.out.println("할당된 배열의 크기 : "+array.length);
		
		// 배열 값 출력
		System.out.print("array :");
		at.print(array);
		
		// 가장 큰 값
		System.out.println("가장 큰 값 : "+at.max(array));
		
		// 가장 작은 값
		System.out.println("가장 작은 값 : "+at.min(array));
		
		// 짝수의 개수
		System.out.println("짝수의 개수 : "+at.evenCount(array));
		
		// 홀수의 개수
		System.out.println("짝수의 개수 : "+at.oddCount(array));
		
		// 배열 합계
		System.out.println("합계 : "+at.sum(array));
		
		// 배열 평균
		System.out.println("평균 : "+at.avg(array));
		
		
	}
	
	public int sum(int[] arr){
		int sum=0;
		// 모든 배열 값 더하기
		for(int i:arr){
			sum+=i;
		}
		return sum;
	}
	
	public double avg(int[] arr){
		// 소숫점 두자리에서 반올림
		return (double)Math.round(sum(arr)*10)/100;
	}
	
	public int max(int[] arr){
		int max=arr[0];
		// 배열을 탐색해 최대값을 찾되 100일 경우 바로 리턴
		for(int i=1;i<arr.length;i++) 
			if(max==100) break;
			else if(arr[i]>max) max=arr[i];
		return max;
	}
	
	public int min(int[] arr){
		int min=arr[0];
		// 배열을 탐색해 최소값을 찾되 1일 경우 바로 리턴
		for(int i=1;i<arr.length;i++)
			if(min==1) break;
			else if(arr[i]<min) min=arr[i];
		return min;
	}
	
	public int evenCount(int[] arr){
		int cnt=0;
		// 짝수만 카운트
		for(int i:arr){
			cnt+=i%2==0?1:0;
		}
		return cnt;
	}
	
	public int oddCount(int[] arr){
		int cnt=0;
		// 홀수만 카운트
		for(int i:arr){
			cnt+=i%2!=0?1:0;
		}
		return cnt;
	}
	
	public void print(int[] arr){
		// 배열 값 출력
		for(int i:arr){
			System.out.print(" "+i);
		}
		System.out.println("");
	}

}
