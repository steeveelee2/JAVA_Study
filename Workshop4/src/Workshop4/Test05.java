package Workshop4;

public class Test05 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=Integer.parseInt(args[0]);i<9;i++) {
			sum+=i%3==0?0:i%5==0?0:i;
			System.out.print(i%3==0?"":i%5==0?"":i==8?i+"\n결과: "+sum:i+"+");
		}

	}

}
