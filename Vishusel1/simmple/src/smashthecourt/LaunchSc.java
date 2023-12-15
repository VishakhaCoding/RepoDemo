package smashthecourt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wdriver.findElement(By.xpebdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://smashthecourt.tejasnavale.com/");
		Thread.sleep(3000);
		//ath("////*[@id=\"navbar\"]/ul/li[5]/a/span"));
		//driver.findElement(By.xpath("//*[@id=navbar]/ul/li[5]/ul/li[1]/a")).click();
		driver.findElement(By.className("btn-get-started animate__animated animate__fadeInUp")).click();
		//driver.findElement(By.xpath("//input{@id='email']")).sendKeys("vishakha91@gmail.com");
		//driver.findElement(By.id("password")).sendKeys(args);
		//driver.findElement(By.className("btn text-white btn-block btn-primary")).click();
		//driver.close();

	}

}
