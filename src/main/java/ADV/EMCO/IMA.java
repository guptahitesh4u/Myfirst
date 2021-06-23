package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMA {

	
	
WebDriver driver;
	

	
	public IMA(WebDriver driver) {
		this.driver=driver;
	}


	By P0NINE=By.cssSelector("input[name*='IMA_P0_DOBPlus9']");
	By P0TEN=By.cssSelector("input[name*='IMA_P0_DOBPlus10']");
	By P0ELEVEN=By.cssSelector("input[name*='IMA_P0_DOBPlus11']");
	By P0THIRTEEN=By.cssSelector("input[name*='IMA_P0_DOBPlus13']");
	
	
	By P1VDATE=By.cssSelector("input[name*='IMA_P1_VaccineDate_1']");
	By P1LOCATION=By.cssSelector("select[name*='IMA_P1_Location_1']");
	
	By P2VDATE=By.cssSelector("input[name*='IMA_P2_VaccineDate_1']");
	By P2LOCATION=By.cssSelector("select[name*='IMA_P2_Location_1']");
	
	By P6VDATE1=By.cssSelector("input[name*='IMA_P6_VaccineDate_1']");
	By P6LOCATION1=By.cssSelector("select[name*='IMA_P6_Location_1']");
	By P6VDATE2=By.cssSelector("input[name*='IMA_P6_VaccineDate_2']");
	By P6LOCATION2=By.cssSelector("select[name*='IMA_P6_Location_2']");
	By P6VDATE3=By.cssSelector("input[name*='IMA_P6_VaccineDate_3']");
	By P6LOCATION3=By.cssSelector("select[name*='IMA_P6_Location_3']");
	
		
	
	By YLIMG=By.cssSelector("input[name*='imgYellowBox']");
	By CMNT=By.cssSelector("textarea[class='annotorious-editor-text goog-textarea']");
	By cmntSave=By.cssSelector("a[class='annotorious-editor-button annotorious-editor-button-save']");
	
	By RCRDID=By.cssSelector("span[id='lblRecordID']");
	By COMPLETE=By.cssSelector("input[name='btnComplient']");
	By SAVEANDEXIT=By.cssSelector("input[name='btnFinalSave']");
		
	By AGE=By.cssSelector("input[name*='_P0_AGE']");
	

	
	public WebElement YLIMG() {
		return driver.findElement(YLIMG);
		
	}
	
	public WebElement CMNT() {
		return driver.findElement(CMNT);
		
	}
	
	public WebElement cmntSave() {
		return driver.findElement(cmntSave);
		
	}

	public WebElement RCRDID() {
		return driver.findElement(RCRDID);
		
	}
	
	public WebElement complete() {
		return driver.findElement(COMPLETE);
	}
	
	public WebElement saveandexit() {
		return driver.findElement(SAVEANDEXIT);
	}
	
	public WebElement Age() {
		return driver.findElement(AGE);
	}
	
}


