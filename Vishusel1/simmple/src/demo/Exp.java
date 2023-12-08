package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");

		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions
		.visibilityOfElementLocated(By.linkText("Gmail"))).click(); 
		//(By.xpath("//b[contains(text(),'tools')]"))).click();
		
		
		
	}

}
