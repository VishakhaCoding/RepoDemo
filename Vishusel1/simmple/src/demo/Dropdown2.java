package demo;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?formName=user_details");
		WebElement country=driver.findElement(By.id("country"));
		Select country1= new Select(country);
		List<WebElement>countries=country1.getOptions();
		System.out.println("No. of countries are:"+countries.size());
		country1.selectByVisibleText("India");
		System.out.println("selected country:"+country1.getFirstSelectedOption().getText());
		
		/*WebElement country=driver.findElement(By.id("country"));
		Select country1= new Select(country);
		List<WebElement>countries=country1.getOptions(); 
		System.out.println("No. of countries are:"+countries.size());
		*/
		WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
		Select city1=new Select(city);
		city1.selectByValue("Pune");
		System.out.println("selected city:"+city1.getFirstSelectedOption().getText());
		
		List<WebElement> cities=city1.getOptions();
		System.out.println("Total cities are"+cities.size());
		//driver.close();
		
		
		
	
		
		

	}

}

