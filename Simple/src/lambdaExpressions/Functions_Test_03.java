package lambdaExpressions;

import java.util.function.Function;

// Functions Chaining/Joining
/*
 * Function Chaining
 * -------------------
 * andThen()
 * compose()
 * 
 * */
public class Functions_Test_03 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1=n->2*n;
		
		Function<Integer, Integer> f2=n->n*n*n;
//		                    ---------->
		System.out.println(f1.andThen(f2).apply(2));
//		                    <----------
		System.out.println(f1.compose(f2).apply(2));

	}

}
