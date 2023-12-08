package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableCheckB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		WebElement mrad =driver.findElement(By.id("gender-male"));
		mrad.click();
		
		WebElement frad =driver.findElement(By.id("gender-female"));
		frad.click();
		
			String genSele="Female";
			if(genSele.equals("Male"))
			{
				mrad.click();
				System.out.println("selected is"+genSele);
			}
			else if(genSele.equals("Female"))
			{
				frad.click();
				System.out.println("selected is"+genSele);
			}
			//Thread.sleep(3000);
			//driver.quit();
			
		

	}

}
