package callbyvalref;

public class CallByValue {

	public static void main(String args[]){
     int[] studentId = {00,01,02,03};
     int stdlength = studentId.length;
     System.out.println("current strength : "+stdlength);
     addNewStudent(stdlength);// this value contained in "stdlength" is copied to addNewStudent(int n) {..}
     System.out.println("current strength after adding new student: "+stdlength);
	}

	private static void addNewStudent(int n) {
	    System.out.println("current val of n : "+n);
		n +=1;
		System.out.println("n after incrementing : "+n);
	}
	
	/* What we mean by passing a variable by value is that the value held in the variable
	 *  that is passed as an argument is copied into the parameters that are defined in the method header. That is why changes made
	 *  to the variable within the method had no effect on the variable that was passed. On the other hand, when objects are passed, 
	 *  the object itself is passed. No copy is made. Therefore changes made to the object within the method increment() had an effect on the original object.  */

}
