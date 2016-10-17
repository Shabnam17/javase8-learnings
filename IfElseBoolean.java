package conditionalstatements;

public class IfElseBoolean {

	public static void main(String... args){
		boolean b;
		boolean bValue = (b = true);
		if(bValue)
			System.out.println("bValue True");
		else System.out.println("bValue False");
	
		if(bValue = false)
			System.out.println("True");
			else System.out.println("False");
		
		if(bValue == false) System.out.println("using == True");
		else System.out.println("using == False");
		
	int i;
	int iValue = (i = 1);
//	if (iValue){
//		System.out.println("will not compile since the expression does not return boolean");
//		
//	}
	if(i == 1){
		System.out.println(" i is : "+iValue);
	}
	Boolean wrapperBoolean = new Boolean("true");
	System.out.println("Wrapper Boolean : "+wrapperBoolean);
	// use of Boolean object
	if(wrapperBoolean){
		System.out.println(" Unboxing happens from TRUE to true ");
	}
	
	int a = 9+78+ 98;
	String ternary = (a>50) ? "Greater than 50" : "Lesser than 50";
	System.out.println("Result of ternary operator : "+ternary);
	
	System.out.println(" using if then else :");
	if(a> 50){
		System.out.println("Greater than 50");
	} else{
		System.out.println("Lesser than 50");
	}
	
	
	
	System.out.println("Ways of declarinng Boolean objects : \n");
	System.out.println("1 : "+Boolean.TRUE);
	System.out.println("2 : "+new Boolean(true));
	System.out.println("3 : "+new Boolean("trUE"));// equalsIgnoreCase
	System.out.println("4 : "+new Boolean("true"));
	System.out.println("5 : "+new Boolean("smtg"));
	System.out.println("6 : "+new Boolean(null));
	System.out.println("7 : "+new Boolean(true ));
	System.out.println("8 : "+new Boolean("true "));// "true "  with an extra space
	}
}
