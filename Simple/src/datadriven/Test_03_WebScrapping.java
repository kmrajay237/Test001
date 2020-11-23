package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_03_WebScrapping {
// Writing web table into excel file
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url="https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population";
		driver.get(url);
		String path="./datafiles/Population.xlsx";
		ExcelUtility util=new ExcelUtility(path);
		
//		write headers in excel
		util.setCellData("Population", 0, 0, "Country");
//		util.fillGreenColor("Population", 0, 0);
		
		util.setCellData("Population", 0, 1, "Population");
//		util.fillGreenColor("Population", 0, 1);
		
		util.setCellData("Population", 0, 2, "% of World");
//		util.fillGreenColor("Population", 0, 2);
		
		util.setCellData("Population", 0, 3, "Date");
//		util.fillGreenColor("Population", 0, 3);
		
		util.setCellData("Population", 0, 4, "Source");
//		util.fillGreenColor("Population", 0, 4);
		
//		Capture Table rows
		WebElement table = driver.findElement(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody"));
		
//		driver.findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr"));
		int rows = table.findElements(By.xpath("tr")).size();
		for(int r=1;r<=rows;r++) {
//			read data from web table
			String country=table.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
			String population=table.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
			String world_percentage=table.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
			String date=table.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
			String source=table.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
//			System.out.println(country+population+world_percentage+date+source);
			
//			writing data in excel sheet
			util.setCellData("Population", r, 0, country);
			util.setCellData("Population", r, 1, population);
			util.setCellData("Population", r, 2, world_percentage);
			util.setCellData("Population", r, 3, date);
			util.setCellData("Population", r, 4, source);
		}
		System.out.println("Web Scrapping Done!!");
		driver.close();
	}

}
