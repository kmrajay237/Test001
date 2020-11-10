package lambdaExpressions;

import java.util.function.Consumer;

public class Consumer_Test_01 {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Heloo World");
	}

}
