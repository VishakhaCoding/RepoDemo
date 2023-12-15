package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.className("gb_e")).click();
		//driver.findElement(By.name("q")).sendKeys("testing");
		//driver.findElement(By.id("gb_70")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Ima")).click();
		

	}

}
