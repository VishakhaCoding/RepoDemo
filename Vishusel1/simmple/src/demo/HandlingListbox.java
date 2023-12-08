package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejas\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:/WebdriverRavina/MultiSelect.html");
		WebElement cars=driver.findElement(By.name("cars"));
		Select cars1=new Select(cars);
		if(cars1.isMultiple())
		{
			cars1.selectByIndex(0);
			cars1.selectByIndex(1);
			cars1.selectByIndex(2);
			cars1.selectByIndex(3);
		}
		List<WebElement>SelCars=cars1.getAllSelectedOptions();
		for(WebElement w:SelCars)
			System.out.println(w.getText());
		Thread.sleep(5000);
		
	
		

	}

}
