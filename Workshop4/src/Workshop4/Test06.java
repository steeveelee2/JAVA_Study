package Workshop4;

public class Test06 {

	public static void main(String[] args) {

		try {
			String chk=args[2];
			System.out.println("다시 입력 하세요");
		}catch(ArrayIndexOutOfBoundsException e) {
			try {
				int row=Integer.parseInt(args[0]);
				int col=Integer.parseInt(args[1]);
				if(row>5||row<1||col>5||col<1) {
					System.out.println("숫자를 확인하세요");
				}else {
					int[][] arr=new int[row][col];
					double sum=0.0;
					for(int i=0;i<row;i++) {
						for(int j=0;j<col;j++) {
							arr[i][j]=(int)(Math.random()*5)+1;
							sum+=arr[i][j];
							System.out.print(j==col-1?arr[i][j]+"\n":arr[i][j]+" ");
						}
					}
					System.out.printf("sum=%.1f\navg=%.1f",sum,sum/(row*col));					
				}
			}catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("다시 입력 하세요");
			}
		}

	}

}
