package pack1;

public class AbstractClassConcept {

	public static void main(String[] args) {
//		AbsClass abs=new AbsClass();
		NonAbsClass nonabs = new NonAbsClass(10);
		nonabs.m1();
		nonabs.m2();
		nonabs.m3();
//		nonabs.m4();
		NonAbsClass.m4();
//		AbsClass.m4();
		nonabs.m5();

	}

}

abstract class AbsClass extends AbstractClassConcept {
	public static void main(String[] args) {

	}

		public static void main(String[] args, int a) {
	
		}

	abstract public void m1();

	abstract public void m2();

	public void m3() {
		System.out.println("Non-Abstract Method in Abstract class");
	}

	public AbsClass(int a) {
		System.out.println("Constructor in Abstract Class");
	}

	public static void m4() {
		System.out.println("Static Method m4 in Abstract class");
	}

	public final void m5() {
		System.out.println("This Final method m5 in abstract class");
	}
}

class NonAbsClass extends AbsClass {

	public NonAbsClass(int a) {
		super(a);
	}

	@Override
	public void m1() {
		System.out.println("Abstarct method m1");
	}

	@Override
	public void m2() {
		System.out.println("Abstract Method m2");
	}
}
