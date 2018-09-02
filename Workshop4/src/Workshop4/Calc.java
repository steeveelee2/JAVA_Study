package Workshop4;

public class Calc {
	
	public int calculate(int data) {
		int result=0;
		for(int i=data;i>2;i--) {
			result+=i%2==0?i:0;
		}
		return result;
	}
}
