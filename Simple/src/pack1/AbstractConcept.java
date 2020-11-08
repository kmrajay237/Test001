package pack1;

public class AbstractConcept {

	public static void main(String[] args) {
		
		ConceptAbstract ca=new ConceptAbstract();
//		System.out.println(ca.q);
//		ca.q=400;
		ca.method1();
	}

}

class ConceptAbstract{
	private int q=200;
	public void method1() {
		System.out.println("This is public method: "+q);
	}
}
