package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PswPage {

	
WebDriver driver;
	
	public PswPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By logo=By.xpath("//img[@id='imgAdvantmedLogo']");
	By txtuname=By.xpath("//input[@name='txtUserName']");
	By txtpsw=By.xpath("//input[@name='txtPassword']");
	By btnlogin=By.xpath("//input[@id='btnLogin']");
	By btnreset=By.xpath("//input[@id='btnReset']");
	
	
public WebElement logo(){
		
		return driver.findElement(logo);
	}
	
public WebElement txtuname(){
	
	return driver.findElement(txtuname);
}

public WebElement txtpsw(){
	
	return driver.findElement(txtpsw);
}

public WebElement btnlogin(){
	
	
	 return driver.findElement(btnlogin);
	
}

public WebElement btnreset(){
	
	return driver.findElement(btnreset);
}


}
