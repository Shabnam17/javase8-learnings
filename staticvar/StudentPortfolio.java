package staticvar;

public class StudentPortfolio {

	public static int marks = 40;
	private int markTracker;
	
	public StudentPortfolio(){
		this.markTracker = marks;//Class variables with less restrictive( public static int marks) access modifiers 
		//can be accessed in code similar to how class methods are accessed. 
		marks ++;
	}
	/* In the output, notice how each tracking number is incremented by 1.
	 *  This happens because the static variable, marks, is a class variable and therefore common between all instances of the object.
*/
	public int getMarkTracker(){
		return markTracker;
	}
}
