package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myQueuePage {
WebDriver driver;
	

	public myQueuePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By btnStart=By.xpath("(//input[@value='Start General Queue'])");

public WebDriver btnStart(){
	
	driver.findElement(btnStart).click();
	return driver;
}

	
	
}
