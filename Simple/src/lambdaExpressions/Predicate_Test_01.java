package lambdaExpressions;

import java.util.function.Predicate;
// Predicate-->one parameter only and returns boolean
// Used for conditional checks only
public class Predicate_Test_01 {

	public static void main(String[] args) {
//		Example 1
		Predicate<Integer> p1=i->(i>10);
//					or
		Predicate<Integer> p2=(i)->(i>10);
		System.out.println(p1.test(20));
		
		System.out.println(p2.test(5));
		
//		Example 2 : Check length of String is greater than 4.
		Predicate<String> p3=(str)->(str.length()>4);
		System.out.println(p3.test("Welcome"));
		System.out.println(p3.test("Non"));
		
//		Example 3 : Use of Predicate in Array
		String names[]= {"David","John","Smith","Scott","Mary"};
		Predicate<String> p4=(str)->(str.length()>4);
		for (String name : names) {
			if(p4.test(name))
				System.out.println(name);
		}

	}

}
