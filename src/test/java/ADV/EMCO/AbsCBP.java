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


public class AbsCBP extends base {
	WebDriver driver;

	private static Logger log= LogManager.getLogger(login.class.getName());

	@Test
	public void abstraction() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		usernamepage unp=new usernamepage(driver);
		unp.txtuname().sendKeys("loadtesthedisagent15");
			PswPage pswPg=unp.btnlogin();
			pswPg.txtpsw().sendKeys("admin");
		pswPg.btnlogin().click();
		LandingPage lpg=new LandingPage(driver);
		
		myQueuePage mqp=lpg.quality();
		int age1;
		int i;
		//common actions above
		
		Select ddyesno,ddbptype,ddhtnmng,ddmethod;
		CBP measureForm=new CBP(driver);
		for (i=833;i<=835;i++) {
		//	ABA measureForm=mqp.btnStart();
			driver=mqp.btnStart();
		age1=Integer.parseInt( measureForm.Age().getAttribute("Value"));
		
		
		
			ddyesno=new Select(driver.findElement(measureForm.P2YESNO));
			ddyesno.selectByValue("No");
			driver.findElement(measureForm.P2BPDOS).sendKeys("12/30/2019");
			ddbptype=new Select(driver.findElement(measureForm.P2BPTYPE));
			ddbptype.selectByValue("Single BP");
			
			driver.findElement(measureForm.P2SYSTOLIC).sendKeys("130");
			driver.findElement(measureForm.P2DIASTOLIC).sendKeys("80");
			ddhtnmng=new Select(driver.findElement(measureForm.P3HTNMAN));
			ddhtnmng.selectByValue("Yes");
			ddmethod=new Select(driver.findElement(measureForm.P3METHOD));
			ddmethod.selectByIndex(2);

			
			
			
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
		log.info("Measure::CBP Record Number " + i + " Processed:"+	measureForm.RCRDID().getText());
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
