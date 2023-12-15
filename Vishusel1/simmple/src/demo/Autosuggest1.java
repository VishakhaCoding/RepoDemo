package demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Computer");
		List<WebElement> Autos =driver.findElements(By.xpath("//*[contains(text(),'Computer')]"));
		System.out.println("total suggestions="+Autos.size());
		for(int i=0; i<Autos.size();i++)
		{
			System.out.println(Autos.get(i).getText());
		}
		driver.quit();

	}

}