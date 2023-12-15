package SampCo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class dmLaunchC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://stage.copious.care:4200/");
		//doctor login
		WebElement textbox = driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button"));
		textbox.sendKeys(Keys.ENTER);
		
		//number field
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input")).sendKeys("9665002440");
		
		//send otp
		WebElement textbox2 =driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button"));
		textbox2.sendKeys(Keys.ENTER);

Thread.sleep(30000);


		//verify

		WebElement textbox3 =driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button"));
		textbox3.sendKeys(Keys.ENTER);
		
		Thread.sleep(20000);
		WebElement textbox4 =driver.findElement(By.id("createPatient"));
		textbox4.sendKeys(Keys.ENTER);
		
		/*
		 * //search bar driver.findElement(By.xpath(
		 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input"
		 * )).sendKeys("pinky");
		 * 
		 * //search button WebElement textbox4 =driver.findElement(By.xpath(
		 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button"
		 * )); textbox4.sendKeys(Keys.ENTER);
		 * 
		 * Thread.sleep(10000); WebElement textbox5
		 * =driver.findElement(By.xpath("//ul/a[1]/li/a/div/div[2]/figure/img[1]"));
		 * textbox5.click(); //textbox5.sendKeys(Keys.ENTER);
		 */	}
	

}
