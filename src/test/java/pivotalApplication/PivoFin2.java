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

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PivoFin2 {
	AppiumDriver driver;
	public Object MobileElement;

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-20-june.apk");
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
	WebElement Number =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	Number.sendKeys("9665002440");
}

@Test(priority = 1)
public void IAgree() throws MalformedURLException, InterruptedException {
	WebElement Agree =  driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
	Agree.click();
	Thread.sleep(1000);
}

@Test(priority = 2)
public void proceedButton() throws MalformedURLException, InterruptedException {
	WebElement proceed =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
	proceed.click();
	Thread.sleep(5000);
}

@Test(priority = 3)
public void OTP() throws MalformedURLException, InterruptedException {
	WebElement otp =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
	otp.sendKeys("140520");

	Thread.sleep(10000);
}

@Test(priority = 4)
public void submit() throws MalformedURLException, InterruptedException {
	WebElement submit =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));
	submit.click();

	//Thread.sleep(2000);
	  Thread.sleep(2000);
	  List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
	  WhatsNewClose.get(1).click();

}

@Test(priority = 5)
public void Search() throws InterruptedException {
	Thread.sleep(2000);
	WebElement SearchIcon =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon.click();

	Thread.sleep(2000);

	WebElement SearchBar =  driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
	SearchBar.sendKeys("PivoTotal40Automation");

	Thread.sleep(2000);
	WebElement SearchIcon1 =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon1.click();
	Thread.sleep(2000);

}

@Test(priority = 6)
public void close() throws InterruptedException {
	Thread.sleep(2000);
	WebElement close =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_close\"]"));
	close.click();

	Thread.sleep(2000);

}

@Test(priority = 7)
public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Clickpatient = driver
			.findElements(By.className("android.widget.TextView"));
	Clickpatient.get(5).click();

	

}
@Test(priority = 8)
public void InvestigationClick() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement InvestigationClick
	  =  driver.findElement(By.xpath("//*[@text='Investigations']"));
	  InvestigationClick.click();

	

}
@Test(priority = 9)
public void NewRequisition() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement NewRequisition
	  =  driver.findElement(By.xpath("//*[@text='New Requisition']"));
	NewRequisition.click();

	

}
@Test(priority = 10)
public void Covid19() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Covid19
	  = driver.findElement(By.xpath("//*[@text='HRCT']"));
	Covid19.click();

	

}
@Test(priority = 11)
public void packages() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement packages
	  = driver.findElement(By.xpath("//*[@text='Packages']"));
	packages.click();

	

}
@Test(priority = 12)
public void Feverpanel() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Feverpanel = driver
			.findElements(By.className("android.widget.TextView"));
	Feverpanel.get(11).click();

	

}
@Test(priority = 13)
public void SelectTests() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement SelectTests
	  =  driver.findElement(By.xpath("//*[@text='Select Tests']"));
	SelectTests.click();

	

}
@Test(priority = 14)
public void CreateRquisition() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> CreateRquisition = driver
			.findElements(By.xpath("//*[@text='Create Requisition']"));
	CreateRquisition.get(1).click();

	

}
@Test(priority = 15)
public void RquisitionDownloadclose() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> RquisitionDownloadclose
	  =  driver.findElements(By.className("android.widget.TextView"));
	RquisitionDownloadclose.get(0).click();

	

}
@Test(priority = 16)
public void ReportClick() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement ReportClick
	  =  driver.findElement(By.xpath("//*[@text='Report']"));
	ReportClick.click();

	

}
@Test(priority = 17)
public void UploadReport() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadReport
	  =  driver.findElement(By.xpath("//*[@text='Upload Report']"));
	UploadReport.click();

	

}
@Test(priority = 18)
public void CreatedBy2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	  CreatedBy.sendKeys("Investigation");

	

}
@Test(priority = 19)
public void DocumentOn2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn.get(5).click();

	

}
@Test(priority = 20)
public void popUpOk2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk
	  = driver.findElement(By.xpath("//*[@text='Ok']"));
	  popUpOk.click();

	

}
@Test(priority = 21)
public void Camera2() throws InterruptedException, IndexOutOfBoundsException {
	
	Thread.sleep(5000);
	WebElement Camera
	
	  = driver.findElement(By.xpath("//*[@text='Camera']"));
	Camera.click();
	Thread.sleep(2000);
	WebElement allow
	
	  = driver.findElement(By.xpath("//*[@text='Allow']"));
	allow.click();
	
	WebElement allow1
	
	  = driver.findElement(By.xpath("//*[@text='Allow']"));
	allow1.click();
	Thread.sleep(2000);
	;
	
	Thread.sleep(2000);
	WebElement CameraClick
	  = driver.findElement(By.xpath("//CenterButtonGroup[@content-desc=\"NONE\"]"));
	CameraClick.click();

	Thread.sleep(5000);
	
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();
	
	
	
	

	

}
@Test(priority = 22)
public void UploadCam2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadCam2
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	UploadCam2.click();}

@Test(priority = 23)
public void UploadCamOk2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadCamOk2
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	UploadCamOk2.click();

	

}
@Test(priority = 24)
public void Transscript1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement Transscript1 = driver.findElement(By.xpath("//*[@text='Upload Report']"));
	Transscript1.click();

}

/*
 * @Test(priority = 25) public void DocumentsDropDown2() throws
 * InterruptedException, IndexOutOfBoundsException { Thread.sleep(5000);
 * List<WebElement> DocumentsDropDown2 =
 * driver.findElements(By.className("android.widget.TextView"));
 * DocumentsDropDown2.get(2).click();
 * 
 * 
 * 
 * }
 * 
 * @Test(priority = 26) public void LabReport() throws InterruptedException,
 * IndexOutOfBoundsException { Thread.sleep(2000); WebElement LabReport =
 * driver.findElement(By.xpath("//*[@text='Lab Report']")); LabReport.click();
 * 
 * 
 * 
 * }
 */
@Test(priority = 27)
public void CreatedBy3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy3
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	CreatedBy3.sendKeys("Investigation");

	

}
@Test(priority = 28)
public void DocumentOn3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn3 =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn3.get(5).click();

	

}
@Test(priority = 29)
public void popUpOk3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk3
	  = driver.findElement(By.xpath("//*[@text='Ok']"));
	popUpOk3.click();

	

}
@Test(priority = 30)
public void Gallery3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Gallery3
	  = driver.findElement(By.xpath("//*[@text='Gallery']"));
	Gallery3.click();

}

/*
 * @Test(priority = 24) public void CameraAllow() throws InterruptedException,
 * IndexOutOfBoundsException { Thread.sleep(2000); WebElement CameraAllow =
 * driver.findElement(By.xpath("//*[@text='Allow']")); CameraAllow.click();
 * 
 * 
 * 
 * }
 */
@Test(priority = 31)
public void photo3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(10000);
 driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20230807-103653_Gallery.jpg, 680 kB, 7 Aug\"]")).click();

	

}
@Test(priority = 32)
public void Upload3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();

	

}
@Test(priority = 33)
public void UploadOk3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();

	 List<WebElement> Backward1 =
			 driver.findElements(By.className("android.widget.TextView"));
			 Backward1.get(0).click();
			 Thread.sleep(5000);
}
@Test(priority = 34)
public void RffralCreation() throws InterruptedException, IndexOutOfBoundsException {
	
	Thread.sleep(2000);
	WebElement RffralCreation
	  = driver.findElement(By.xpath("//*[@text='Referral']"));
	  RffralCreation.click();

	

}
@Test(priority = 35)
public void DrName() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DrName = driver
			.findElements(By.className("android.widget.EditText"));
	DrName.get(0).sendKeys("Refer");
}
	


@Test(priority = 36)
public void DrEmail() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DrEmail = driver
			.findElements(By.className("android.widget.EditText"));
	DrEmail.get(1).sendKeys("abc@gmail.com");}

@Test(priority = 37)
public void DrMobNumber() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DrMobNumber = driver
			.findElements(By.className("android.widget.EditText"));
	DrMobNumber.get(2).sendKeys("1234567891");
}
@Test(priority = 38)
public void HealthCondition() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> HealthCondition = driver
			.findElements(By.className("android.widget.EditText"));
	HealthCondition.get(3).sendKeys("Critical");

}
@Test(priority = 39)
public void Duration() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Duration = driver
			.findElements(By.className("android.widget.EditText"));
	Duration.get(4).sendKeys("2");

}
@Test(priority = 40)
public void Speciality() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	
	WebElement Speciality11
	  = driver.findElement(By.xpath("//*[@text='Speciality']"));
	 Speciality11.click();
	 Thread.sleep(5000);
	 WebElement Speciality12
	  =driver.findElement(By.xpath("//*[@text='default.v3']"));
	 Speciality12.click();
		/*
		 * List<io.appium.java_client.MobileElement> Speciality = driver
		 * .findElements(By.className("android.view.ViewGroup"));
		 * Speciality.get(4).click();
		 */
	
		/*
		 * Thread.sleep(2000); List<io.appium.java_client.MobileElement> speciality1 =
		 * driver .findElements(By.className("android.view.ViewGroup"));
		 * speciality1.get(0).click();
		 */

}
@Test(priority = 41)
public void preview() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	
	WebElement preview
	  = driver.findElement(By.xpath("//*[@text='Preview']"));
	  preview.click();


}


  @Test(priority = 42) public void Save() throws InterruptedException,
  IndexOutOfBoundsException { Thread.sleep(5000);
	WebElement Save
	  = driver.findElement(By.xpath("//*[@text='Save']"));
	 Save.click();
  
  }
 
	/*
	 * @Test(priority = 43) public void RefDownloadSave() throws
	 * InterruptedException, IndexOutOfBoundsException { Thread.sleep(10000);
	 * List<WebElement> RefDownloadSave =
	 * driver.findElements(By.className("android.view.ViewGroup"));
	 * RefDownloadSave.get(3).click(); Thread.sleep(5000); List<WebElement>
	 * Backward1 = driver.findElements(By.className("android.widget.TextView"));
	 * Backward1.get(0).click(); Thread.sleep(5000);}
	 */
@Test(priority = 44)
public void UploadDocuments() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(40000);
	WebElement UploadDocuments
	  =driver.findElement(By.xpath("//*[@text='Upload Documents']"));
	  UploadDocuments.click();

	

}
@Test(priority = 45)
public void DocumentsDropDown() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> DocumentsDropDown = driver.findElements(By.className("android.widget.TextView"));
	DocumentsDropDown.get(2).click();

	

}
@Test(priority = 46)
public void DischargeSummary() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement DischargeSummary
	  = driver.findElement(By.xpath("//*[@text='Discharge Summary']"));
	  DischargeSummary.click();

	

}
@Test(priority = 47)
public void CreatedBy() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	  CreatedBy.sendKeys("DisSum");

	

}
@Test(priority = 48)
public void DocumentOn() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn.get(5).click();

	

}
@Test(priority = 49)
public void popUpOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk
	  = driver.findElement(By.xpath("//*[@text='Ok']"));
	  popUpOk.click();

	

}
@Test(priority = 50)
public void Camera() throws InterruptedException, IndexOutOfBoundsException {
	
	Thread.sleep(5000);
	WebElement Camera
	
	  = driver.findElement(By.xpath("//*[@text='Camera']"));
	Camera.click();
	Thread.sleep(2000);
	/*
	 * WebElement allow
	 * 
	 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow.click();
	 * 
	 * WebElement allow1
	 * 
	 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
	 * Thread.sleep(2000); ;
	 */
	
	//Thread.sleep(2000);
	WebElement CameraClick1
	  = driver.findElement(By.xpath("//CenterButtonGroup[@content-desc=\"NONE\"]"));
	CameraClick1.click();

	Thread.sleep(5000);
	
	WebElement UploadOk1
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	UploadOk1.click();
	
	
	
	

	

}
@Test(priority = 51)
public void UploadCam() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();}

@Test(priority = 52)
public void UploadCamOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();

	

}
@Test(priority = 53)
public void UploadDocuments1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadDocuments1
	  =driver.findElement(By.xpath("//*[@text='Upload Documents']"));
	UploadDocuments1.click();

	

}
@Test(priority = 54)
public void DocumentsDropDown1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> DocumentsDropDown1 = driver.findElements(By.className("android.widget.TextView"));
	DocumentsDropDown1.get(2).click();

	

}
@Test(priority = 55)
public void DischargeSummary1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement DischargeSummary1
	  = driver.findElement(By.xpath("//*[@text='Discharge Summary']"));
	DischargeSummary1.click();

	

}
@Test(priority = 56)
public void CreatedBy1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy1
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	CreatedBy1.sendKeys("DisSum");

	

}
@Test(priority = 57)
public void DocumentOn1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn1 =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn1.get(5).click();

	

}
@Test(priority = 58)
public void popUpOk1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk1
	  = driver.findElement(By.xpath("//*[@text='Ok']"));
	popUpOk1.click();

	

}
@Test(priority = 59)
public void Gallery() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Gallary
	  = driver.findElement(By.xpath("//*[@text='Gallery']"));
	  Gallary.click();

}

/*
 * @Test(priority = 24) public void CameraAllow() throws InterruptedException,
 * IndexOutOfBoundsException { Thread.sleep(2000); WebElement CameraAllow =
 * driver.findElement(By.xpath("//*[@text='Allow']")); CameraAllow.click();
 * 
 * 
 * 
 * }
 */
@Test(priority = 60)
public void photo() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(10000);
 driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20230807-103653_Gallery.jpg, 680 kB, 7 Aug\"]")).click();

	

}
@Test(priority = 61)
public void Upload() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();

	

}
@Test(priority = 62)
public void UploadOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();

	
}
@Test(priority = 63)
public void SpecialVaccine() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Link Patient to Doctor\").instance(0))"));
	Thread.sleep(10000);
	WebElement SpecialVaccine
	  =driver.findElement(By.xpath("//*[@text='Special Situation Vaccine']"));
	  SpecialVaccine.click();

	  Thread.sleep(2000);

}
@Test(priority = 64)
public void AdministeredDate() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	
	 List<WebElement> AdministeredDate = driver.findElements(By.className("android.widget.TextView"));
	 AdministeredDate.get(2).click();

}
@Test(priority = 65)
public void PopUpOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement PopUpOk
	  =driver.findElement(By.xpath("//*[@text='Ok']"));
	 PopUpOk.click();

	

}
@Test(priority = 66)
public void VaccineDropdown() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	//List<WebElement> VaccineDropdown = (List<WebElement>)driver.findElement(By.xpath("android.widget.TextView"));
	//VaccineDropdown.get(4).click();

	List<WebElement> VaccineDropdown = driver.findElements(By.className("android.widget.TextView"));
	VaccineDropdown.get(4).click();

}

@Test(priority = 67)
public void CholeraVaccine() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CholeraVaccine
	  =driver.findElement(By.xpath("//*[@text='Cholera Vaccine']"));
	 CholeraVaccine.click();

	

}
@Test(priority = 68)
public void Submit() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Submit
	  =driver.findElement(By.xpath("//*[@text='Submit']"));
	 Submit.click();

	

}
@Test(priority = 69)
public void VaccinationOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement VaccinationOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 VaccinationOk.click();

	

}
@Test(priority = 70)
public void LinkPatient() throws InterruptedException, IndexOutOfBoundsException {
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Link Patient to Doctor\").instance(0))"));
	Thread.sleep(10000);
	Thread.sleep(2000);
	List<WebElement> LinkPatient =  driver.findElements(By.xpath("//*[@text='Link Patient to Doctor']"));
	
	LinkPatient.get(1).click();
	
	Thread.sleep(5000);
}
@Test(priority = 71)
public void DrMobileNumber() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(10000);
	List<WebElement> DrMobileNumber = driver
			.findElements(By.className("android.widget.EditText"));
	DrMobileNumber.get(0).sendKeys("9665002440");
}
@Test(priority = 72)
public void SearchDr() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> SearchDr = driver
			.findElements(By.className("android.widget.TextView"));
	SearchDr.get(1).click();
	Thread.sleep(15000);
}
@Test(priority = 73)
public void Link() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> Link = driver
			.findElements(By.className("android.widget.TextView"));
	Link.get(5).click();
	Thread.sleep(10000);

}
@Test(priority = 74)
public void Reciept() throws InterruptedException, IndexOutOfBoundsException {
	
	Thread.sleep(2000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Link Patient to Doctor\").instance(0))"));
	Thread.sleep(10000);
	List<WebElement> Reciept =  driver.findElements(By.xpath("//*[@text='Receipt']"));
	
	Reciept.get(1).click();
	
	Thread.sleep(5000);
}
@Test(priority = 75)
public void AddNewReceipt() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement AddNewReceipt =  driver.findElement(By.xpath("//*[@text='Add New Receipt']"));
	
	AddNewReceipt.click();
	
	Thread.sleep(5000);
}
@Test(priority = 76)
public void ReceiptNo() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> ReceiptNo =  driver.findElements(By.xpath("//*[@text='Enter receipt no. ']"));
	
	ReceiptNo.get(0).sendKeys("123456");
	
	Thread.sleep(2000);
}
@Test(priority = 77)
public void Consultation() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Consultation =  driver.findElements(By.className("android.widget.EditText"));
	
	Consultation.get(1).sendKeys("123.5");
	
	Thread.sleep(2000);
}


  @Test(priority = 78) public void Vaccination() throws InterruptedException,
  IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> Vaccination
  = driver.findElements(By.className("android.widget.EditText"));
  
  Vaccination.get(3).sendKeys("100.5");
  
  Thread.sleep(2000); }
  
  @Test(priority = 79) public void OtherReasons() throws InterruptedException,
  IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> OtherReasons
  = driver.findElements(By.className("android.widget.EditText"));
  
  OtherReasons.get(8).sendKeys("100.5");
  
  Thread.sleep(2000); }
  
  @Test(priority = 80) public void Addmore() throws InterruptedException,
  IndexOutOfBoundsException { Thread.sleep(2000); WebElement Addmore =
  driver.findElement(By.xpath("//*[@text='Add More']"));
  
  Addmore.click();
  
  Thread.sleep(2000); }
  
/*
 * @Test(priority = 14) public void OtherReasons1() throws InterruptedException,
 * IndexOutOfBoundsException { Thread.sleep(5000); List<WebElement>
 * OtherReasons1 = driver.findElements(By.className("android.widget.EditText"));
 * 
 * OtherReasons1.get(10).sendKeys("100.5");
 * 
 * Thread.sleep(2000); }
 */
 
	@Test(priority = 81)
	public void Preview() throws InterruptedException, IndexOutOfBoundsException {
		//Thread.sleep(5000);
		WebElement Preview =  driver.findElement(By.xpath("//*[@text='Preview']"));
		
		Preview.click();
		
		Thread.sleep(35000);
	}
	
	  @Test(priority = 82) public void PayerName() throws InterruptedException,
	  IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> PayerName =
	  driver.findElements(By.className("android.widget.EditText"));
	  
	  PayerName.get(0).sendKeys("abc");
	  
	  }
	  @Test(priority = 83)
		public void CreateReceipt() throws InterruptedException, IndexOutOfBoundsException {
			Thread.sleep(1000);
			List<WebElement> CreateReceipt =  driver.findElements(By.xpath("//*[@text='Create Receipt']"));
			
			CreateReceipt.get(1).click();
			
			Thread.sleep(10000);
			/*
			 * List<WebElement>
			 * Download=driver.findElements(By.className("android.widget.TextView"));
			 * 
			 * Download.get(1).click();
			 */
			
			
			//WebElement Download =  driver.findElement(By.xpath("//*[@text='Download']"));
			//Download.click();
			List<WebElement> ReceiptDownloadclose
			  =  driver.findElements(By.className("android.widget.TextView"));
			ReceiptDownloadclose.get(0).click();
			 Thread.sleep(5000);
			 List<WebElement> Backward1 =
					 driver.findElements(By.className("android.widget.TextView"));
					 Backward1.get(0).click();
					 Thread.sleep(5000);
					 
					 List<WebElement> Backward2 =
							 driver.findElements(By.className("android.widget.TextView"));
							 Backward2.get(0).click();
							 Thread.sleep(5000);
		}
	  @Test(priority = 84)
			public void Certificate() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Certificates\").instance(0))"));
				Thread.sleep(10000);
				List<WebElement> Certificate =  driver.findElements(By.xpath("//*[@text='Certificates']"));
				
				Certificate.get(0).click();
				
				Thread.sleep(25000);
			}
			@Test(priority = 85)
			public void CertificateDropdown() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				List<WebElement> CertificateDropdown =  driver.findElements(By.className("android.widget.EditText"));
				CertificateDropdown.get(0).click();
			//WebElement CertificateDropdown =  driver.findElement(By.xpath("//*[@text='Certification Type']"));
				
				//CertificateDropdown.click();
				
				Thread.sleep(20000);
			}
			@Test(priority = 86)
			public void CertificateType() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				WebElement CertificateType =  driver.findElement(By.xpath("//*[@text='Fitness Certificate']"));
				
				CertificateType.click();
				
				Thread.sleep(20000);
			}
			@Test(priority = 87)
			public void Speciality1() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				List<WebElement> Speciality1 =  driver.findElements(By.xpath("//*[@text='Speciality']"));
				
				Speciality1.get(0).click();
				
				Thread.sleep(30000);
			}
			@Test(priority = 88)
			public void SpecialitySelect() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				List<WebElement> SpecialitySelect =  driver.findElements(By.xpath("//*[@text='default.v3']"));
				
				SpecialitySelect.get(0).click();
				
				Thread.sleep(35000);
			}
			@Test(priority = 89)
			public void Preview1() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				List<WebElement> Preview1 =  driver.findElements(By.xpath("//*[@text='Preview']"));
				
				Preview1.get(0).click();
				
				Thread.sleep(10000);
			}
			@Test(priority = 90)
			public void Printclose() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				/*
				 * List<WebElement> Print = driver.findElements(By.xpath("//*[@text='Print']"));
				 * 
				 * Print.get(0).click();
				 */
				List<WebElement> CertificateDownloadclose
				  =  driver.findElements(By.className("android.widget.TextView"));
				CertificateDownloadclose.get(0).click();
				 Thread.sleep(5000);
				 List<WebElement> Backward1 =
						 driver.findElements(By.className("android.widget.TextView"));
						 Backward1.get(0).click();
						 Thread.sleep(5000);
				Thread.sleep(5000);
			}
			@Test(priority = 91)
			public void ClickHistory() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				List<WebElement> ClickHistory = driver
						.findElements(By.className("android.widget.TextView"));
				//ClickHistory.get(9).click();
				Thread.sleep(2000);
				ClickHistory.get(10).click();
				//ClickHistory.get(11).click();
				Thread.sleep(2000);
				//ClickHistory.get(12).click();
			}
			@Test(priority = 92)
			public void ViewDocument() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				WebElement ViewReferal = driver
						.findElement(By.xpath("//*[@text='View Document']"));
				ViewReferal.click();}
			
			@Test(priority = 93)
			public void close1() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(10000);
				List<WebElement> close1 = driver
						.findElements(By.className("android.widget.TextView"));
				close1.get(2).click();
			}
			@Test(priority = 94)
			public void ViewReceipts() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(2000);
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"View Receipt\").instance(0))"));
				Thread.sleep(10000);
				WebElement ViewReceipts = driver
						.findElement(By.xpath("//*[@text='View Receipt']"));
				ViewReceipts.click();}
			@Test(priority = 95)
			public void close2() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(10000);
				List<WebElement> close2 = driver
						.findElements(By.className("android.widget.TextView"));
				close2.get(2).click();
				Thread.sleep(2000);
			}
			@Test(priority = 96)
			public void ViewReferal() throws InterruptedException, IndexOutOfBoundsException {
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"View Referal Note\").instance(0))"));
				Thread.sleep(10000);
				//Thread.sleep(2000);
				WebElement ViewReferal = driver
						.findElement(By.xpath("//*[@text='View Referal Note']"));
				ViewReferal.click();}
			@Test(priority = 97)
			public void close4() throws InterruptedException, IndexOutOfBoundsException {
				Thread.sleep(10000);
				List<WebElement> close4 = driver
						.findElements(By.className("android.widget.TextView"));
				close4.get(2).click();
				Thread.sleep(2000);
			}
			/*
			 * @Test(priority = 98) public void ViewPrescription() throws
			 * InterruptedException, IndexOutOfBoundsException { Thread.sleep(2000);
			 * 
			 * //driver.findElement(AppiumBy.
			 * androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"View Precription\").instance(0))"
			 * )); //Thread.sleep(10000); WebElement ViewPrescription = driver
			 * .findElement(By.xpath("//*[@text='View Precription']"));//element doesnt
			 * found in DOM ViewPrescription.click(); }
			 * 
			 * @Test(priority = 99) public void close5() throws InterruptedException,
			 * IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> close5 =
			 * driver .findElements(By.className("android.widget.TextView"));
			 * close5.get(2).click(); }
			 */
			//@AfterClass public void close() throws IOException {
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
