package lambdaExpressions;


interface Cab_03{
	public String bookCab(String source,String destination);
	default void m2() {
		System.out.println("Default method in Functional Interface");
	}
	static void m3() {
		System.out.println("Static method in Functional Interface");
	}
}

public class Test_03 {
	public static void main(String[] args) {
		Cab_03 cab=(source,destination)->{
			System.out.println("Ola cabs booked from "+source+" to "+destination);
			return ("Price : 300 INR");
		};
		System.out.println(cab.bookCab("Gere", "BudhGere"));
		cab.m2();
		Cab_03.m3();
	}
}
