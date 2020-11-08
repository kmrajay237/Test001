package pack1;

public class SuperTest {

	public static void main(String[] args) {
		SuperChild sc=new SuperChild();
		sc.m2();
		sc.m1();
		SuperChild sc1=new SuperChild(10);
	}

}

class SuperParent{
	String str="Hello World";
	public void m1() {
		System.out.println("This M1 method in Parent class");
	}
	
	public SuperParent() {
		System.out.println("This is super class constructor");
	}
	public SuperParent(int a) {
		System.out.println("This is super class overloaded constructor");
	}
	
}

class SuperChild extends SuperParent{
	String str="Hello Universe";
	public void m2() {
		System.out.println("Super Class String: "+super.str);
		System.out.println("Child Class String: "+str);
	}
	public void m1() {
		super.m1();
		System.out.println("Overridden Method");
	}
	
	public SuperChild() {
		super();
		System.out.println("This is child class constructor");
	}
	
	public SuperChild(int b) {
		super(b);
		System.out.println("This is child class overloaded constructor");
	}
}
