package pack1;

public class B {
	public static void main(String[] args) {
		BB bb=new BB();
		System.out.println(bb.a);
	}
}

class BB{
	int a=30;
	void method1() {
		System.out.println("Method: "+a);
	}
}
