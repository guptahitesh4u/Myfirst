package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WCC {

	
	
WebDriver driver;
	


	public WCC(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By BMIDOS=By.cssSelector("input[name*='WCC_P1_DOS']");
	By BMIPER=By.cssSelector("input[name*='WCC_P1_Value']");
	By BMIPERTYPE=By.cssSelector("select[name*='WCC_P1_percentile']");
	
	
	By HTDOS=By.cssSelector("input[name*='WCC_P7_DOS']");
	By HTVAL=By.cssSelector("input[name*='WCC_P7_Height']");
	By HTUNIT=By.cssSelector("select[name*='WCC_P7_FeetInchType']");
	
	
	By WGHDOS=By.cssSelector("input[name*='WCC_P8_DOS']");
	By WGHVAL=By.cssSelector("input[name*='WCC_P8_Value']");
	By WGHUNIT=By.cssSelector("select[name*='WCC_P8_WType']");
	
	By NUTDOS=By.cssSelector("input[name*='WCC_P2_DOS']");
	By NUTEVE=By.cssSelector("select[name*='WCC_P2_Nutrition']");
	By NUTDOC=By.cssSelector("select[name*='WCC_P2_CapturedFrom']");
	
	
	By PHYDOS=By.cssSelector("input[name*='WCC_P3_DOS']");
	By PHYEVE=By.cssSelector("select[name*='WCC_P3_Activity']");
	By PHYDOC=By.cssSelector("select[name*='WCC_P3_CapturedFrom']");
	
	
	
	By AGE=By.cssSelector("input[name*='_P0_AGE']");
	By YLIMG=By.cssSelector("input[name*='imgYellowBox']");
	By CMNT=By.cssSelector("textarea[class='annotorious-editor-text goog-textarea']");
	By cmntSave=By.cssSelector("a[class='annotorious-editor-button annotorious-editor-button-save']");
	
	By RCRDID=By.cssSelector("span[id='lblRecordID']");
	By COMPLETE=By.cssSelector("input[name='btnComplient']");
	By SAVEANDEXIT=By.cssSelector("input[name='btnFinalSave']");
		
	
	

	
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


