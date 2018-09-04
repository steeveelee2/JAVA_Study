package ncs.test8;

public class Cargoplane extends Plane {
	
public Cargoplane(){}
	
	public Cargoplane(String planeName,int fuelSize){
		super(planeName,fuelSize);
	}
	
	@Override
	public void flight(int distance){
		super.refuel(-(5*distance));
	}

}
