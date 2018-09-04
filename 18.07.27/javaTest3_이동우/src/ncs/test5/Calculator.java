package ncs.test5;

public class Calculator {
	
	public double getSum(int data) throws InvalidException{
		double sum=0;;
		if(data<2||data>5){
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}else{
			for(int i=data;i>0;i--){
				sum+=i;
			}
		}		
		return sum;
		
	}

}
