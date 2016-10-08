package superkeywd;

public class Vehicle {

	public Vehicle(){
		System.out.println("Parent Vehicle");
	}
	
	public Vehicle(String s){
		System.out.println("Parent Vehicle from : "+s);
	}
	
	public String classNme(){
		return "Vehicle";
	}
}
