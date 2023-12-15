package SampCo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createPatient {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opd.copious.care/doctor/homepage");
		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9665002440");
		driver.findElement(By.className("button ng-star-inserted")).click();
		//WebDriverWait wait= new WebDriverWait(driver,3); 
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("button ng-star-inserted")));
		//driver.findElement(By.className("button ng-star-inserted")).click();
		//boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		//if(invisible) {
			//WebElement SendOtpButton  = driver.findElement(By.className("button ng-star-inserted"));
			//SendOtpButton.click();
		//}
		//driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button")).click();
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button")).sendKeys("");

		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/mat-form-field[2]/div/div[1]/div/input")).sendKeys("9665002440");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");

	}

}
