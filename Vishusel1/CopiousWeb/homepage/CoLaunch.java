package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opd.copious.care/");

	}

}
