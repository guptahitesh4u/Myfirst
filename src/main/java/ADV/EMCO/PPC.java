package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PPC {

	
	
WebDriver driver;
	

	public PPC(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	By EDD=By.cssSelector("input[name*='PPC_P0_EstimatedDeliveryDateView']");
	By EDDDOS=By.cssSelector("input[name*='PPC_P0_EDD_DOSView']");
	By DD=By.cssSelector("input[name*='PPC_P0_DeliveryDateView']");
	
	
	By PPVD7=By.cssSelector("input[name*='PPC_P3_DeliveryDate7DaysView']");
	By PPVDOS=By.cssSelector("input[name*='PPC_P3_DOS']");
	By PPVCARE=By.cssSelector("select[name*='PPC_P3_PostPartumCare']");
	By PPVPRVDTYPE=By.cssSelector("select[name*='PPC_P3_ProviderType']");
	
	
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


