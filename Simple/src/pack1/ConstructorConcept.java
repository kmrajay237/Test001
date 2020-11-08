package pack1;

public class ConstructorConcept {

	public static void main(String[] args) {
		ConstructorTest ct1=new ConstructorTest(101,"Arya",123.4567d);
		System.out.println(ct1.roll);
		System.out.println(ct1.name);
		System.out.println(ct1.salary);
		
		
		ConstructorTest ct2=new ConstructorTest(102,"Stark",897.45123d);
		System.out.println(ct2.roll);
		System.out.println(ct2.name);
		System.out.println(ct2.salary);
		
		ConstructorTest ct3=new ConstructorTest(103,"Tony",897123d);
		System.out.println(ct3.roll);
		System.out.println(ct3.name);
		System.out.println(ct3.salary);
		
		ConstructorTest ct4=new ConstructorTest(104,"Hulk");
		System.out.println(ct4.roll);
		System.out.println(ct4.name);
	}

}

class ConstructorTest {
	public int roll;
	public String name;
	public double salary;
	public ConstructorTest(int roll,String name,double salary) {
		this.roll=roll;
		this.name=name;
		this.salary=salary;
	}
	
	public ConstructorTest(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
}

// Constructor name must be same as class name
// Constructor must not have any return type
// Access Modifiers (Public , Default , Private , Protected)
// final , static, strictfp