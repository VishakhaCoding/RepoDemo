package SampCo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class logCopious {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opd.copious.care/");
		//driver.findElement(By.className("btn-primary opd-secondary-btn btn-md btn-login")).click();
		//driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button")).click();
		//driver.findElement(By.className("form-control newInputBox ng-pristine ng-valid ng-touched")).sendKeys("Vishakha");
		//driver.findElement(By.className("form-control animateInput ng-pristine ng-valid ng-touched")).sendKeys("9665002440");
		//driver.findElement(By.xpath("//*[@ class='btn-primary opd-secondary-btn btn-md btn-login']")).click();
		//driver.findElement(By.xpath("//input[@class='form-control newInputBox ng-pristine ng-valid ng-touched']")).sendKeys("Vishakha");
		//driver.findElement(By.xpath("//*[@ class='opd-primary-btn btn-md w125 login-btn upprcase newBtnStyle']"));
		driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/section/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("Vishakha");
		driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/section/div[2]/div[1]/div/div[1]/div[1]/div[2]/input")).sendKeys("9665002440");
		driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/section/div[2]/div[1]/div/div[1]/div[2]/div[1]/input")).sendKeys("xyz");
		driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/section/div[2]/div[1]/div/div[1]/div[2]/div[2]/input")).sendKeys("123");
		//driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/div/div/section/div[2]/div[1]/div/div[1]/button")).click();
		//driver.findElement(By.xpath("//input[@class='opd-primary-btn btn-md w125 login-btn upprcase newBtnStyle']")).click();
		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9665002440");
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button")).sendKeys("");



	}

}
