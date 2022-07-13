package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjectmodel.LoginPagePage_Objects;
import Resources.BaseClass;
import Resources.Constants;


  //This is for demo purpose
  //this is for demo

public class VerifyLoginPage extends BaseClass {
 
 @Test  (dataProvider="testData")
 public void logInVerification(String username,String password) throws IOException, InterruptedException {
  //Browser launch
  //url launch
  //username and password
  //click on log in button
  
	 LoginPagePage_Objects Lp=new  LoginPagePage_Objects(driver);
  Lp.enterUsername().sendKeys("test");
  Lp.enterPassword().sendKeys("secure123");
  Lp.clickOnLogin().click();
   Thread.sleep(3000);
   

  String actualText= driver.findElement(By.xpath("//div[@class='loginError']")).getText();
  
   String expectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
  
   Assert.assertEquals("actualText", "expectedText");
  
  

 } 
 
 
 
 @DataProvider
 public Object[][] testData() {
  Object[][] data=new Object[2][2];
  data[0][0]=Constants.username1;
  data[0][1]=Constants.password1;
  data[1][0]=Constants.username2;
  data[1][1]=Constants.password2;
  
  return data;
  
 }}
 