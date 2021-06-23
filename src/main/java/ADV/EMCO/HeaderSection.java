package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderSection extends base {
	
WebDriver driver;
	
	public HeaderSection(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By logo=By.xpath("//img[@alt='Advantmed']");
	
	
	By HeaderMemberSearch=By.cssSelector("a[id*='lnkMemberAdvancedSearch']");
	By HeaderProviderSearch=By.cssSelector("a[id*='lnkProviderAdvancedSearch']");
	By HeaderSearchIcon=By.xpath("//a[@href='##']");
	By HeaderUserImage=By.cssSelector("img[id*='imgUserProfileImage']");
	By HeaderNtfBell=By.className("notify-bell");
	By HeaderCreateTask=By.cssSelector("i[class*='fa-plus']");
	By HeaderSettings=By.cssSelector("i[class*='fa-cog']");
	By HeaderBtnModule=By.cssSelector("div[class*='medule-box']");
	By HeaderLogOff= By.cssSelector("[class*='power-off']");


	
	
public WebElement logo(){
		
		
		return driver.findElement(logo);
	}
	



public WebElement HeaderMemberSearch(){
	
	
	return driver.findElement(HeaderMemberSearch);
}

public WebElement HeaderProviderSearch(){
	
	
	return driver.findElement(HeaderProviderSearch);
}

public WebElement HeaderNtfBell(){
	
	
	return driver.findElement(HeaderNtfBell);
}

public WebElement HeaderCreateTask(){
	
	
	return driver.findElement(HeaderCreateTask);
}

public WebElement HeaderSearchIcon(){
	
	
	return driver.findElement(HeaderSearchIcon);
}

public WebElement HeaderBtnModule(){
	
	
	return driver.findElement(HeaderBtnModule);
}


public WebElement HeaderSettings(){
	
	
	return driver.findElement(HeaderSettings);
}


public WebElement HeaderUserImage(){
	
	
	return driver.findElement(HeaderUserImage);
}


public WebElement HeaderLogOff(){
	
	
	return driver.findElement(HeaderLogOff);
}


public WebElement returnElement(By eleName) {

	
	return driver.findElement(eleName);
}

}
