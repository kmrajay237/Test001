package pack1;

public class InheritenceConcept {

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		System.out.println(cc.cash);
		cc.takeCash();
		
	}

}

class ParentClass{
	double cash=120000.45678d;
	public void takeCash() {
		System.out.println("Take Cash: "+cash);
	}
}

class ChildClass extends ParentClass{
	
}
