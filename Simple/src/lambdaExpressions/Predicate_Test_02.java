package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String ename;
	double salary;
	int expr;
	
	public Employee(String name,double sal,int exp) {
		ename=name;
		salary=sal;
		expr=exp;
	}
}

public class Predicate_Test_02 {

	public static void main(String[] args) {
		Employee emp=new Employee("John", 40000.0, 5);
//		emp object->return name if sal>30k and expr>3
		Predicate<Employee> pr=	e->(e.salary>30000 && e.expr>3);
		System.out.println(pr.test(emp));
//		*************************************************
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("John", 40000.0, 2));
		al.add(new Employee("David", 50000.0, 3));
		al.add(new Employee("Nanny", 60000.0, 6));
		al.add(new Employee("Emma", 20000.0, 2));
		al.add(new Employee("Watson", 10000.0, 3));
		al.add(new Employee("Shane", 80000.0, 5));
		al.add(new Employee("Bond", 42000.0, 7));
		al.add(new Employee("Trent", 45000.0, 6));
		for (Employee e : al) {
			if (pr.test(e)) {
				System.out.println(e.ename+" : "+e.salary+" : "+e.expr);
			}
		}
	}

}
