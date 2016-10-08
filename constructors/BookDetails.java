package constructors;

import java.time.LocalDate;


public class BookDetails {
private String name;
private String publication;
private LocalDate ordrDate;
private double rate;

public BookDetails(){
	name = "HarryPotter and the cursed child";
	publication = "Penguin Publications";
	ordrDate = LocalDate.now();
	rate =0;
}

public void setRate(double r){
	rate = r;
}

public String details(){
	return (name+" "+publication+" "+ordrDate);
	
}
public static void main(String[] args) {
BookDetails bd = new BookDetails();
bd.setRate(1200);
System.out.println("Details : "+bd.details());
System.out.println("Rate : "+bd.rate);
}
}

/*This class is used to calculate details about a
book. The constructor is called BookDetails.
It does not accept any parameters. Notice that it has 
no return type declared. When a BookDetails object is created,
		the constructor sets the name, publication, and 
		ordrDate instance values to their default settings. 
		This class assumes that the user will later set the 
		rate based on the book in question—that 
		is why the setter, setRate, for the principal 
		instance variable is included with this class. This 
		class includes another method for displaying the details 
		of the book.*/
