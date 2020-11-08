package pack1;

public class ThisConstructorCall {

	public static void main(String[] args) {
		ThisTest tt=new ThisTest(10,20);

	}

}
class ThisTest{
	public ThisTest() {
		System.out.println("This Constructor without parameter");
	}
	public ThisTest(int a) {
		this();
		System.out.println("This Constructor with one parameter");
	}
	public ThisTest(int a , int b) {
		this(a);
		System.out.println("This Constructor with two parameters");
	}
}
