package Testcases;




import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pageobjectmodel.LoginPagePage_Objects;
import Pageobjectmodel.SignUpPageObjects;
import Resources.BaseClass;


public class VerifySignup extends BaseClass{
	@Test
	public void signUp() throws IOException, InterruptedException {
		   
		  
		  driverInitialization();
		  
		driver.get("https://login.salesforce.com/?locale=in");
		  
		  LoginPagePage_Objects lp=new LoginPagePage_Objects(driver);
		  lp.tryForfree().click();
		  
		   SignUpPageObjects sp= new  SignUpPageObjects(driver);
		   Thread.sleep(5000);
		   sp.enterFirstName().sendKeys("rahul");
		   
		   Select s=new Select(sp.selectJobtitle());
		   
		  s.selectByIndex(2);
		   
		  
         
         
         
         
}

		
	}
