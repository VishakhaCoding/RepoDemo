package webAuto;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateRequisitions {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]"; 
	   public static String InvestigationClick="//*[text()='Investigations']";
	   public static String RequisitionClick="//*[text()='Requisitions']";
	   public static String NewRequisition="//*[text()='New Requisition']";
	   public static String SelectTest ="//*[text()='RT-PCR']";
	   public static String SelectPackageOption="//*[text()='Packages']";
	   public static String SelectPackage="/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/form/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div[1]/mat-checkbox/label/span[1]";
	   public static String RequisitionSaveAndShare="//*[text()='Save & Preview']";
	   public static String ShareRequisition ="//*[text()='Share Requisition']";
	   public static String CancelOption="//*[text()='Cancel']";
	   public static String RequisitionSharedMsge="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
	   
	   public static void waitForVisibilityOf(By by) {
			try {

				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				// JavascriptExecutor jse = (JavascriptExecutor)driver;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void clickUsingJavaScript(By by) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(by));
		}

		public static void highlightElement(By by) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid black;');",
					driver.findElement(by));
		}

		@BeforeClass
		public void setUp() {

			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.get("http://stage.copious.care:4200/");
			//driver.get("https://stage.copious.care/");
			driver.manage().window().fullscreen();
			 driver.get("https://app.copious.care/");
		}

		
		@Test(priority = 1)
		public void numberField() {
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
			highlightElement(By.xpath(mobileNumber));
			clickUsingJavaScript(By.xpath(mobileNumber));
		}

		@Test(priority = 2)
		public void sendOTP() throws InterruptedException {
			Thread.sleep(2000);
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));
			
			  waitForVisibilityOf(By.xpath(OTP1));
			   	driver.findElement(By.xpath(OTP1)).sendKeys("1");;
			   	highlightElement(By.xpath(OTP1));
			   	Thread.sleep(1000);
			   	waitForVisibilityOf(By.xpath(OTP2));
			   	driver.findElement(By.xpath(OTP2)).sendKeys("4");
			   	highlightElement(By.xpath(OTP2));
			   	Thread.sleep(1000);
			   	waitForVisibilityOf(By.xpath(OTP3));
			   	driver.findElement(By.xpath(OTP3)).sendKeys("0");;
			   	highlightElement(By.xpath(OTP3));
			   	Thread.sleep(1000);
			   	waitForVisibilityOf(By.xpath(OTP4));
			   	driver.findElement(By.xpath(OTP4)).sendKeys("5");;
			   	highlightElement(By.xpath(OTP4));
			   	Thread.sleep(1000);
			   	waitForVisibilityOf(By.xpath(OTP5));
			   	driver.findElement(By.xpath(OTP5)).sendKeys("2");;
			   	highlightElement(By.xpath(OTP5));
			   	Thread.sleep(1000);
			   	waitForVisibilityOf(By.xpath(OTP6));
			   	driver.findElement(By.xpath(OTP6)).sendKeys("0");;
			   	highlightElement(By.xpath(OTP6));
			       
		}

		@Test(priority = 3)
		public void verifyButton() throws InterruptedException {
			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(verifyOTP));
			driver.findElement(By.xpath(verifyOTP));
			highlightElement(By.xpath(verifyOTP));
			clickUsingJavaScript(By.xpath(verifyOTP));
			
		}

		@Test(priority = 4)
		public void searchBar() {
			waitForVisibilityOf(By.xpath(searchBar));
			driver.findElement(By.xpath(searchBar)).sendKeys("Test");
			
			//driver.findElement(By.xpath(searchBar)).sendKeys("pres");
			highlightElement(By.xpath(searchBar));
			clickUsingJavaScript(By.xpath(searchBar));
		}

		@Test(priority = 5)
		public void searchOpt() throws InterruptedException {
			Thread.sleep(3000);
			waitForVisibilityOf(By.xpath(searchOpt));
			driver.findElement(By.xpath(searchOpt));
			highlightElement(By.xpath(searchOpt));
			clickUsingJavaScript(By.xpath(searchOpt));
		}

		  @Test(priority = 6) public void clickPatient() throws InterruptedException {
		  Thread.sleep(10000);
		  
		  waitForVisibilityOf(By.cssSelector(clickPatient));
		  driver.findElement(By.cssSelector(clickPatient));
		  highlightElement(By.cssSelector(clickPatient));
		  clickUsingJavaScript(By.cssSelector(clickPatient)); }
		  
		  @Test(priority = 7) public void Investigation() throws InterruptedException {
			  
			  
			  waitForVisibilityOf(By.xpath(InvestigationClick));
			  driver.findElement(By.xpath(InvestigationClick));
			  highlightElement(By.xpath(InvestigationClick));
			  clickUsingJavaScript(By.xpath(InvestigationClick));
			  
			  waitForVisibilityOf(By.xpath(RequisitionClick));
			  driver.findElement(By.xpath(RequisitionClick));
			  highlightElement(By.xpath(RequisitionClick));
			  clickUsingJavaScript(By.xpath(RequisitionClick));
			  
			  waitForVisibilityOf(By.xpath(NewRequisition));
			  driver.findElement(By.xpath(NewRequisition));
			  highlightElement(By.xpath(NewRequisition));
			  clickUsingJavaScript(By.xpath(NewRequisition));
			  
			  
			  Thread.sleep(3000);
			  waitForVisibilityOf(By.xpath(SelectTest));
			  driver.findElement(By.xpath(SelectTest));
			  highlightElement(By.xpath(SelectTest));
			  clickUsingJavaScript(By.xpath(SelectTest));
			  
			  waitForVisibilityOf(By.xpath(SelectPackageOption));
			  driver.findElement(By.xpath(SelectPackageOption));
			  highlightElement(By.xpath(SelectPackageOption));
			  clickUsingJavaScript(By.xpath(SelectPackageOption));
			  
			  waitForVisibilityOf(By.xpath(SelectPackage));
			  driver.findElement(By.xpath(SelectPackage));
			  highlightElement(By.xpath(SelectPackage));
			  clickUsingJavaScript(By.xpath(SelectPackage));
			  
			  Thread.sleep(15000);
			  
			  waitForVisibilityOf(By.xpath(RequisitionSaveAndShare));
			  driver.findElement(By.xpath(RequisitionSaveAndShare));
			  highlightElement(By.xpath(RequisitionSaveAndShare));
			  clickUsingJavaScript(By.xpath(RequisitionSaveAndShare));
			  
			  Thread.sleep(15000);
			  waitForVisibilityOf(By.xpath(ShareRequisition));
			  driver.findElement(By.xpath(ShareRequisition));
			  highlightElement(By.xpath(ShareRequisition));
			  clickUsingJavaScript(By.xpath(ShareRequisition));
			  
			  
			  
			  
			  
			  waitForVisibilityOf(By.xpath(CancelOption));
			  driver.findElement(By.xpath(CancelOption));
			  highlightElement(By.xpath(CancelOption));
			  clickUsingJavaScript(By.xpath(CancelOption));
			  
			  waitForVisibilityOf(By.xpath(RequisitionSharedMsge));
	        	highlightElement(By.xpath(RequisitionSharedMsge));
	        	 String Actualmsge=driver.findElement(By.xpath(RequisitionSharedMsge)).getText();
	        	 System.out.println("msge:"+Actualmsge);
	        	 String ErrorMsge="Requisition shared to patient successfully";
	            Assert.assertEquals(Actualmsge,ErrorMsge);
		  
		  }
		// @AfterClass public void close() throws IOException {
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
