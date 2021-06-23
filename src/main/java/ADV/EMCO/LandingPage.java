package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	
WebDriver driver;
	



	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	By quality=By.xpath("//a[@alt='HEDIS']");
	By myqueue=By.xpath("//span[text()='MyQueue']");

public myQueuePage quality() throws InterruptedException{
	
	driver.findElement(quality).click();
	Thread.sleep(1000);
	driver.findElement(myqueue).click();
	myQueuePage myQP=new myQueuePage(driver);
	return myQP;
}




}
