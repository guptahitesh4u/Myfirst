package ADV.EMCO;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;

	Properties prop=new Properties();
	public WebDriver initializeDriver() throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\Automation\\Trial\\EMCO\\src\\main\\java\\ADV\\EMCO\\data.properties");
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		if (browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Softwares\\chromedriver_win32_latest\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Automation\\Softwares\\geckodriver.exe");	
			driver=new FirefoxDriver();
		}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
	
	public String getscreenshotpath(String tcname,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String opfile=System.getProperty("user.dir")+"\\reports\\" +tcname+"_" + System.currentTimeMillis() +".png"; 
		FileUtils.copyFile(source, new File(opfile));
		return opfile;
		
		
	}
	
	public boolean checkdisplayed(WebElement elem, WebDriver driver)
	{
		if (elem.isDisplayed())
		{
			return true;
			
		}
		else {
		
		return false;
		}
		
	}
	
	public WebElement returnElement(WebDriver driver, By eleName) {

		
		return driver.findElement(eleName);
	}

	
public boolean chkPageTitle(WebDriver driver, By pgtitle, String expectedTitle)
{
	String actualTitle=driver.findElement(pgtitle).getText();
	System.out.println("Actual Title="+ actualTitle);
	System.out.println("Epected Title="+ expectedTitle);
	if (expectedTitle.equals(actualTitle)) {
		return true;
		
	}
	else
	{
		return false;
	}
}
}
