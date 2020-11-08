package pack2;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild sc=new SuperChild(10);
		sc.m1();
	}

}

class SuperClass{
	int a=10;
	public SuperClass(int c) {
		System.out.println("SUper Class Constructor");
	}
	public void m1() {
		System.out.println("Hello Universe");
	}
	
}

class SuperChild extends SuperClass{

	public SuperChild(int c) {
		super(c);
		System.out.println("Super Child Constructor");
	}
	public void m1() {
		System.out.println("Hello World");
		super.m1();
		System.out.println("Super Class Variable: "+super.a);
	}
	
}
