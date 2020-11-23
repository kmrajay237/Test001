package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_02_DataDrivenTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd, String exp) {
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys(user);

		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys(pwd);

		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

		String exp_title = "Dashboard / nopCommerce administration";
		String act_title = driver.getTitle();

		if (exp.equals("valid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		} else if (exp.equals("invalid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
	}
 
	@DataProvider(name = "LoginData")
	public String[][] getdata() throws Exception {
//		get data from excel
		String path="./datafiles/testData.xlsx";
		ExcelUtility utility=new ExcelUtility(path);
		int totalrows = utility.getRowCount("data");
		int totalcolumns = utility.getCellCount("data", 1);
		String loginData[][]=new String[totalrows][totalcolumns];
		
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcolumns;j++) {
				loginData[i-1][j]=utility.getCellData("data", i, j);
			}
		}
		
		
		return loginData;
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
