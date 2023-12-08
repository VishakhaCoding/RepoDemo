package pivotalApplication;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PivotalChatAppointment {
	AppiumDriver driver;
	public Object MobileElement;
	public static String mobileNumber = "//*[@text='Cancel']";

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-20-june.apk");
		//dc.setCapability(MobileCapabilityType.APP, "D:\\pivoapp-prod-16-nov.apk");
		URL url = new URL("http://0.0.0.0:4723/");
		dc.setCapability("appPackage", "com.calculator_apps");
		dc.setCapability("appActivity", "com.calculator_apps.MainActivity");
		// AndroidDriver driver = new AndroidDriver(new
		// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
		driver = new AppiumDriver(url, dc);

		Thread.sleep(5000);

	}
	
	@Test(priority = 0)
	public void NumberField() throws MalformedURLException, InterruptedException {
		WebElement Number = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		Number.sendKeys("9665002440");
	}

	@Test(priority = 1)
	public void IAgree() throws MalformedURLException, InterruptedException {
		WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		Agree.click();
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void proceedButton() throws MalformedURLException, InterruptedException {
		WebElement proceed = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
		proceed.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void OTP() throws MalformedURLException, InterruptedException {
		WebElement otp = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
		otp.sendKeys("140520");

		Thread.sleep(10000);
	}

	@Test(priority = 4)
	public void submit() throws MalformedURLException, InterruptedException {
		WebElement submit = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));
		submit.click();
		Thread.sleep(5000);
		List<WebElement> WhatsNewClose = driver.findElements(By.className("android.widget.TextView"));
		WhatsNewClose.get(1).click();
		Thread.sleep(2000);

	}
	  @Test(priority=5) public void chatsclick() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				//working code for vdo call checkbox
				  
				 WebElement chatsclick =driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"chat_menu\"]"));
				 chatsclick.click();
		  
		 // WebElement Appointmentclick =driver.findElement(By.id("appointment_menu_id"));
		 // Appointmentclick.click();
		  
		  Thread.sleep(5000);
			
		  
		  }
	  @Test(priority=6) public void Patientclick() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				//working code for vdo call checkbox
				  
				 WebElement Patientclick =driver.findElement(By.xpath("//*[@text='GovVcc Test']"));
				 Patientclick.click();
		  
		 // WebElement Appointmentclick =driver.findElement(By.id("appointment_menu_id"));
		 // Appointmentclick.click();
		  
		  Thread.sleep(5000);
			
		  
		  }
	  @Test(priority=7) public void AppointmentClick() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				//working code for vdo call checkbox
				  
				 WebElement AppointmentClick =driver.findElement(By.xpath("//*[@text='']"));
				 AppointmentClick.click();
		  
		 // WebElement Appointmentclick =driver.findElement(By.id("appointment_menu_id"));
		 // Appointmentclick.click();
		  
		  Thread.sleep(5000);
		  
		  WebElement From =driver.findElement(By.xpath("//*[@text='From']"));
		  From.click();
		  Thread.sleep(5000);
		  
		  WebElement Evening =driver.findElement(By.xpath("//*[@text='Evening Session  49 /  54']"));
		  Evening.click();
			
  Thread.sleep(5000);
		  
		  WebElement Time =driver.findElement(By.xpath("//*[@text='04:00 pm']"));
		  Time.click();
		  }
		@Test(priority = 8)
		public void Book() throws InterruptedException {
			Thread.sleep(2000);

			 WebElement BookAP = driver.findElement(By.xpath("//*[@text='Book Appointment']"));
			 BookAP.click();
			Thread.sleep(5000);

		}

		@Test(priority = 9)
		public void AppointmentBookedPopup() throws InterruptedException {
			Thread.sleep(2000);

			

			List<WebElement> AppointmentBookedPopup = driver.findElements(By.className("android.widget.TextView"));
			AppointmentBookedPopup.get(2).click();

			Thread.sleep(5000);

		}
		@AfterMethod
		public void screenShot(ITestResult result) { // using ITestResult.FAILURE is equals to result.getStatus then it
			// enter into if condition
			if (ITestResult.FAILURE == result.getStatus()) {
				try { // To create reference of TakesScreenshot
					EventFiringWebDriver edriver = new EventFiringWebDriver(driver); // Call method to capture screenshot
					File src = edriver.getScreenshotAs(OutputType.FILE); // Copy files to specific location
					// result.getName() will return name of test case so that screenshot name will
					// be same as test case name
					FileUtils.copyFile(src, new File("C:\\ScreenShotFolder\\" + result.getName() + ".png"));
					System.out.println("Successfully captured a screenshot"); // driver.quit();
				} catch (Exception e) {
					System.out.println("Exception while taking screenshot " + e.getMessage());

					// driver.quit();
					// Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T"); }

				}
			}
		}

}
