package ADV.EMCO;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class AbsPPC extends base {
	WebDriver driver;

	private static Logger log= LogManager.getLogger(login.class.getName());

	@Test
	public void abstraction() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		usernamepage unp=new usernamepage(driver);
		unp.txtuname().sendKeys("loadtesthedisagent22");
			PswPage pswPg=unp.btnlogin();
			pswPg.txtpsw().sendKeys("admin");
		pswPg.btnlogin().click();
		LandingPage lpg=new LandingPage(driver);
		
		myQueuePage mqp=lpg.quality();
		int age1;
		int i;
		//common actions above
		String dt1,dt2,dt3,dt4;
		Select loc;
		PPC measureForm=new PPC(driver);
		for (i=101;i<=111;i++) {
		//	ABA measureForm=mqp.btnStart();
			driver=mqp.btnStart();
		
			enterVal(driver.findElement(measureForm.EDD),driver.findElement(measureForm.DD).getAttribute("Value"));
			enterVal(driver.findElement(measureForm.EDDDOS),driver.findElement(measureForm.DD).getAttribute("Value"));
			enterVal(driver.findElement(measureForm.PPVDOS),driver.findElement(measureForm.PPVD7).getAttribute("Value"));
			selectVal(new Select(driver.findElement(measureForm.PPVCARE)),"Pelvic Exam");
			selectVal(new Select(driver.findElement(measureForm.PPVPRVDTYPE)),"OB Practitioner/A Midwife");
			
				//common actions start below
		Actions builder = new Actions(driver);
		measureForm.YLIMG().click();
		WebElement rt=driver.findElement(By.cssSelector("input[title*='Right']"));
	      Actions drawAction = builder.moveToElement(rt);  
	      
	      //signatureWebElement is the element that holds the signature element you have in the DOM
	                
	    
	      drawAction.moveByOffset(0, 60);
	      drawAction.clickAndHold();
	      drawAction.moveByOffset(50, 60);
	      
	      drawAction.release();
	      drawAction.perform();
	      
			measureForm.CMNT().sendKeys("Test");	
			measureForm.cmntSave().click();
		log.info("Measure::PPC Record Number " + i + " Processed:"+	measureForm.RCRDID().getText());
		System.out.println("Record Number " + i + " Processed:"+	measureForm.RCRDID().getText());
		measureForm.complete().click();
		measureForm.saveandexit().click();

		}
		
	
	}
	
	public void selectVal(Select elem, String Val)
	{
		elem.selectByValue((Val));
		
	}
	
	public void enterVal(WebElement elem, String Val)
	{
elem.sendKeys(Val);		
	}
@AfterTest
public void teardown()
{
	
	//driver.close();
}
	
}
