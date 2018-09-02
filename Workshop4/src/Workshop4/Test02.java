package Workshop4;

public class Test02 {

	public static void main(String[] args) {
		int[] arr3=new int[5];
		int sum=0;
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=(int)(Math.random()*10)+1;
			sum+=arr3[i];
			System.out.print(i==arr3.length-1?arr3[i]+"\nsum="+sum+"\navg="+sum/arr3.length:arr3[i]+" ");
		}
	}

}
