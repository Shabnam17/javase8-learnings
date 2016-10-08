package staticvar;

public class TestStudentPrtfl {
public static void main(String[] args){
	StudentPortfolio student1 = new StudentPortfolio();
	StudentPortfolio student2 = new StudentPortfolio();
	StudentPortfolio student3 = new StudentPortfolio();
	
	System.out.println("Marks of first student :"+student1.getMarkTracker());
	System.out.println("Marks of second student :"+student2.getMarkTracker());
	System.out.println("Marks of third student :"+student3.getMarkTracker());

	/* This code segment creates three instances of the StudentPortfolio class.
	 *  It then prints to standard output 
	 * the markTracker that was assigned to each from the StudentPortfolio constructor.*/

	System.out.println("Next mark will be :" +StudentPortfolio.marks);
//Notice how the class name is used to access this public variable
}
}
