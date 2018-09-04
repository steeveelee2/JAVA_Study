package ncs.test8;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane(){}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel){
		this.fuelSize+=fuel;
	}
	
	public void flight(int distance){}
	
	public String getPlaneName(){
		return planeName;
	}
	public int getFuelSize(){
		return fuelSize;
	}
	
	public void setPlaneName(String planeName){
		this.planeName=planeName;
	}
	public void setFuelSize(int fuelSize){
		this.fuelSize=fuelSize;
	}
	

}
