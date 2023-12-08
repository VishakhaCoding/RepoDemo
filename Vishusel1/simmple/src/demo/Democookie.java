package demo;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Democookie {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Set<Cookie> allCookies=driver.manage().getCookies();
		System.out.println("total cookies="+allCookies.size());
		for(Cookie c:allCookies)
		{
			System.out.println("cookie name="+c.getName());
			System.out.println("cookie value="+c.getValue());
			System.out.println("cookie domain="+c.getDomain());
			System.out.println("cookie path="+c.getPath());
			System.out.println("cookie expiry="+c.getExpiry());
		}
		driver.manage().deleteAllCookies();
		allCookies=driver.manage().getCookies();
		System.out.println("no of cookies after deletion="+allCookies.size());
		
		Cookie cookie1=new Cookie("A1","11");
		Cookie cookie2=new Cookie("B1","21");
		Cookie cookie3=new Cookie("C1","31");
		
		driver.manage().addCookie(cookie1);
		driver.manage().addCookie(cookie2);
		driver.manage().addCookie(cookie3);
		
		allCookies=driver.manage().getCookies();
		System.out.println("total cookies after adding="+allCookies.size());
		for(Cookie c:allCookies)
		{
			System.out.println("cookie name="+c.getName());
			System.out.println("cookie value="+c.getValue());
		}
		
		

	}

}
