package lambdaExpressions;

import java.util.function.Predicate;

// Joining Predicates=> and , or , negate.
// p1 -- Checks if number is even.
// p2 -- Checks if number is greater than 50.
public class Predicate_Test_03 {

	public static void main(String[] args) {
		int []number= {5,10,15,20,25,30,35,40,45,50,55,60,65,70};
		Predicate<Integer> p1=(i)->(i%2==0);
		Predicate<Integer> p2=i->i>50;
		
//		And Operator
		System.out.println("And");
		for (int n : number) {

			if(p1.and(p2).test(n)) {       //if(p1.test(n) && p2.test(n))
				System.out.println(n);
			}
		}
		
//		OR Operator
		System.out.println("Or");
		for (int n : number) {

			if(p1.or(p2).test(n)) {       //if(p1.test(n) || p2.test(n))
				System.out.println(n);
			}
		}
		
//		Negate
		System.out.println("Negate");
		for (int n : number) {

			if(p1.negate().test(n)) {       //if(p1.test(n) || p2.test(n))
				System.out.println(n);
			}
		}
	}

}
