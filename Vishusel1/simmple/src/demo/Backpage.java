package demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Backpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://istqb.in/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		WebElement foundation=driver.findElement(By.linkText("FOUNDATION"));
		
		Actions act =new Actions(driver);
		 
		act.moveToElement(foundation).perform();
		
      //Thread.sleep(5000);
		
		List<WebElement>options=driver.findElements(By.xpath("//*[@class = 'uk-nav uk-nav-navbar']"));
		
		for(WebElement w:options)
		{
			System.out.println(w.getText());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println(driver.getTitle());
		}
		

	}

}

