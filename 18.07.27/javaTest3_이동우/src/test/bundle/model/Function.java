package test.bundle.model;

public class Function {
	
	private int[] range;
	
	public Function(){
		this.range=new int[7];
	}
	
	public int[] initFunction(){
		for(int i=0;i<7;i++){
			int rnd=(int)(Math.random()*30)+1;
			if(i>0){
				for(int j=0;j<i;j++){
					if(rnd==range[j]){
						i--;
						break;
					}else{
						this.range[i]=rnd;
					}
				}
			}else if(i==0){
				this.range[i]=rnd;
			}
		}		
		for(int i=0;i<6;i++){
			for(int j=0;j<6-i;j++){
				if(range[j]>range[j+1]){
					swap(range,j,j+1);
				}
			}
		}		
		return this.range;
	}
	
	public void myFunction(){
		int[] range=initFunction();
		int[] cha=new int[6];
		int min=1,count=0,scount=-1;
		int[] ssang=new int[12];
		
		for(int i=0;i<6;i++){
			cha[i]=range[i+1]-range[i];			
		}
		while(count==0){
			for(int i=0;i<cha.length;i++){
				if(min==cha[i]){
					ssang[++scount]=range[i];
					ssang[++scount]=range[i+1];
					count++;				
				}
			}
			min++;
		}		
		
		System.out.println("가장 가까운 수의 차이 : "+(min-1));
		System.out.println("가장 가까운 쌍의 개수 : "+count);
		System.out.print("가장 가까운 쌍 : ");
		for(int i=0;i<scount;i+=2){
			System.out.print("("+ssang[i]+", "+ssang[i+1]+")");		
		}
		
		
	}
	
	public int[] swap(int[] arr,int src,int dst){
		int tmp=arr[src];
		arr[src]=arr[dst];
		arr[dst]=tmp;
		return arr;
	}

}
