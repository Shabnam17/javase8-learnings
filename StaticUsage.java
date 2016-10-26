package conceptInheritance;

class Super {
	static String ID = "QBANK";
}

class Sub extends Super {
	static {
		System.out.print("In Sub");
	}
}

public class Oops {
	public static void main(String[] args) {
		System.out.println(Sub.ID);
		System.out.println("======================");
		System.out.println(new Sub().ID);
	}
}
