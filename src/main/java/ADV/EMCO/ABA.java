package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ABA {

	
	
WebDriver driver;
	
	public ABA(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By BMIDOS=By.cssSelector("input[name*='ABA_P1_DOS']");
	By BMIVAL=By.cssSelector("input[name*='ABA_P1_Value']");
	

	By WGHDOS=By.cssSelector("input[name*='ABA_P6_DOS']");
	By WGHVAL=By.cssSelector("input[name*='ABA_P6_Value']");
	By WGHUNIT=By.cssSelector("select[name*='ABA_P6_WType']");
	
	
	By YLIMG=By.cssSelector("input[name*='imgYellowBox']");
	By CMNT=By.cssSelector("textarea[class='annotorious-editor-text goog-textarea']");
	By cmntSave=By.cssSelector("a[class='annotorious-editor-button annotorious-editor-button-save']");
	
	By RCRDID=By.cssSelector("span[id='lblRecordID']");
	By COMPLETE=By.cssSelector("input[name='btnComplient']");
	By SAVEANDEXIT=By.cssSelector("input[name='btnFinalSave']");
	
	By BMIPERDOS=By.cssSelector("input[name*='ABA_P2_DOS']");
	By BMIPERVAL=By.cssSelector("input[name*='ABA_P2_Value']");
	By BMIPERTYPE=By.cssSelector("input[name*='ABA_P2_precentile']");
	
	By AGE=By.cssSelector("input[name*='ABA_P0_AGE']");
	public WebElement BMIDOS() {
		return driver.findElement(BMIDOS);
		
	}

	
	public WebElement BMIPERVAL() {
		return driver.findElement(BMIPERVAL);
		
	}
	
	public WebElement BMIPERDOS() {
		return driver.findElement(BMIPERDOS);
		
	}

	public WebElement BMIPERTYPE() {
		return driver.findElement(BMIPERTYPE);
		
	}

	
	public WebElement BMIVAL() {
		return driver.findElement(BMIVAL);
		
	}
	public WebElement WGHDOS() {
		return driver.findElement(WGHDOS);
		
	}
	public WebElement WGHVAL() {
		return driver.findElement(WGHVAL);
		
	}
	public WebElement WGHUNIT() {
		return driver.findElement(WGHUNIT);
		
	}
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


