package ncs.test8;

class PlaneTest {

	public static void main(String[] args) {
		Airplane ap=new Airplane("L747",1000);
		Cargoplane cp=new Cargoplane("C40",1000);
		
		System.out.println("Plane"+"\t"+"fuelSize");
		System.out.println("----------------------");
		System.out.println(ap.getPlaneName()+"\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t"+cp.getFuelSize());
		
		System.out.println("100 운항");
		ap.flight(100);
		cp.flight(100);
				
		System.out.println("Plane"+"\t"+"fuelSize");
		System.out.println("----------------------");
		System.out.println(ap.getPlaneName()+"\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t"+cp.getFuelSize());
		
		System.out.println("200 주유");
		ap.refuel(200);
		cp.refuel(200);
		
		System.out.println("Plane"+"\t"+"fuelSize");
		System.out.println("----------------------");
		System.out.println(ap.getPlaneName()+"\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t"+cp.getFuelSize());

	}

}
