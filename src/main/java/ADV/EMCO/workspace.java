package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class workspace extends base {
	
WebDriver driver;
	
	public workspace(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	By pgtitle=By.xpath("//div[@class='page-title']");
	By LeftPanelWorkSpace=By.id("lnkWorkSpace");
	By LeftPanelDashboard=By.cssSelector("[id*='Dashboard']");
	By LeftPanelMember=By.cssSelector("[id*='Members']");
	By LeftPanelProvider=By.cssSelector("[id*='Providers']");
	By LeftPanelProjMgmtr=By.cssSelector("[id*='lnkProject']");
	By LeftPanelWorkbench=By.cssSelector("[id*='left1_Workbench']");
	By LeftPanelLetterMgmt=By.cssSelector("[id*='LetterManagement']");
	By LeftPanelTaskMgmt=By.cssSelector("[id*='left1_TaskManagement']");
	By LeftPanelQualityInsight=By.cssSelector("[id*='lnkQuality']");
	By LeftPanelRiskAdjustment=By.cssSelector("[id*='lnkRevenue']");
	By LeftPanelSettings=By.cssSelector("[id*='lnkbtnSetting']");
	By LeftPanelDtaInsight=By.cssSelector("[id*='DataInsights']");
	By LeftPanelDataSubmission=By.xpath("//a[text()='Data Submission']");
	By LeftPanelSupport=By.cssSelector("[class*='helpdesk']");
	
	
	
	
	
	By MyworkbenchpanelTitle=By.xpath("(//div[@class='panel-heading'])[1]");
	By mywbnchpnlHeaderActivity=By.xpath("(//div[contains(@class,'grid-head')])[1]");
	By mywbnchpnlHeaderInprogress=By.xpath("(//div[contains(@class,'grid-head')])[2]");
	By mywbnchRAIrow=By.xpath("(//div[contains(@class,'grid-column')])[1]");
	By mywbnchRAIINP=By.xpath("(//div[contains(@class,'grid-column')])[2]");
	By mywbnchRAIAct=By.xpath("(//div[contains(@class,'grid-column')])[3]");
	By mywbnchHEDISrow=By.xpath("(//div[contains(@class,'grid-column')])[4]");
	By mywbnchHEDISINP=By.xpath("(//div[contains(@class,'grid-column')])[5]");
	By mywbnchHEIDSAct=By.xpath("(//div[contains(@class,'grid-column')])[6]");
	
	
	
	
	By WatchListPanelTitle=By.xpath("(//div[@class='panel-heading'])[2]");
	By WatchListPros=By.xpath("(//div[contains(@class,'tblMyWatchlist')])[1]");
	By WatchListRetro=By.xpath("(//div[contains(@class,'tblMyWatchlist')])[2]");
	By WatchListMember=By.xpath("(//div[contains(@class,'tblMyWatchlist')])[3]");
	By WatchListProvider=By.xpath("(//div[contains(@class,'tblMyWatchlist')])41]");
	
	
	By QuickLinksPanelTitle=By.xpath("(//div[@class='panel-heading'])[3]");
	By QuickLinkEdit=By.id("lblEditQuickLink");
		
	

}
