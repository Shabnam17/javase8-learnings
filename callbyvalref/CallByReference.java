package callbyvalref;

public class CallByReference {

	public static void main(String[] args) {
	Strength obj = new Strength();
	obj.x = 3;
	System.out.println(" obj.x before increment(obj) : "+obj.x);
	increment(obj);
	System.out.println(" obj.x after increment(obj) : "+obj.x);
	}

	private static void increment(Strength n) {
		System.out.println(" n.x before : "+n.x);
		n.x+=1;
		System.out.println(" n.x after : "+n.x);
	}
}
