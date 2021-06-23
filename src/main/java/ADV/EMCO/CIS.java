package ADV.EMCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CIS {

	
	
WebDriver driver;
	

	
	
	public CIS(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	By P042=By.cssSelector("input[name*='CIS_P0_DOBPlus42Days']");
	By P0180=By.cssSelector("input[name*='CIS_P0_DOBPlus180Days']");
	By P01BRTH=By.xpath("(//input[contains(@name,'CIS_P0_DOBPlus1')])[2]");
	By P02BRTH=By.xpath("//input[contains(@name,'CIS_P0_DOBPlus2')]");
	
	By DTAPVD1=By.cssSelector("input[name*='CIS_P1_DOS_1']");
	By DTAPLOC1=By.cssSelector("select[name*='CIS_P1_Location_1']");
	By DTAPVD2=By.cssSelector("input[name*='CIS_P1_DOS_2']");
	By DTAPLOC2=By.cssSelector("select[name*='CIS_P1_Location_2']");
	By DTAPVD3=By.cssSelector("input[name*='CIS_P1_DOS_3']");
	By DTAPLOC3=By.cssSelector("select[name*='CIS_P1_Location_3']");
	By DTAPVD4=By.cssSelector("input[name*='CIS_P1_DOS_4']");
	By DTAPLOC4=By.cssSelector("select[name*='CIS_P1_Location_4']");
	
	
	
	By IPVVD1=By.cssSelector("input[name*='CIS_P3_DOS_1']");
	By IPVLOC1=By.cssSelector("select[name*='CIS_P3_Location_1']");
	By IPVVD2=By.cssSelector("input[name*='CIS_P3_DOS_2']");
	By IPVLOC2=By.cssSelector("select[name*='CIS_P3_Location_2']");
	By IPVVD3=By.cssSelector("input[name*='CIS_P3_DOS_3']");
	By IPVLOC3=By.cssSelector("select[name*='CIS_P3_Location_3']");
	
	
	
	
	By HIBVD1=By.cssSelector("input[name*='CIS_P5_DOS_1']");
	By HIBLOC1=By.cssSelector("select[name*='CIS_P5_Location_1']");
	By HIBVD2=By.cssSelector("input[name*='CIS_P5_DOS_2']");
	By HIBLOC2=By.cssSelector("select[name*='CIS_P5_Location_2']");
	By HIBVD3=By.cssSelector("input[name*='CIS_P5_DOS_3']");
	By HIBLOC3=By.cssSelector("select[name*='CIS_P5_Location_3']");
	
	
	By PCVVD1=By.cssSelector("input[name*='CIS_P8_DOS_1']");
	By PCVLOC1=By.cssSelector("select[name*='CIS_P8_Location_1']");
	By PCVVD2=By.cssSelector("input[name*='CIS_P8_DOS_2']");
	By PCVLOC2=By.cssSelector("select[name*='CIS_P8_Location_2']");
	By PCVVD3=By.cssSelector("input[name*='CIS_P8_DOS_3']");
	By PCVLOC3=By.cssSelector("select[name*='CIS_P8_Location_3']");
	By PCVVD4=By.cssSelector("input[name*='CIS_P8_DOS_4']");
	By PCVLOC4=By.cssSelector("select[name*='CIS_P8_Location_4']");
	
	
	By ROTAVD1=By.cssSelector("input[name*='CIS_P9_DOS_1']");
	By ROTAVT1=By.cssSelector("select[name*='CIS_P9_VT_1']");
	By ROTALOC1=By.cssSelector("select[name*='CIS_P9_Location_1']");
	By ROTAVD2=By.cssSelector("input[name*='CIS_P9_DOS_2']");
	By ROTAVT2=By.cssSelector("select[name*='CIS_P9_VT_2']");
	By ROTALOC2=By.cssSelector("select[name*='CIS_P9_Location_2']");
	By ROTAVD3=By.cssSelector("input[name*='CIS_P9_DOS_3']");
	By ROTAVT3=By.cssSelector("select[name*='CIS_P9_VT_3']");
	By ROTALOC3=By.cssSelector("select[name*='CIS_P9_Location_3']");
	
	By HPTBVD1=By.cssSelector("input[name*='CIS_P6_DOS_1']");
	By HPTBLOC1=By.cssSelector("select[name*='CIS_P6_Location_1']");
	By HPTBVD2=By.cssSelector("input[name*='CIS_P6_DOS_2']");
	By HPTBLOC2=By.cssSelector("select[name*='CIS_P6_Location_2']");
	By HPTBVD3=By.cssSelector("input[name*='CIS_P6_DOS_3']");
	By HPTBLOC3=By.cssSelector("select[name*='CIS_P6_Location_3']");
	
	
	By HPTAVD1=By.cssSelector("input[name*='CIS_P2_DOS_1']");
	By HPTALOC1=By.cssSelector("select[name*='CIS_P2_Location_1']");
	
	
	By MMRVD1=By.cssSelector("input[name*='CIS_P4_DOS_1']");
	By MMRLOC1=By.cssSelector("select[name*='CIS_P4_Location_1']");
	By MMRHIST=By.cssSelector("input[name*='CIS_P4_History_1']");
	By MMREVIDENCE=By.cssSelector("input[name*='CIS_P4_HisEvd_1']");
	
	
	By VZVAVD1=By.cssSelector("input[name*='CIS_P7_DOS_1']");
	By VZVALOC1=By.cssSelector("select[name*='CIS_P7_Location_1']");
	
	By INFAVD1=By.cssSelector("input[name*='CIS_P10_DOS_1']");
	By INFALOC1=By.cssSelector("select[name*='CIS_P10_Location_1']");
	By INFAVD2=By.cssSelector("input[name*='CIS_P10_DOS_2']");
	By INFALOC2=By.cssSelector("select[name*='CIS_P10_Location_2']");
	
	
	
	By YLIMG=By.cssSelector("input[name*='imgYellowBox']");
	By CMNT=By.cssSelector("textarea[class='annotorious-editor-text goog-textarea']");
	By cmntSave=By.cssSelector("a[class='annotorious-editor-button annotorious-editor-button-save']");
	
	By RCRDID=By.cssSelector("span[id='lblRecordID']");
	By COMPLETE=By.cssSelector("input[name='btnComplient']");
	By SAVEANDEXIT=By.cssSelector("input[name='btnFinalSave']");
		
	By AGE=By.cssSelector("input[name*='_P0_AGE']");
	

	
	public WebElement YLIMG() {
		return driver.findElement(YLIMG);
		
	}
	
	public WebElement CMNT() {
		return driver.findElement(CMNT);
		
	}
	
	public WebElement cmntSave() {
		return driver.findElement(cmntSave);
		
	}

	public WebElement RCRDID() {
		return driver.findElement(RCRDID);
		
	}
	
	public WebElement complete() {
		return driver.findElement(COMPLETE);
	}
	
	public WebElement saveandexit() {
		return driver.findElement(SAVEANDEXIT);
	}
	
	public WebElement Age() {
		return driver.findElement(AGE);
	}
	
}


