package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableRediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		//List<WebElement> rb=driver.findElements(By.("//*[@id=\"gender-male\"]"));
		List<WebElement> rb=driver.findElements(By.name("Gender"));
		int i=1;
		for(WebElement w:rb)
		{
			//if(w.isEnabled())
			{
				System.out.println("Status of radio button:"+i+":"+w.getAttribute("value"));
				w.click();
				System.out.println("Status of radio button:"+i+":"+w.getAttribute("value"));
			}
		}

	}

}
