package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https:learn.letskodeit.com/p/practice");
		WebElement btn1 =driver.findElement(By.id("bmwradio"));
		btn1.click();
		
		WebElement btn2 =driver.findElement(By.id("benzradio"));
		btn2.click();
		
		WebElement btn3 =driver.findElement(By.id("hondaradio"));
		btn3.click();
		System.out.println("bmw radio button is selected:"+btn1.isSelected());
		System.out.println("bmw radio button is enables:"+btn1.isEnabled());
		System.out.println("bmw radio button is displayed:"+btn1.isDisplayed());
		
		System.out.println("benz radio button is selected:"+btn2.isSelected());
		System.out.println("benz radio button is Enabled:"+btn2.isEnabled());
		System.out.println("benz radio button is  displayed:"+btn2.isDisplayed());
		
		System.out.println("honda radio button is selected:"+btn3.isSelected());
		System.out.println("honda radio button is Enabled:"+btn3.isEnabled());
		System.out.println("honda radio button is  displayed:"+btn3.isDisplayed());
		
		
		
		

	}

}
