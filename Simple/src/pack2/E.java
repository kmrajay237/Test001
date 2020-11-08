package pack2;

import pack1.DD;

public class E {

	public static void main(String[] args) {
		EE ee=new EE();
		ee.method_EE();

	}

}

class EE extends DD{
	public void method_EE() {
		System.out.println("Method_EE: "+d);
	}
}
