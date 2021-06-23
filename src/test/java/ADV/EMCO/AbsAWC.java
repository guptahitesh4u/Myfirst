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


public class AbsAWC extends base {
	WebDriver driver;

	private static Logger log= LogManager.getLogger(login.class.getName());

	@Test
	public void abstraction() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		usernamepage unp=new usernamepage(driver);
		unp.txtuname().sendKeys("loadtesthedisagent13");
			PswPage pswPg=unp.btnlogin();
			pswPg.txtpsw().sendKeys("admin");
		pswPg.btnlogin().click();
		LandingPage lpg=new LandingPage(driver);
		
		myQueuePage mqp=lpg.quality();
		int age1;
		int i;
		//common actions above
		
		Select provider,evidence,visittype;
		AWC measureForm=new AWC(driver);
		for (i=1083;i<=1085;i++) {
		//	ABA measureForm=mqp.btnStart();
			driver=mqp.btnStart();
		age1=Integer.parseInt( measureForm.Age().getAttribute("Value"));
		
		
			driver.findElement(measureForm.P1DOS).sendKeys("02/01/2019");
			provider=new Select(driver.findElement(measureForm.P1PRVDRTYPE));
			evidence=new Select(driver.findElement(measureForm.P1EVDNC));
			visittype=new Select(driver.findElement(measureForm.P1VISITTYPE));
			provider.selectByIndex(1);
			evidence.selectByIndex(1);
			visittype.selectByIndex(1);
			
			
			driver.findElement(measureForm.P2DOS).sendKeys("02/01/2019");
			provider=new Select(driver.findElement(measureForm.P2PRVDRTYPE));
			evidence=new Select(driver.findElement(measureForm.P2EVDNC));
			visittype=new Select(driver.findElement(measureForm.P2VISITTYPE));
			provider.selectByIndex(1);
			evidence.selectByIndex(1);
			visittype.selectByIndex(1);
			
			driver.findElement(measureForm.P3DOS).sendKeys("02/01/2019");
			provider=new Select(driver.findElement(measureForm.P3PRVDRTYPE));
			evidence=new Select(driver.findElement(measureForm.P3EVDNC));
			visittype=new Select(driver.findElement(measureForm.P3VISITTYPE));
			provider.selectByIndex(1);
			evidence.selectByIndex(1);
			visittype.selectByIndex(1);
			
			driver.findElement(measureForm.P4DOS).sendKeys("02/01/2019");
			provider=new Select(driver.findElement(measureForm.P4PRVDRTYPE));
		
			visittype=new Select(driver.findElement(measureForm.P4VISITTYPE));
			provider.selectByIndex(1);
			visittype.selectByIndex(1);
			
			driver.findElement(measureForm.P5DOS).sendKeys("02/01/2019");
			provider=new Select(driver.findElement(measureForm.P5PRVDRTYPE));
			evidence=new Select(driver.findElement(measureForm.P5EVDNC));
			visittype=new Select(driver.findElement(measureForm.P5VISITTYPE));
			provider.selectByIndex(1);
			evidence.selectByIndex(1);
			visittype.selectByIndex(1);
		
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
@AfterTest
public void teardown()
{
	
	//driver.close();
}
	
}
