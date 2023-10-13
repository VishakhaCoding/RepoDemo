package pivotalApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PreContinue extends Continue{
	@Test(priority = 14)
	public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> Clickpatient = driver
				.findElements(By.className("android.widget.TextView"));
		Clickpatient.get(5).click();

		// Working code for prescription
		// List<io.appium.java_client.MobileElement> els2 =
		// driver.findElements(By.className("android.widget.TextView"));
		// els2.get(8).click();

	}

	@Test(priority = 15)
	public void prescription() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		/*
		 * List<io.appium.java_client.MobileElement> Clickpatient = driver
		 * .findElements(By.className("android.widget.TextView"));
		 * Clickpatient.get(32).click();
		 */
		WebElement prescription =  driver.findElement(By.xpath("//*[@text='Prescription']"));
		prescription.click();
	}

	  @Test(priority=16) public void ComplaintAndDiagnosis() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> ComplaintAndDiagnosis =
			  driver.findElements(By.xpath("//*[@text='Complaints & Diagnosis']"));
			  ComplaintAndDiagnosis.get(0).click();
	  }
	  
	  @Test(priority=17) public void AddChiefComplaints() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> AddChiefComplaints =
	  driver.findElements(By.className("android.widget.TextView"));
	  AddChiefComplaints.get(18).click();
	  
	  }
	  
	  @Test(priority=18) public void Fever() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> AddChiefComplaints =
	  driver.findElements(By.xpath("//*[@text='Fever']"));
	  AddChiefComplaints.get(0).click();
	  
	  }
	  
	  @Test(priority=19) public void Details() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> Details =
	  driver.findElements(By.className("android.widget.TextView"));
	  Details.get(6).click();
	  
	  }
	  
	  @Test(priority=20) public void mild() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> mild =
	  driver.findElements(By.className("android.widget.TextView"));
	  mild.get(12).click();
	  
	  }
	  
	  @Test(priority=21) public void moreSymptoms() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> moreSymptoms =
	  driver.findElements(By.className("android.widget.TextView"));
	  moreSymptoms.get(7).click();
	  
	  }
	  
	  
	  
	  @Test(priority=22) public void Since2Days() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> Since2Days =
	  driver.findElements(By.className("android.widget.TextView"));
	  Since2Days.get(9).click();
	  
	  }
	  
	  @Test(priority=23) public void AddComplaint() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> AddComplaint =
	  driver.findElements(By.className("android.widget.TextView"));
	  AddComplaint.get(30).click();
	  
	  }
	  
	  @Test(priority=24) public void AddWorkingDiagnosis() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> AddWorkingDiagnosis =
	  driver.findElements(By.className("android.widget.TextView"));
	  AddWorkingDiagnosis.get(23).click();
	  
	  }
	  
	  @Test(priority=25) public void AcuteUrti() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> AddWorkingDiagnosis =
	  driver.findElements(By.xpath("//*[@text='ACUTE URTI']"));
	  AddWorkingDiagnosis.get(0).click();
	  
	  }
	  
	  @Test(priority=26) public void AddDiagnosis() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> AddDiagnosis =
	  driver.findElements(By.xpath("//*[@text='Add Diagnosis']"));
	  AddDiagnosis.get(0).click();
	  
	  }
	  
	  @Test(priority=27) public void Medicine() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> Medicine =
			  driver.findElements(By.xpath("//*[@text='Medicines']"));
			  Medicine.get(0).click();
	  
	  }
	  
	  @Test(priority=28) public void TapToAddMedicine() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> TapToAddMedicine =
	  driver.findElements(By.xpath("//*[@text='Tap to add Medicines']"));
	  TapToAddMedicine.get(0).click();
	  
	  }
	  
	  @Test(priority=29) public void SearchMedDolo() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> SearchMedDolo =
	  driver.findElements(By.className("android.widget.EditText"));
	  SearchMedDolo.get(0).sendKeys("Dolo"); SearchMedDolo.get(0).click();
	  SearchMedDolo.get(0).sendKeys("Dolo");
	  List<WebElement> SearchMedDolo1 =
	  driver.findElements(By.className("android.widget.TextView"));
	  SearchMedDolo1.get(4).click();
	  
	  }
	  
	  @Test(priority=30) public void AddToPrescription() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> AddToPrescription =
	  driver.findElements(By.className("android.widget.TextView"));
	  AddToPrescription.get(31).click(); }
	  
	  @Test(priority=31) public void ClickFavourite() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> ClickFavourite =
	  driver.findElements(By.xpath("//*[@text='Favourite']"));
	  ClickFavourite.get(0).click(); }
	  
	  @Test(priority=25) public void ClickFavoutiteDropdown() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> ClickFavoutiteDropdown =
	  driver.findElements(By.className("android.widget.EditText"));
	  ClickFavoutiteDropdown.get(0).click(); }
	  
	  @Test(priority=32) public void ClickFavoutiteMedDrp() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> ClickFavoutiteDropdown =
	  driver.findElements(By.className("android.widget.TextView"));
	  ClickFavoutiteDropdown.get(1).click(); }
	  
	  @Test(priority=27) public void ClickFavoutiteMedicine() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> ClickFavoutiteMedicine =
	  driver.findElements(By.className("android.widget.TextView"));
	  ClickFavoutiteMedicine.get(6).click(); }
	  
	  @Test(priority=33) public void CopyMedicine() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> CopyMedicine =
	  driver.findElements(By.className("android.widget.TextView"));
	  CopyMedicine.get(15).click(); }
	  
	  @Test(priority=34) public void popularClick() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> popularClick =
	  driver.findElements(By.xpath("//*[@text='Popular']"));
	  popularClick.get(0).click(); }
	  
	  @Test(priority=35) public void popularMedicineClick() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> popularMedicineClick =
	  driver.findElements(By.className("android.widget.TextView"));
	  popularMedicineClick.get(3).click();
	  
	  
	  
	  
	  
		/*
		 * List<io.appium.java_client.MobileElement> popularMedicineClick1 =
		 * driver.findElements(By.className("android.widget.TextView"));
		 * popularMedicineClick1.get(33).click();
		 * 
		 * MobileElement li= (MobileElement)driver.findElement(MobileBy.
		 * AndroidUIAutomator("new UiScrollable(new UiSelector().description(\"text\"));"
		 * ));
		 */
	  
	  
	  
	  
	  
	  }
	  
	  @Test(priority=36) public void popularCopyMedicine() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> popularCopyMedicine =
	  driver.findElements(By.xpath("//*[@text='Copy Medicines']"));
	  popularCopyMedicine.get(0).click();
	  }

	/*
	 * //close medicine Thread.sleep(2000);
	 * List<io.appium.java_client.MobileElement> popularMedicineClick =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * popularMedicineClick.get(17).click();
	 */

	//}

	  @Test(priority=37) public void DietAndNutrition() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  WebElement DietAndNutrition = driver.findElement(By.xpath("//*[@text='Diet & Nutrition']"));
	  DietAndNutrition.click();

	}
	  @Test(priority=38) public void DietAndNutritionAdd() throws
	  InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	  List<WebElement> DietAndNutritionAdd =
			  driver.findElements(By.className("android.widget.TextView"));
			  DietAndNutritionAdd.get(28).click();
	  
	}
	  @Test(priority=34) public void DietAdvice() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  
	 
	  WebElement DietAdvice =  driver.findElement(By.xpath("//*[@text='Balanced diet']"));
	  DietAdvice.click();}

	  @Test(priority=39) public void AddDietAdvice() throws InterruptedException,
	  IndexOutOfBoundsException{ Thread.sleep(2000);
	  
	  WebElement DietAdvice = driver.findElement(By.xpath("//*[@text='Add Dietary Advice']"));
	DietAdvice.click();
	  
	  
	 }
	 

	@Test(priority = 40)
	public void GeneralInstructions() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement GeneralInstructions = driver.findElement(By.xpath("//*[@text='General Instructions']"));
		  GeneralInstructions.click();
	}

	@Test(priority = 41)
	public void GeneralInstructionsAdd() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> GeneralInstructionsAdd = driver
				.findElements(By.className("android.widget.TextView"));
		GeneralInstructionsAdd.get(33).click();
		
	}

	@Test(priority = 42)
	public void InstructionsAdd() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement InstructionsAdd =  driver.findElement(By.xpath("//*[@text='Doodh halad']"));
		InstructionsAdd.click();
	}

	@Test(priority = 43)
	public void Instructions() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement Instructions =  driver.findElement(By.xpath("//*[@text='Add Instructions']"));
		Instructions.click();
	}

	@Test(priority = 44)
	public void NextFollowup() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement NextFollowup =  driver.findElement(By.xpath("//*[@text='Next Followup']"));
		NextFollowup.click();
		Thread.sleep(2000);
	}

	@Test(priority = 45)
	public void NextFollowupCln7der() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		List<WebElement> NextFollowupClnder = driver
				.findElements(By.className("android.widget.TextView"));
		NextFollowupClnder.get(38).click();
	}

	/*
	 * @Test(priority=42) public void calenderDrpdwn() throws InterruptedException,
	 * IndexOutOfBoundsException{ Thread.sleep(2000);
	 * 
	 * 
	 * List<io.appium.java_client.MobileElement> calenderDrpdwn =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * calenderDrpdwn.get(1).click(); }
	 * 
	 * @Test(priority=43) public void calenderDrpdwnDate() throws
	 * InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	 * 
	 * 
	 * List<io.appium.java_client.MobileElement> calenderDrpdwnDate =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * calenderDrpdwnDate.get(4).click(); }
	 */
	@Test(priority = 46)
	public void NextOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement NextOk =  driver.findElement(By.xpath("//*[@text='Ok']"));
		NextOk.click();
	}

	@Test(priority = 47)
	public void NextVistTab() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);


		WebElement NextVistTab =  driver.findElement(By.xpath("//*[@text='Visit']"));
		NextVistTab.click();
	}

	@Test(priority = 48)
	public void PreviewPrescription() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement PreviewPrescription =  driver.findElement(By.xpath("//*[@text='Preview']"));
		PreviewPrescription.click();
	}

	@Test(priority = 49) public void SaveAndShare() throws InterruptedException,
	IndexOutOfBoundsException { Thread.sleep(10000);

	List<WebElement> SaveAndShare = driver
	.findElements(By.className("android.widget.TextView"));
	SaveAndShare.get(4).click(); }

	@Test(priority = 50) public void DownloadPrint() throws InterruptedException,
	IndexOutOfBoundsException { Thread.sleep(5000);

	List<WebElement> DownloadPrint = driver
	.findElements(By.className("android.widget.TextView"));
	DownloadPrint.get(8).click(); }
}
