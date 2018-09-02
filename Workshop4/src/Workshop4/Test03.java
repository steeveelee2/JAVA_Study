package Workshop4;

public class Test03 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
