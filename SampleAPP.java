package tutorial;

// interface with single ABSTRACT method > Functional Interface
// can have default methods
interface Liable{
	int execute(int a, int b);
}
interface StringLiable{
	int execute(String a);
}

class Operator{
	public void operate(Liable e){
		int val = e.execute(12,13);
		System.out.println("Value is : "+val);
	}
	
	public void operate(StringLiable e){
		int val = e.execute("HELLO");
		System.out.println("Value is : "+val);
	}
}

/*
 * Valid Lambda Expressions
 * 
 * () -> System.out.println("This code is passed in a lambda expression");
	
	() -> {
	System.out.println("This code is passed in a lambda expression");
	System.out.println("Hello There");
	}	
 *
 *
 *  when the method is returning an int value
 *
 *   () -> {
 *      System.out.println("This code is passed in a lambda expression");
	    return 8;
	}
 *
 *
 *  OR SIMPLY
 *  
 *  () -> 8
 *  
 *  Passing method parameter "int a"
 *  
 *  (int a) -> 8 // NEED NOT SPECIFY RETURN TYPE. Compiler Knows!! :)
 *  
 *  or
 *  
 *  (int a) -> 8+a
 *  
 *  // JAVA CAN EVEN INFER THE RETURN TYPE OF METHOD PARAMETERS !
 *  
 *  (a) -> 8+a  also WORKS! :)
 *  
 *  
 *  a-> 8+a ; // Only one parameter so no need of paranthesis around a
 
   (a,b)-> 8+a
 */


public class SampleAPP {
	public static void main(String[] args) {
		
		 int c = 100;
		// Mustn't do this ; c = 8;
		 //Local variable c defined in an enclosing scope
		 //must be final or effectively final
		 
		 int d = 77;
		Operator op = new Operator();
		op.operate(new Liable() {
			
			public int execute(int a,int b) {
				System.out.println("From Anonymous inner type");
				int d =88;
				return a+b+c;
			}
		});
		
		System.out.println("====================");
		
		//op.operate((a) -> 8+a);//The method operate(Liable) is ambiguous for the type Operator
	// two possible i=operate methods
		
		// we can use local variables in Lambda expression as long as they are effectively final
		op.operate( (a,b)->{
		// Can't do this-- >	int d = 99; Lambda expression's local variable d cannot redeclare another local variable defined in an enclosing scope. 
			return  a+b+c;
		});
	}
}
