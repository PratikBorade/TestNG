package Resources;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
 
 
 public WebDriver driver;
 public Properties prop;
 public WebDriver driverInitialization() throws IOException {

  //To Read the file- data.properties
  FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
  
  //To access the data.proprties
      prop=new Properties();
      prop.load(fis);
  
  String browserName=prop.getProperty("browser");
                         //
  if(browserName.equalsIgnoreCase("chrome")) {
   
  
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Chromedriver\\chromedriver.exe");
            driver = new ChromeDriver(); 
   
  }
  else if(browserName.equalsIgnoreCase("firefox")) {
   
   //Firefox code
  }
  else if(browserName.equalsIgnoreCase("edge")) {
   
   //Edge code
  }
  else {
   
      System.out.println("please enter valid browser name");
  }
  
  return driver;
  

 }
 
 @BeforeMethod
 public void browserLaunch() throws IOException {
  
  driverInitialization();
  //This drive has scope
  driver.get(prop.getProperty("url"));
  
 }
 

 @AfterMethod
 public void closeBrowser() throws IOException {
  driver.quit(); 
 }
 
 
}
