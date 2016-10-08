package constructors;
import java.time.LocalDate;

public class BookDetailsThisKywd {

		private String name;
		private String publication;
		private LocalDate ordrDate;
		private double rate;

	
		
		public BookDetailsThisKywd(String name,String publication,LocalDate date){
			this.name = name;
			this.publication = publication;
			this.ordrDate = date;
		}

		public BookDetailsThisKywd(){
			//System.out.println("hi");
			//compilation error: call to this must be first statement in constructor

			this("The Diary of a Young girl","Penguin",LocalDate.now());
		}

		/*This new constructor has the same effect as the original version of this method. 
		 * However, this version is a better design. In some cases, the constructors may include many lines of code. 
		 * It is easier to maintain one constructor and have the others 
		 * call it than to maintain many different constructors. */
		public void setRate(double r){
			rate = r;
		}

		public String details(){
			return (name+" >> "+publication+" >> "+ordrDate);
			
		}
		public static void main(String[] args) {
			BookDetailsThisKywd bd = new BookDetailsThisKywd();
		bd.setRate(1200);
		System.out.println("Details : "+bd.details());
		System.out.println("Rate : "+bd.rate);

		
	}

}
