package lambdaExpressions;

import java.util.function.Function;

public class Functions_Test_01 {

	public static void main(String[] args) {
		Function<Integer, Integer> fn=n->n*n;
		System.out.println(fn.apply(5));
		System.out.println(fn.apply(4));
		System.out.println(fn.apply(3));
		System.out.println(fn.apply(2));
		System.out.println(fn.apply(1));
		
//		String Length -- Pass String as input and return int value as length
		System.out.println("String Length -- Pass String as input and return int value as length");
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("Welcome"));
		System.out.println(f.apply("Java"));
		System.out.println(f.apply("Programming"));
		System.out.println(f.apply("Hello"));
		System.out.println(f.apply("World"));
	}

}
