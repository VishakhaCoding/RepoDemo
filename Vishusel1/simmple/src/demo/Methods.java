package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String curl=driver.getTitle();
		System.out.println(curl);
		String psource=driver.getPageSource();
		System.out.println(psource);
		driver.close();

	}

}
