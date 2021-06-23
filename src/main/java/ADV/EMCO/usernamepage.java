package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class usernamepage {

	
WebDriver driver;
	
	public usernamepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By logo=By.xpath("//img[@id='imgAdvantmedLogo']");
	By txtuname=By.xpath("//input[@name='txtUserName']");
	By btnlogin=By.xpath("//input[@id='btnLogin']");
	By btnreset=By.xpath("//input[@id='btnReset']");
	
	
public WebElement logo(){
		
		return driver.findElement(logo);
	}
	
public WebElement txtuname(){
	
	return driver.findElement(txtuname);
}

public PswPage btnlogin(){
	
	driver.findElement(btnlogin).click();
	PswPage pswPg=new PswPage(driver);
	return pswPg;
}

public WebElement btnreset(){
	
	return driver.findElement(btnreset);
}


}
