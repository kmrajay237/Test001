package pack1;

public interface Interface_One {
	public static final int a = 10;
	final int b=20;
	static int c=30;
	public int d=50;
	int e=60;
	void m1();
	abstract void m2();
	abstract public void m3();
//	public void m4();

}

class Method_Implementation implements Interface_One{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
	public static void m5() {
		System.out.println(Interface_One.a);
		System.out.println(Interface_One.b);
		System.out.println(Interface_One.c);
		System.out.println(Interface_One.d);
		System.out.println(Interface_One.e);
	}
	
}
