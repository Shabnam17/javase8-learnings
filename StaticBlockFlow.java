package iherSimple;

class Employee {
	Employee(){
		System.out.println(" Constructor from Employee ");
	}
	static int i = 10;
	{
		i = 15;
		System.out.print(" Employee " + i);
	}
	static {
		System.out.print(" Employee static " + i);
	}
}

class Manager extends Employee {
	Manager(){
		System.out.println(" Constructor from Manger ");
	}
	static {
		i = 45;
		System.out.print(" Manager static ");
	}
	{
		i = 30;
		System.out.print(" Manager " + i);
	}
}

class Owner extends Manager {
	static int i = 78;
	{
		System.out.println(" hello from owner ");
	}
	static {
		System.out.println("Owner"+i);
	}
}

public class TestClass {
	public static void main(String[] args) {
		Owner o = new Owner(); 
		// static block of base, static block of derived,
		// non static codeblock of base, constrctr of base,
		//  non static codeblock of derived, constrctr of derived,
	// other non executed code blocks
		
		
		
/*  output
 Employee static 10 Manager static Owner78
 Employee 15 Constructor from Employee 
 Manager 30 Constructor from Manger 
 hello from owner 
*/
	}
}
