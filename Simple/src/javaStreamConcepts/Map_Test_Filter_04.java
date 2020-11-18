package javaStreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Test_Filter_04 {

	public static void main(String[] args) {
//		List<Employee> empList=new ArrayList<Employee>();
//		empList.add(new Employee(101, "Alex", 45000));
//		empList.add(new Employee(101, "Alex", 45000));
//		empList.add(new Employee(101, "Alex", 45000));
//		empList.add(new Employee(101, "Alex", 45000));
		
		
//		Collection --> stream --> filter --> map --> collect
		List<Employee> empList=Arrays.asList(
				new Employee(101, "Alex", 10000),
				new Employee(102, "Brian", 20000),
				new Employee(103, "Charles", 30000),
				new Employee(104, "David", 40000),
				new Employee(105, "Edward", 50000)
				);
		
//		Combination of filter and map
		List<Integer> empSalList=empList.stream()
					.filter(emp->emp.esalary>20000)  // filtering
					.map(emp->emp.esalary)
					.collect(Collectors.toList());
		System.out.println(empSalList);
	}

}

class Employee{
	int eid;
	String ename;
	int esalary;
	public Employee(int eid,String ename,int esalary) {
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
}
