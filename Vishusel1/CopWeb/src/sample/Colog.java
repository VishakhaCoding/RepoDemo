package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://opd.copious.care/");
				//driver.findElement(By.className("btn-primary opd-secondary-btn btn-md btn-login")).click();
				//driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button")).click();
				driver.findElement(By.className("form-control newInputBox ng-pristine ng-valid ng-touched")).sendKeys("Vishakha");
				driver.findElement(By.className("form-control animateInput ng-pristine ng-valid ng-touched")).sendKeys("9665002440");
				

				
				
				


	}

}
