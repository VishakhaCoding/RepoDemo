package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src?=gain_lose");
		List<WebElement> allcoldata=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		List<WebElement> allrows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("all rows="+allrows.size());
		System.out.println("all data="+allcoldata.size());
		  for(int i=0;i<allrows.size();i++)
		  {
			  System.out.println(allrows.get(i).getText()+"   ");
		  }


	}

}
