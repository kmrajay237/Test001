package pack1;

public class Tomato {

	public static void main(String[] args) {
		WEBDRIVER driver=new CHROMEDRIVER();
		driver.m1();

	}

}


//WebDriver driver =new ChromeDriver();

interface WEBDRIVER{
	void m1();
}

class CHROMEDRIVER implements WEBDRIVER{

	@Override
	public void m1() {
		System.out.println("M1");
		
	}
	
}