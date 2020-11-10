package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumer_Test_02 {

	public static void main(String[] args) {
		List<FactoryEmployee> al=new ArrayList<FactoryEmployee>();
		al.add(new FactoryEmployee("David", 50000, "Male"));
		al.add(new FactoryEmployee("John", 30000, "Male"));
		al.add(new FactoryEmployee("Mary", 60000, "Female"));
		al.add(new FactoryEmployee("Emma", 70000, "Female"));
		al.add(new FactoryEmployee("Nathan", 45000, "Transgender"));
		
//		Function
		Function<FactoryEmployee,Double> f=emp->(emp.salary*10)/100;  //Task-1
		
//		Predicate
		Predicate<Double> p=b->b>5000;   //Task-2
		
//		Consumer
		Consumer<FactoryEmployee> c=emp->{   //Task-3
			System.out.println("Name: "+emp.ename);
			System.out.println("Salary: "+emp.salary);
			System.out.println("Gender: "+emp.gender);
		};
		
		for (FactoryEmployee e : al) {
			double bonus=f.apply(e);
			if (p.test(bonus)) {
				c.accept(e);
				System.out.println("Bonus: "+bonus);
				System.out.println("**************************");
			}
		}
	}

}

class FactoryEmployee{
	String ename;
	double salary;
	String gender;
	public FactoryEmployee(String ename,double salary,String gender) {
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}
}
