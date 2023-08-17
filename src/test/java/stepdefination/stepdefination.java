package stepdefination;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.leadpage;

public class stepdefination extends base {
	
	
	

	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {
	    driver=new ChromeDriver();
	    lp=new leadpage(driver);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   // throw new io.cucumber.java.PendingException();
	  
	}

	@When("User open url {string}")
	public void user_open_url(String url) {
	    driver.get(url);
	   // throw new io.cucumber.java.PendingException();
	}
	@When("I enter dateofb as {string}")
	public void i_enter_dateofb_as(String dateofb) {
	    lp.dateofbirth(dateofb);
	}

	
	//@When("user select annualincome {string} from dropdown")
	//public void user_select_annualincome_from_dropdown(String option) throws Exception {
		//lp.maritalstatus(option);
		// Thread.sleep(2000); 
	//}
	@When("user select annualincome from dropdown")
	public void user_select_annualincome_from_dropdown(String drp) throws Exception {
		lp.maritalstatus(drp);
	}
	@When("user select annualincome \"10L {double} {int}.9L\"from dropdown")
	public void user_select_annualincome_10l_9l_from_dropdown(Double double1, Integer int1) {
		lp.maritalstatus(double1,int1);
	}
	@When("i ckick on {string}")
	public void i_ckick_on(String string) {
	   
	}




	@When("I enter mobilnumber as {string}")
	public void i_enter_mobilnumber_as(String mobilnumber) {
	   lp.monumber(mobilnumber);
	}

	@When("I enter emailid as {string}")
	public void i_enter_emailid_as(String emailid) {
		lp.rmailid(emailid);
	   
	}

	@When("I click on {string}")
	public void i_click_on(String string) {
	    lp.calculateretn();
	}
}
