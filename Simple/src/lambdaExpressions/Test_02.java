package lambdaExpressions;

@FunctionalInterface
interface Cab_02{
	public void bookCab(String source,String destination);
}

public class Test_02 {
	public static void main(String[] args) {
		Cab_02 cab=(source,destination)->System.out.println("Ola cabs booked from "+source+" to "+destination);
		cab.bookCab("B'lore", "Mumbai");
	}

}
