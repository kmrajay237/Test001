package javapractice;

public class JavaClassConcept {

	public static void main(String[] args) {
		AbstractImplementationClass aic=new AbstractImplementationClass();
		aic.abstractMethod1();
		aic.abstractMethod2(10, 20);
		aic.datamember1=500;
		System.out.println("Value Reassigned for Data Member 1: "+aic.datamember1);
		aic.datamember2=45.89f;
		System.out.println("Value Reassigned for Data Member 2: "+aic.datamember2);
		aic.nonAbstractMethod3();
	}
	
}

abstract class AbstractClassConcept{
	int datamember1=100;
	float datamember2=23.09f;
	public abstract void abstractMethod1();
	public abstract void abstractMethod2(int a,int b);
	public void nonAbstractMethod3() {
		System.out.println("This is Non-Abstract Method");
	}
}

class AbstractImplementationClass extends AbstractClassConcept{

	@Override
	public void abstractMethod1() {
		System.out.println("Implementation of Abstract Method 1");
		System.out.println("Data Member 1 of Abstract Class: "+datamember1);
		
	}

	@Override
	public void abstractMethod2(int a, int b) {
		System.out.println("Implementation of Abstract Method 1");
		System.out.println("Data Member 2 of Abstract Class: "+datamember2);
	}
	
}
