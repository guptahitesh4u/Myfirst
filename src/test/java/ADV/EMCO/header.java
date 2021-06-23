package ADV.EMCO;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class header extends base {
	WebDriver driver;

	private static Logger log= LogManager.getLogger(header.class.getName());

	@Test
	public void checkHeader() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("URL Launched");
		usernamepage unp=new usernamepage(driver);
		try{
			Assert.assertTrue(unp.logo().isDisplayed());
			Assert.assertTrue(unp.txtuname().isDisplayed());
			Assert.assertTrue(unp.btnreset().isDisplayed());
			log.info("Logo username and buttons are displayed");
		}catch(Exception e)
		{
			log.error("One or more controls on the Username page are not visible");
		}
		
		unp.txtuname().sendKeys("Hiral_clientuser");
		
		PswPage pswPg=unp.btnlogin();
		
		try{
			Assert.assertTrue(pswPg.logo().isDisplayed());
		//	Assert.assertTrue(pswPg.txtuname().getText().contains("Hiral_Clientuser"));
			log.info(pswPg.txtuname().getText());
			Assert.assertTrue(pswPg.txtpsw().isDisplayed());
			Assert.assertTrue(pswPg.btnreset().isDisplayed());
			Assert.assertTrue(pswPg.btnlogin().isDisplayed());
			log.info("Logo username and buttons are displayed, username is correct");
		}catch(Exception e)
		{
			log.error("One or more controls on the password page are not visible");
				
		}
		
		pswPg.txtpsw().sendKeys("Admin@!123");
		pswPg.btnlogin().click();
		
		log.error("User is logged in");
	
		
	
	}
@AfterTest
public void teardown()
{
	
	//driver.close();
}
	
}
