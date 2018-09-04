package ncs.test8;

public class Airplane extends Plane {
	
	public Airplane(){}
	
	public Airplane(String planeName,int fuelSize){
		super(planeName,fuelSize);
	}
	
	@Override
	public void flight(int distance){
		super.refuel(-(3*distance));
	}

}
