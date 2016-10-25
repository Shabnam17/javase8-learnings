package staticblock;

 class Super {
	static {
		System.out.print("super ");
	}
}
class One {
	static {
		System.out.print("one ");
	}
}
class Two extends Super {
	static {
		System.out.print("two ");
	}
}
class Test {
	public static void main(String[] args) {
//		One o = null;
//		Two t = new Two();  // super two 
		
		
//		One o1 = new One();
//		Two t1 = new Two(); // one super two
		
		Two t2 = new Two();
		One o2 = new One();  //super two one
	}

}
