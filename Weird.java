package inheritance;

class Q{
	{
		System.out.println("Instance initializer block in CLASS Q ");
	}
   Q(){
	System.out.println("Constructor in Q");
   }
   static{
		 System.out.println("static block in Q");
	 }
   static{
		 System.out.println("second static block in Q");
	 }
   
   static void getId(){
   }
   
   static void getNo(){
   }
   
   void getName(){
	   
   }
   
 
}

class R extends Q{
	{
		System.out.println("Instance initializer block in CLASS R ");
	}
	 static{
		 System.out.println("static block in R");
	 }
	 R(){
			System.out.println("Constructor in R");
	 }
	 static{
		 System.out.println("second static block in R");
	 }
	 static void getId(){ // shadows getId() of class Q
		   
	  }
	 
//	 void getNo(){ // This instance method cannot override the static method from Q
//		   
//	  }
	 
//	static void getName(){
//		   
//	   }
	 
//	 Trying to override a static method with a non-static method (and vice-versa) in a class will result in a compilation error. 
//   Even in case of interfaces, a subinterface not override a default method with a static method. 
}

class S extends R{
	{
		
		System.out.println("Instance initializer block in CLASS S ");
	}
	S(){
		System.out.println("Constructor in S");
	 }
	 static{
		 System.out.println("static block in S");
	 }
		static{
			System.out.println("second static block in S");
		}
}


interface Base{
	default int getN(){
		return 5;
	}
	
	default int getT(){
		return 35;
	}
	
	static int getH(){
		return 34;
	}

}

interface Child extends Base{
	
//	static int getN(){ //This static method cannot hide the instance method from Base
//		return 15;
//	}
	
	 int getN(); // is possible to override default getN() of Base using abstract getN() in child
	
	 default int getT(){  // overrides
			return 39;
		}
	 
	default int getH(){ // default methods CAN OVERRIDE STATIC METHOD in base interface
			return 34;
		}
	 
}



public class Weird {
   public static void main(String[] args) {
	   R s = new R();// static q,r,s.. II,Cons (Q); II,Cons (R); II,Cons (S),
	   
	   System.out.println("=========================");
	   S ss = new S();
	   System.out.println("NOTE THAT STATIC BLOCKS ARE EXECUTED ONLY ONCE UNLIKE INSTANCE INITIALIZER AND CONSTRUCTOR");
}
}

	 
//	static void getName(){
//		   
//	   }
	 
//	 Trying to override a static method with a non-static method (and vice-versa) in a class will result in a compilation error. 
//   Even in case of interfaces, a subinterface not override a default method with a static method. 
}

class S extends R{
	{
		System.out.println("Instance initializer block in CLASS S ");
	}
	S(){
		System.out.println("Constructor in S");
	 }
	 static{
		 System.out.println("static block in S");
	 }
}


interface Base{
	default int getN(){
		return 5;
	}
	
	default int getT(){
		return 35;
	}
	
	static int getH(){
		return 34;
	}
}

interface Child extends Base{
	
//	static int getN(){ //This static method cannot hide the instance method from Base
//		return 15;
//	}
	
	 int getN(); // is possible to override default getN() of Base using abstract getN() in child
	
	 default int getT(){  // overrides
			return 39;
		}
	 
	default int getH(){ // default methods CAN OVERRIDE STATIC METHOD in base interface
			return 34;
		}
	 
}



public class Weird {
   public static void main(String[] args) {
	   S s = new S();// static q,r,s.. II,Cons (Q); II,Cons (R); II,Cons (S),
}
}
