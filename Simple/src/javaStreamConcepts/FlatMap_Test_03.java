package javaStreamConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Test_03 {

	public static void main(String[] args) {
		List<Student> list1=Arrays.asList(
				new Student(101, "Alex", 'A'),
				new Student(102, "John", 'B'),
				new Student(103, "Kennedy", 'C'),
				new Student(104, "Parth", 'B'),
				new Student(105, "Nayar", 'E'),
				new Student(106, "Stuart", 'F')
				);
		
		List<Student> list2=Arrays.asList(
				new Student(107, "Ranjit", 'A'),
				new Student(108, "Rohan", 'B'),
				new Student(109, "Mohan", 'C'),
				new Student(110, "Lala", 'B'),
				new Student(111, "Bala", 'E'),
				new Student(112, "Virat", 'F')
				);
		
		List<List<Student>> bigList = Arrays.asList(list1,list2);
//		for (List<Student> student : bigList) {
//			for (Student stu : student) {
//				System.out.println(stu.sname);
//			}
//		}
		
		List<String> n = bigList.stream().flatMap(x->x.stream()).map(y->y.sname).collect(Collectors.toList());
		System.out.println(n);
	}

}

class Student{
	int sid;
	String sname;
	char sgrade;
	public Student(int id,String name,char grade) {
		sid=id;
		sname=name;
		sgrade=grade;
	}
}
