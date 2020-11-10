package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employees{
	String ename;
	int salary;
	public Employees(String ename,int salary) {
		this.ename=ename;
		this.salary=salary;
	}
}

public class Functions_Test_02 {

	public static void main(String[] args) {
		List<Employees> empList=new ArrayList<Employees>();
		empList.add(new Employees("Ajay", 70000));
		empList.add(new Employees("Vijay", 50000));
		empList.add(new Employees("Sanjay", 30000));
		empList.add(new Employees("Pappu", 10000));
//		Calculate Bonus and return the Bonus
		Function<Employees, Integer> fn=(emp)->{
			int sal=emp.salary;
			if(sal>=10000 && sal<= 20000) 
				return (sal*40/100);
			else if(sal>20000 && sal<=30000)
				return (sal*30/100);
			else if(sal>30000 && sal<=50000)
				return (sal*20/100);
			else
				return (sal*10/100);
		};
		
		Predicate<Integer> p=b->b>5000;
		
		for (Employees e : empList) {
			int bonus=fn.apply(e);
			if (p.test(bonus)) {
				System.out.println("Name: "+e.ename+" and Salary: "+e.salary+" and bonus: "+bonus);
			}
		}
	}

}
