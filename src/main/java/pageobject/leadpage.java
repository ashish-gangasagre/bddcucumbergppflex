package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class leadpage  {
	
	public WebDriver ldriver;
	
	public leadpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);		
	}
	
	
	By dob=By.xpath("//*[@id='ageItem']");
		
	
			
	@FindBy(xpath="//span[text()='Select Your Income']")
	WebElement annualinc;
	
	@FindBy(xpath="(//div[contains(text(),'10L - 14.9L')])[1]")
	WebElement anclick;
	
	
	By mnumber=By.xpath("//*[@id='mobileItem']");
									
	By eid=By.xpath("//*[@id='emailItem']");
	
	By chek=By.xpath("(//button[@class='ant-btn ant-btn-round ant-btn-primary ant-btn-lg GenericFormButton'])[1]");
	
	
	
	public void dateofbirth(String age) {
		
		ldriver.findElement(dob).sendKeys(age);
	}

	public void maritalstatus(String Income) throws Exception {
	     // mstatus.sendKeys(Single);
	Select annualincc=new Select(annualinc);
		annualincc.selectByVisibleText(Income);
		
		//annualinc.click();
		//Thread.sleep(2000);
		
	}public void ann(String mobilnumber) throws Exception {
		annualinc.click();
		Thread.sleep(2000);
		
		}public void annclick(String mobilnumber) {
			anclick.click();
		}


	
	public void monumber(String mobilnumber) {
	ldriver.findElement(mnumber).sendKeys(mobilnumber);	
	}
	public void rmailid(String emailid) {
		ldriver.findElement(eid).sendKeys(emailid);
	}
	public void calculateretn() {
		ldriver.findElement(chek).click();
	}

	public void maritalstatus(Double double1, Integer int1) {
		Select annualincc=new Select(annualinc);
		annualincc.selectByVisibleText("10L - 14.9L");
		
		
	}
}
