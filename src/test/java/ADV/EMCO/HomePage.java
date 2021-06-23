package ADV.EMCO;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends base {
/*	WebDriver driver;
	@Test(dataProvider="getData")
	public void checkURL(String uname, String psw) throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		homePageOR h1=new homePageOR(driver);
		h1.login().click();
		loginOR l1=new loginOR(driver);
		l1.username().sendKeys(uname);
		l1.password().sendKeys(psw);
		l1.login().click();
		
		
	}
	
	@AfterTest
	public void teardown()
		
	{
		driver.close();
	}
	
	
	@DataProvider
	public Object getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="test1@sometingranfff.com";
		data[0][1]="test1psw";
		data[1][0]="test2@sometingranfff.com";
		data[1][1]="test2psw";
		return data;
	}
	*/
}
