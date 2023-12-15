package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.findElement(By.linkText("Projects")).click();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='submit']"))).click();
		
		//driver.findElement(By.name("q")).sEendKeys("jobs in pune");
		
		//WebDriverWait wait= new WebDriverWait(driver,40);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))).click();
	  //.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[contains(@name,'source')]")));
		
	}

}
