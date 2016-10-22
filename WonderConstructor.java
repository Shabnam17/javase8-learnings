package constructors;

public class WonderConstructor {

	int a;
	int b;
	int c;

	WonderConstructor(int a, int b, int c) {
		System.out.println(" a syso line here has no troublesr");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// overloading constructor

	WonderConstructor(int k, int l) {
		this.a = 123 + k;
		this.b = 234 + l;
		this.c = 456;
	}
// It is possible to overload the constructor as many times as needed,
// as long as each constructor has a unique set of parameters. 
	
	
	WonderConstructor(){
	//System.out.println(); compiler error
		this(222,333,444);  // this keywrd used to access the constructor WonderConstructor(int a, int b, int c){...}
	}
	
	public int getStatus(){
		return 200;
	}
	
	private int setC(int p) {
		// using this operator to access methods
		System.out.println("status : " + this.getStatus());
		this.c = p;
		return c;
	}

	public static void main(String[] args) {
		WonderConstructor won = new WonderConstructor();
		int x = 100, y = 200;
		WonderConstructor won1 = new WonderConstructor(x, y);
		int newC = won.setC(999);
		System.out.println("a : " + won.a + " , b : " + won.b + " , c : " + newC);
		System.out.println("a : " + won1.a + " , b : " + won1.b + " , c : " + won1.c);
	}
}
