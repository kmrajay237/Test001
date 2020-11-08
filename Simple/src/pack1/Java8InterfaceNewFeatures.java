package pack1;

public interface Java8InterfaceNewFeatures {
	void m1();
	default void m2() {
		System.out.println("Default Method inside Interface");
	}
	static void m3() {
		System.out.println("Static Method inside Interface");
	}
}
class PQR implements Java8InterfaceNewFeatures{

	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	
}
