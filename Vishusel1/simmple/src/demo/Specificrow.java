package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificrow {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src?=gain_lose");
		String companyName="Biocon";
		List<WebElement> col=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> col4=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		//System.out.println(" col="+col.size());
		
		  for(int i=0;i<col.size();i++)
		  {
			  if(col.get(i).getText().contains(companyName))
			  {
				  System.out.println(col.get(i).getText()+"   "+"...."+col4.get(i).getText());
				  break;
			  }
		  }
	}
}