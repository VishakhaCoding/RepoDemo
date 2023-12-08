package demo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("vishakha");
		driver.findElement(By.name("proceed")).click();
		//driver.findElement(By.xpath("//input[@name='proceed'])")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		String Expected="Please enter your password";
		String Actual=alt.getText();
		if(Expected.equals(Actual))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		alt.accept();
		//driver.close();

	}

}
