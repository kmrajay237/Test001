package pack1;

public interface MultipleInheritence {
	void m1();

	void m2();
}

//================implements ABC============================
interface Inter_One {
	void m3();
}

class ABC {

}

//====================================
interface Inter_Two {
	void m4();
}

//=======Nested interface=================
interface I1 {
	void m11();

	interface I2 {
		void m22();

		interface I3 {
			void m33();
		}

	}
}

class XYZ implements I1{

	@Override
	public void m11() {
		// TODO Auto-generated method stub
		
	}
	
}
//==============================

interface Inter_Three extends Inter_One, Inter_Two, MultipleInheritence {
	void m5();
}

class Class_One implements Inter_Three {

	public void m3() {
		System.out.println("m3");
	}

	public void m4() {
		System.out.println("m4");
	}

	public void m5() {
		System.out.println("m5");
	}

	public void m1() {
		System.out.println("m1");
	}

	public void m2() {
		System.out.println("m2");
	}

}