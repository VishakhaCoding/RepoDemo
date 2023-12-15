package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		FluentWait<WebDriver> fw=new FluentWait<WebDriver>(driver);
		fw.withTimeout(40,TimeUnit.SECONDS)
		.pollingEvery(1,TimeUnit.NANOSECONDS)
		.ignoring(NoSuchElementException.class)
		.until(ExpectedConditions
		.visibilityOfElementLocated (By.xpath("//b[contains(text(),' interview questions')]"))).click();


	}

}

