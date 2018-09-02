package Workshop4;

public class Test04 {

	public static void main(String[] args) {
		
		Calc calc=new Calc();
		int data=Integer.parseInt(args[0]);
		int result=calc.calculate(data);
		for(int i=2;i<=data;i+=2) {
			System.out.print(i==data?i+"\n결과: "+result:i==data-1?i+"\n결과: "+result:i==2?"짝수: "+i+" ":i+" ");
		}
	}

}
