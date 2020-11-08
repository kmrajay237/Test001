package pack1;

public class PolyMorphismConcept {
	public static void main(String[] args) {
		Poly p = new Poly();
		p.m1();
		p.m1(10);
		p.m1(23.45f);
		p.m1(10, true);
		p.m1(true, 40);

	}
}

class Poly{
	public void m1() {
		System.out.println("This is M1 method with no parameter");
	}
	public void m1(int a) {
		System.out.println("This is M1 method with int Parameter");
	}
	public void m1(float a) {
		System.out.println("This is M1 method with float Parameter");
	}
	public void m1(int a,boolean b) {
		System.out.println("This is M1 method with two (int and boolean) Parameter");
	}
	public void m1(boolean b,int a) {
		System.out.println("This is M1 method with two (boolean and int) Parameter and diffrent order");
	}
}
//Method name must be same
//Parameter data type must be different in case same no. of parameters
//Order of parameter must be different in case same no. of parameters
//Overloading
