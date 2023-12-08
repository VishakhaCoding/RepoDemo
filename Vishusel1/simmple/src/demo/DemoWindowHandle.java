package demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowHandle{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[1]/a")).click();
		String mainw=driver.getWindowHandle();
		Set<String> win=driver.getWindowHandles();
		System.out.println("total windows="+win.size());
		
		Iterator<String> itr= win.iterator();
		mainw=itr.next();
		String cwind=itr.next();
		
		driver.switchTo().window(cwind);
		System.out.println("title of the window"+driver.getTitle());
		
		Thread.sleep(5000);
		driver.switchTo().window(cwind).close();
		
		driver.switchTo().window(mainw);
		System.out.println("title of main window="+driver.getTitle());
		
		driver.quit();
		
		

	}

}
