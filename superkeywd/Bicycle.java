package superkeywd;

public class Bicycle extends Vehicle{

	public Bicycle(){
		// super() even if not given,  the compiler automatically calls 
		//the constructor with no parameters of the parent class
		System.out.println("Child Bicycle");
	}
	public Bicycle(String s){
		//super(s);
		//above line if not specified, super() will be called here also
		System.out.println("Bicycle from : "+s);
	}
	
	public String classNme(){
		return "Bicycle -> "+super.classNme();
	}
	public static void main(String args[]){
		Bicycle bicl1 = new Bicycle();
		Bicycle bicl2 = new Bicycle("Hero Honda");
		System.out.println("Method Overriding \n"+bicl1.classNme());
		
	}
}
/* The this and super keywords can be used only on the first line of the constructor. 
 * Otherwise, a compile-time error will be generated.*/
 