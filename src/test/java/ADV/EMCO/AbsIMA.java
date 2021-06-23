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


public class AbsIMA extends base {
	WebDriver driver;

	private static Logger log= LogManager.getLogger(login.class.getName());

	@Test
	public void abstraction() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		usernamepage unp=new usernamepage(driver);
		unp.txtuname().sendKeys("loadtesthedisagent19");
			PswPage pswPg=unp.btnlogin();
			pswPg.txtpsw().sendKeys("admin");
		pswPg.btnlogin().click();
		LandingPage lpg=new LandingPage(driver);
		
		myQueuePage mqp=lpg.quality();
		int age1;
		int i;
		//common actions above
		String nine, ten, eleven, thirteen;
		Select location;
		IMA measureForm=new IMA(driver);
		for (i=151;i<=160;i++) {
	
			driver=mqp.btnStart();
		age1=Integer.parseInt( measureForm.Age().getAttribute("Value"));
		
		
		nine=driver.findElement(measureForm.P0NINE).getAttribute("Value");
		ten=driver.findElement(measureForm.P0TEN).getAttribute("Value");
		eleven=driver.findElement(measureForm.P0ELEVEN).getAttribute("Value");
		thirteen=driver.findElement(measureForm.P0THIRTEEN).getAttribute("Value");
		
		driver.findElement(measureForm.P1VDATE).sendKeys(thirteen);
		location=new Select(driver.findElement(measureForm.P1LOCATION));
		location.selectByValue("Standalone Document (Undated)");
		
		driver.findElement(measureForm.P2VDATE).sendKeys(eleven);
		location=new Select(driver.findElement(measureForm.P2LOCATION));
		location.selectByValue("Standalone Document (Undated)");
		
		driver.findElement(measureForm.P6VDATE1).sendKeys(nine);
		location=new Select(driver.findElement(measureForm.P6LOCATION1));
		location.selectByValue("Standalone Document (Undated)");
		
		
		driver.findElement(measureForm.P6VDATE2).sendKeys(ten);
		location=new Select(driver.findElement(measureForm.P6LOCATION2));
		location.selectByValue("Standalone Document (Undated)");
		
		
		driver.findElement(measureForm.P6VDATE3).sendKeys(eleven);
		location=new Select(driver.findElement(measureForm.P6LOCATION3));
		location.selectByValue("Standalone Document (Undated)");
		

		
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
		log.info("Measure::IMA Record Number " + i + " Processed:"+	measureForm.RCRDID().getText());
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
