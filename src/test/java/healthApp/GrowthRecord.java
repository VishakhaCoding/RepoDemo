package healthApp;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GrowthRecord extends HealthLogin{
	@Test(priority = 5)
	public void SelectFamilyMember() throws MalformedURLException, InterruptedException {

		 Thread.sleep(5000);
		List<WebElement> SelectFamilyMember =driver.findElements(By.xpath(
				"//android.view.ViewGroup[@index='4']"));
		SelectFamilyMember.get(0).click();

		
		  Thread.sleep(5000);

	}
	@Test(priority = 6)
	public void AddButton() throws MalformedURLException, InterruptedException {
		

		List<WebElement> AddButton =driver.findElements(By.className(
				"android.widget.TextView"));
		AddButton.get(62).click();

		
		  Thread.sleep(5000);

	}
	@Test(priority = 7)
	public void GrowthRecord1() throws MalformedURLException, InterruptedException {
		

		List<WebElement> GrowthRecord1 =driver.findElements(By.xpath(
				"//*[@text='New Growth Record']"));
		GrowthRecord1.get(0).click();

		
		  Thread.sleep(5000);

	}

@Test(priority = 8)
public void Vital() throws MalformedURLException, InterruptedException {
	

	List<WebElement> weight =driver.findElements(By.className(
			"android.widget.EditText"));
	weight.get(0).sendKeys("5");
	
	List<WebElement> Height =driver.findElements(By.className(
			"android.widget.EditText"));
	Height.get(1).sendKeys("100");
	
	List<WebElement> HC =driver.findElements(By.className(
			"android.widget.EditText"));
	HC.get(2).sendKeys("25");
	
	List<WebElement> CC =driver.findElements(By.className(
			"android.widget.EditText"));
	CC.get(3).sendKeys("100");
	
	
	List<WebElement> Save =driver.findElements(By.xpath(
			"//*[@text='Save']"));
	Save.get(0).click();

	
	  Thread.sleep(5000);

}


}
