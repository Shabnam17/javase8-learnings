package superkeywd;

class ParentClass {
	
	public String className(){
		return "ParentClass";
	}
	
	public ParentClass(){
		System.out.println("ParentClass Constructor ");
	}
	
	public ParentClass(String s){
		System.out.println("ParentClass Constructor "+s);
	}
}

public class ChildClass extends ParentClass{
	
	public String className(){
		//super.methodIdentifier
		return "ChildClass -> "+super.className();
	}
	
	public ChildClass(){
		System.out.println("ChildClass Constructor ");
	}
	
	public ChildClass(String s){
		//System.out.println("hello");  will generate compile time error
		super(s);
		System.out.println("ChildClass Constructor "+s);
	}
	public static void main(String[] args) {
		ChildClass child1 = new ChildClass();
		ChildClass child2 = new ChildClass("test");
		System.out.println(child1.className());
	}

}
