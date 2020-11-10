package lambdaExpressions;

public class Test_01 {

	public static void main(String[] args) {
		Cab cab=()->System.out.println("Ola Cab booking Successful");
		cab.bookCab();

	}

}

@FunctionalInterface
interface Cab{
	public void bookCab();
}
