package pivotalApplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOExceptionWithCause;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.netty.channel.unix.Socket;

public class AppiumServerStart {
	 AppiumDriver driver;
	
	

	
private static AppiumDriverLocalService Server;
@BeforeSuite()
public void BfSuite()
{
	Server= getAppiumServiceDefault();
	Server.start();
	//Server.clearOutPutStreams(); //clear the server logs
	System.out.println("Appium Server started");
}

  @org.testng.annotations.AfterSuite() public void AfterSuite() {
  
  Server.stop();
  System.out.println("Appium Server stopped");
  
  
  
  }
 
public boolean CheckAppiumServerIsRunning(int port) throws IOException
{
	boolean isAppiumRunning= false;
	Socket socket;
	try {
		socket= new Socket(port);
		socket.close();}
	catch(IOExceptionWithCause e)
	{
		System.out.println("1");
		isAppiumRunning= true;
		
	}finally {
		socket=null;
	}
	
	return isAppiumRunning;
}

public AppiumDriverLocalService getAppiumServiceDefault() {
	return AppiumDriverLocalService.buildDefaultService();
}


/*
 * @Test()
 * 
 * @BeforeClass public void setup() throws MalformedURLException,
 * InterruptedException {
 * 
 * DesiredCapabilities dc = new DesiredCapabilities();
 * dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
 * dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 * dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
 * dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
 * dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-20-june.apk");
 * //dc.setCapability(MobileCapabilityType.APP, "D:\\pivoapp-prod-16-nov.apk");
 * URL url = new URL("http://0.0.0.0:4723/"); dc.setCapability("appPackage",
 * "com.calculator_apps"); dc.setCapability("appActivity",
 * "com.calculator_apps.MainActivity"); // AndroidDriver driver = new
 * AndroidDriver(new // URL("http://127.0.0.1:4723/wd/hub"), dc); //Create
 * driver object driver = new AppiumDriver(url, dc);
 * 
 * Thread.sleep(5000);
 * 
 * }
 */
 
 

}
