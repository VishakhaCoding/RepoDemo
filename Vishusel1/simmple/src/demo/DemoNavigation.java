package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Computers")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.google.com/");
		driver.navigate().refresh();
		driver.close();

	}

}