package constructors;

import java.time.LocalDate;

public class BookDetailsAdvncd {
/*	 To overload a constructor, the 
	 programmer must declare another 
	 constructor with the same name but a 
	 different parameter list. This is useful 
	 when a class wants to provide a simple constructor for most cases and a 
	 more advanced one for when it is needed. */
	
	
	private String name;
	private String publication;
	private LocalDate ordrDate;
	private double rate;

	public BookDetailsAdvncd(){
		name = "HarryPotter and the cursed child";
		publication = "Penguin Publications";
		ordrDate = LocalDate.now();
		rate =0;
	}

	//below method implies an overloading constructor which gives 
	//the user the entire privilege to initialize theobject parameters
	public BookDetailsAdvncd(String name,String publication,LocalDate date){
		this.name = name;
		this.publication = publication;
		this.ordrDate = date;
	}
	//This code is valid since the constructor is overloaded.
/*	 It is possible to overload the constructor as many times as needed, as long as each constructor has a unique set of parameters. The parameters are considered unique if the data types do 
		 not match any of the other constructors’ data types.*/
	
	public void setRate(double r){
		rate = r;
	}

	public String details(){
		return (name+" >> "+publication+" >> "+ordrDate);
		
	}
	public static void main(String[] args) {
	BookDetailsAdvncd bd = new BookDetailsAdvncd();
	bd.setRate(1200);
	System.out.println("Details : "+bd.details());
	System.out.println("Rate : "+bd.rate);
	BookDetailsAdvncd bd2 = new BookDetailsAdvncd("The Diary of a Young girl","Penguin",LocalDate.now());
	System.out.println("Using the parameterised constructor : " +bd2.details());
	}
}
