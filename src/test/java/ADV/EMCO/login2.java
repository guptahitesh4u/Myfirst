package ADV.EMCO;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login2 extends base {
	WebDriver driver;
	reusables reu=new reusables();
	
	private static Logger log= LogManager.getLogger(login2.class.getName());

	@BeforeTest
	public void preTest() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("URL Launched");
	}
	@Test
	public void emcoLogin() throws IOException, IllegalArgumentException, IllegalAccessException {
		
			
		driver=reu.emcoLogin(driver);
		driver=reu.checkHeader(driver);
		driver=reu.workspace(driver);
		
	}
	
	@Test
	public void projectManagement() throws IOException, IllegalArgumentException, IllegalAccessException {
	
		
	}
@AfterTest
public void teardown()
{
	
	driver.close();
}
	
}
