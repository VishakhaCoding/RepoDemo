package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nawalevishakha91@gmail.com");
		//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234567");
		//driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();


	}

}

