package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
  public WebDriver driver;
  
  By firstName=By.xpath("//input[@name='UserFirstName']");
  By JobTitle=By.xpath("//select[@name='UserTitle']");
  
  public SignUpPageObjects(WebDriver driver2) {
	  this.driver=driver2;
  }
  public WebElement enterFirstName() {
 return driver.findElement(firstName);
  }  
  public WebElement selectJobtitle() {
	  return driver.findElement(JobTitle);  
  }}