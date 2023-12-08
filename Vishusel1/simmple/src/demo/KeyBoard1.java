package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
        WebElement username=driver.findElement(By.id("login1"));
        
     	Actions act=new Actions(driver);
     	Action s=act.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username, "hello").keyUp(username, Keys.SHIFT).doubleClick(username).contextClick().build();
     	s.perform();

	}

}
