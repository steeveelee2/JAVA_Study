package remd.test6;

public class Calculator {
	
	public double getSum(int data) throws InvalidException{
		double sum=0;
		// 2에서 5일때만 연산
		if(data>1&&data<6){
			for(int i=0;i<data;i++){
				sum+=i+1;
			}
			return sum;
		}else {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
	}

}
