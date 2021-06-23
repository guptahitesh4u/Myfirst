package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CBP {

	
	
WebDriver driver;
	

	public CBP(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	By P2YESNO=By.cssSelector("select[name*='CBP_P2_InEligibleBP']");
	By P2BPDOS=By.cssSelector("input[name*='CBP_P2_DOS']");
	By P2BPTYPE=By.cssSelector("select[name*='CBP_P2_BPType']");
	By P2SYSTOLIC=By.cssSelector("input[name*='CBP_P2_MultipleSystolic1']");
	By P2DIASTOLIC=By.cssSelector("input[name*='CBP_P2_MultipleDiastolic1']");
	
	By AGE=By.cssSelector("input[name*='_P0_AGE']");
	
	By P3HTNMAN=By.cssSelector("select[name*='CBP_P11_HTNManaged']");
	By P3METHOD=By.cssSelector("select[name*='CBP_P11_HTNManagingMethod']");
	
	
	
	
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


