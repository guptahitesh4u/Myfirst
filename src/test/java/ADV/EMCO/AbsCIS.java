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


public class AbsCIS extends base {
	WebDriver driver;

	private static Logger log= LogManager.getLogger(login.class.getName());

	@Test
	public void abstraction() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		usernamepage unp=new usernamepage(driver);
		unp.txtuname().sendKeys("loadtesthedisagent20");
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
		CIS measureForm=new CIS(driver);
		for (i=1;i<=135;i++) {
		//	ABA measureForm=mqp.btnStart();
			driver=mqp.btnStart();
		age1=Integer.parseInt( measureForm.Age().getAttribute("Value"));
	
		dt1=driver.findElement(measureForm.P042).getAttribute("Value");
		dt2=driver.findElement(measureForm.P0180).getAttribute("Value");
		dt3=driver.findElement(measureForm.P01BRTH).getAttribute("Value");
		dt4=driver.findElement(measureForm.P02BRTH).getAttribute("Value");
		
		
		enterVal(driver.findElement(measureForm.DTAPVD1),dt1);
		selectVal(new Select(driver.findElement(measureForm.DTAPLOC1)),"Standalone Document (Undated)");
		
		enterVal(driver.findElement(measureForm.DTAPVD2),dt2);
		selectVal(new Select(driver.findElement(measureForm.DTAPLOC2)),"Standalone Document (Undated)");
		
		enterVal(driver.findElement(measureForm.DTAPVD3),dt3);
		selectVal(new Select(driver.findElement(measureForm.DTAPLOC3)),"Standalone Document (Undated)");
		
		enterVal(driver.findElement(measureForm.DTAPVD4),dt4);
		selectVal(new Select(driver.findElement(measureForm.DTAPLOC4)),"Standalone Document (Undated)");
		
		
		enterVal(driver.findElement(measureForm.IPVVD1),dt1);
		selectVal(new Select(driver.findElement(measureForm.IPVLOC1)),"Standalone Document (Undated)");
		enterVal(driver.findElement(measureForm.IPVVD2),dt2);
		selectVal(new Select(driver.findElement(measureForm.IPVLOC2)),"Standalone Document (Undated)");
		enterVal(driver.findElement(measureForm.IPVVD3),dt3);
		selectVal(new Select(driver.findElement(measureForm.IPVLOC3)),"Standalone Document (Undated)");
		
		
		enterVal(driver.findElement(measureForm.HIBVD1),dt1);
		selectVal(new Select(driver.findElement(measureForm.HIBLOC1)),"Standalone Document (Undated)");
		enterVal(driver.findElement(measureForm.HIBVD2),dt2);
		selectVal(new Select(driver.findElement(measureForm.HIBLOC2)),"Standalone Document (Undated)");
		enterVal(driver.findElement(measureForm.HIBVD3),dt3);
		selectVal(new Select(driver.findElement(measureForm.HIBLOC3)),"Standalone Document (Undated)");
	
		enterVal(driver.findElement(measureForm.PCVVD1),dt1);
		selectVal(new Select(driver.findElement(measureForm.PCVLOC1)),"Standalone Document (Undated)");
		enterVal(driver.findElement(measureForm.PCVVD2),dt2);
		selectVal(new Select(driver.findElement(measureForm.PCVLOC2)),"Standalone Document (Undated)");						
		enterVal(driver.findElement(measureForm.PCVVD3),dt3);
		selectVal(new Select(driver.findElement(measureForm.PCVLOC3)),"Standalone Document (Undated)");
		enterVal(driver.findElement(measureForm.PCVVD4),dt4);
		selectVal(new Select(driver.findElement(measureForm.PCVLOC4)),"Standalone Document (Undated)");	
		

		enterVal(driver.findElement(measureForm.ROTAVD1),dt1);
		selectVal(new Select(driver.findElement(measureForm.ROTAVT1)),"Two dose Vaccine");
		selectVal(new Select(driver.findElement(measureForm.ROTALOC1)),"Standalone Document (Undated)");
		
		enterVal(driver.findElement(measureForm.ROTAVD2),dt2);
		selectVal(new Select(driver.findElement(measureForm.ROTAVT2)),"Two dose Vaccine");
		selectVal(new Select(driver.findElement(measureForm.ROTALOC2)),"Standalone Document (Undated)");

		
		enterVal(driver.findElement(measureForm.ROTAVD3),dt3);
		selectVal(new Select(driver.findElement(measureForm.ROTAVT3)),"Two dose Vaccine");
		selectVal(new Select(driver.findElement(measureForm.ROTALOC3)),"Standalone Document (Undated)");

		enterVal(driver.findElement(measureForm.HPTBVD1),dt3);
		selectVal(new Select(driver.findElement(measureForm.HPTBLOC1)),"Standalone Document (Undated)");
		enterVal(driver.findElement(measureForm.HPTBVD2),"01/01/2019");
		selectVal(new Select(driver.findElement(measureForm.HPTBLOC2)),"Standalone Document (Undated)");	
		enterVal(driver.findElement(measureForm.HPTBVD3),dt4);
		selectVal(new Select(driver.findElement(measureForm.HPTBLOC3)),"Standalone Document (Undated)");
		
		enterVal(driver.findElement(measureForm.HPTAVD1),dt3);
		selectVal(new Select(driver.findElement(measureForm.HPTALOC1)),"Standalone Document (Undated)");
		
		
		enterVal(driver.findElement(measureForm.MMRVD1),dt3);
		selectVal(new Select(driver.findElement(measureForm.MMRLOC1)),"Standalone Document (Undated)");

		enterVal(driver.findElement(measureForm.VZVAVD1),dt3);
		selectVal(new Select(driver.findElement(measureForm.VZVALOC1)),"Standalone Document (Undated)");
		
		
		enterVal(driver.findElement(measureForm.INFAVD1),dt3);
		selectVal(new Select(driver.findElement(measureForm.INFALOC1)),"Standalone Document (Undated)");
		
			enterVal(driver.findElement(measureForm.INFAVD2),dt4);
		selectVal(new Select(driver.findElement(measureForm.INFALOC2)),"Standalone Document (Undated)");
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
		log.info("Measure::AWC Record Number " + i + " Processed:"+	measureForm.RCRDID().getText());
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
