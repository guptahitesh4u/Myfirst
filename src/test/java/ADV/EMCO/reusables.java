package ADV.EMCO;

import java.io.IOException;
import java.lang.reflect.Field;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class reusables extends base {
WebDriver driver;
	private static Logger log= LogManager.getLogger(login.class.getName());
	Listerners lst=new Listerners();
	public WebDriver emcoLogin(WebDriver driver) throws IOException {
		this.driver=driver;
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
			log.info("Logo, username, Pasword fields and buttons are displayed, username is correct");
		}catch(Exception e)
		{
			log.error("One or more controls on the password page are not visible");
				
		}
		
		pswPg.txtpsw().sendKeys("Admin@!123");
		pswPg.btnlogin().click();
		
		log.error("User is logged in");
	
		
	return driver;
	}
	
	public WebDriver workspace(WebDriver driver) throws IOException, IllegalArgumentException, IllegalAccessException {
		this.driver=driver;
		workspace wsp=new workspace(driver);
		String fname;
		WebElement elem;
	
		Field[] fields	= wsp.getClass().getDeclaredFields();
		System.out.println(fields.length);
		//Field[] fields = wsp.getClass().getFields();
		for(int i = 0; i < fields.length; i++) {
			if(fields[i].getType().toString().contains("org.openqa.selenium.By")) {
			//	System.out.println(fields[i].toString());
				
			//	System.out.println(fields[i].get(wsp));

				try {
					elem=returnElement(driver, (By) fields[i].get(wsp));
				
					if (elem.isDisplayed()) {
						log.info("Vairbale  "+ fields[i].toString() +" is displayed ");
					}
				}catch(Exception e)
				{
					log.info("Vairbale  "+ fields[i].toString() +" is not displayed ");
					
				}
			 
	         }
			

		}
	if (chkPageTitle(driver, wsp.pgtitle, "My Workspace"))	
	{
		log.info("Title verification passed");
			}
	else
	{
		log.info("Title verification didnt pass");
		
	}
	return driver;
	}
	
	
	@SuppressWarnings("unused")
	public WebDriver checkHeader(WebDriver driver) throws IOException {
		this.driver=driver;
		HeaderSection hs=new HeaderSection(driver);
		WebElement logo=hs.returnElement(hs.logo);
		
		WebElement HeaderMemberSearch=hs.returnElement(hs.HeaderMemberSearch);
		WebElement HeaderProviderSearch=hs.returnElement(hs.HeaderProviderSearch);
		WebElement HeaderSearchIcon=hs.returnElement(hs.HeaderSearchIcon);
		WebElement HeaderUserImage=hs.returnElement(hs.HeaderUserImage);
		WebElement HeaderNtfBell=hs.returnElement(hs.HeaderNtfBell);
		WebElement HeaderCreateTask=hs.returnElement(hs.HeaderCreateTask);
		WebElement HeaderSettings=hs.returnElement(hs.HeaderSettings); 

		WebElement HeaderBtnModule=hs.returnElement(hs.HeaderBtnModule);
		WebElement HeaderLogOff=hs.returnElement(hs.HeaderLogOff);
		log.info(" Logo Displayed??" + checkdisplayed(logo, driver));
		
		log.info(" HeaderMemberSearch Displayed??" + checkdisplayed(HeaderMemberSearch, driver));
		log.info(" HeaderProviderSearch Displayed??" + checkdisplayed(HeaderProviderSearch, driver));
		log.info(" HeaderUserImage Displayed??" + checkdisplayed(HeaderUserImage, driver));
		log.info(" HeaderNtfBell Displayed??" + checkdisplayed(HeaderNtfBell, driver));
		log.info(" HeaderCreateTask Displayed??" + checkdisplayed(HeaderCreateTask, driver));
		log.info(" HeaderSettings Displayed??" + checkdisplayed(HeaderSettings, driver));
		log.info(" HeaderBtnModule Displayed??" + checkdisplayed(HeaderBtnModule, driver));
		log.info(" HeaderLogOff Displayed??" + checkdisplayed(HeaderLogOff, driver));
		
	/*	try{
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
			log.info("Logo, username, Pasword fields and buttons are displayed, username is correct");
		}catch(Exception e)
		{
			log.error("One or more controls on the password page are not visible");
				
		}
		
		pswPg.txtpsw().sendKeys("Admin@!123");
		pswPg.btnlogin().click();
		
		log.error("User is logged in");
	*/
		
	return driver;
	}
	
	
	
	
}
