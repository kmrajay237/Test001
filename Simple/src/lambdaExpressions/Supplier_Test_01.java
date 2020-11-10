package lambdaExpressions;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Test_01 {

	public static void main(String[] args) {
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
	}

}
