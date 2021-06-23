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


public class absABA extends base {
	WebDriver driver;

	private static Logger log= LogManager.getLogger(login.class.getName());

	@Test
	public void abstraction() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		usernamepage unp=new usernamepage(driver);
		unp.txtuname().sendKeys("loadtesthedisagent10");
			PswPage pswPg=unp.btnlogin();
			pswPg.txtpsw().sendKeys("admin");
		pswPg.btnlogin().click();
		LandingPage lpg=new LandingPage(driver);
		
		myQueuePage mqp=lpg.quality();
		int age1;
		int i;
		//common actions above
		
		ABA measureForm=new ABA(driver);
		for (i=607;i<=610;i++) {
		//	ABA measureForm=mqp.btnStart();
			driver=mqp.btnStart();
		
		age1=Integer.parseInt( measureForm.Age().getAttribute("Value"));
		
		if (age1<=22)
		{
		
		
		}
		else
		{
			
			measureForm.BMIDOS().sendKeys("01/01/2019");
			measureForm.BMIVAL().sendKeys("24");
			
		
		measureForm.WGHDOS().sendKeys("01/01/2019");
		measureForm.WGHVAL().sendKeys("60");
		Select wghUnit=new Select(measureForm.WGHUNIT());
		wghUnit.selectByValue("Kg");
		}
		
		
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
		log.info("Measure::ABA Record Number " + i + " Processed:"+	measureForm.RCRDID().getText());
		System.out.println("Record Number " + i + " Processed:"+	measureForm.RCRDID().getText());
		measureForm.complete().click();
		measureForm.saveandexit().click();

		}
		
	
	}
@AfterTest
public void teardown()
{
	
	//driver.close();
}
	
}
