package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AWC {

	
	
WebDriver driver;
	
	public AWC(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By P1DOS=By.cssSelector("input[name*='AWC_P1_DOS']");
	By P1VISITTYPE=By.cssSelector("select[name*='AWC_P1_Visit']");
	By P1PRVDRTYPE=By.cssSelector("select[name*='AWC_P1_Provider']");
	By P1EVDNC=By.cssSelector("select[name*='AWC_P1_Evidence']");
	
	
	By P2DOS=By.cssSelector("input[name*='AWC_P2_DOS']");
	By P2VISITTYPE=By.cssSelector("select[name*='AWC_P2_Visit']");
	By P2PRVDRTYPE=By.cssSelector("select[name*='AWC_P2_Provider']");
	By P2EVDNC=By.cssSelector("select[name*='AWC_P2_Evidence']");
	
	By P3DOS=By.cssSelector("input[name*='AWC_P3_DOS']");
	By P3VISITTYPE=By.cssSelector("select[name*='AWC_P3_Visit']");
	By P3PRVDRTYPE=By.cssSelector("select[name*='AWC_P3_Provider']");
	By P3EVDNC=By.cssSelector("select[name*='AWC_P3_Evidence']");
	
	By P4DOS=By.cssSelector("input[name*='AWC_P4_DOS']");
	By P4VISITTYPE=By.cssSelector("select[name*='AWC_P4_Visit']");
	By P4PRVDRTYPE=By.cssSelector("select[name*='AWC_P4_Provider']");
	By P4EVDNC=By.cssSelector("select[name*='AWC_P4_Evidence']");
	
	By P5DOS=By.cssSelector("input[name*='AWC_P5_DOS']");
	By P5VISITTYPE=By.cssSelector("select[name*='AWC_P5_Visit']");
	By P5PRVDRTYPE=By.cssSelector("select[name*='AWC_P5_Provider']");
	By P5EVDNC=By.cssSelector("select[name*='AWC_P5_Evidence']");

	
	
	By YLIMG=By.cssSelector("input[name*='imgYellowBox']");
	By CMNT=By.cssSelector("textarea[class='annotorious-editor-text goog-textarea']");
	By cmntSave=By.cssSelector("a[class='annotorious-editor-button annotorious-editor-button-save']");
	
	By RCRDID=By.cssSelector("span[id='lblRecordID']");
	By COMPLETE=By.cssSelector("input[name='btnComplient']");
	By SAVEANDEXIT=By.cssSelector("input[name='btnFinalSave']");
		
	By AGE=By.cssSelector("input[name*='AWC_P0_AGE']");
	

	
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


