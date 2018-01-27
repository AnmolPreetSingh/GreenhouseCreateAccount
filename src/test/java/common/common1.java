package common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class common1 {
	public WebDriver driver;
	public  Logger logger=Logger.getLogger(common1.class);

	
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	    logger.info("opening browser");
	    driver = new ChromeDriver();
	    return driver;
	}
	public void closeBrowser() {
		driver.quit();
	}
	
	public void openUrl() {
		 driver.get("http://10.1.10.238:8081/greenhouse-1.0.0.BUILD-SNAPSHOT/");
		  logger.info("opened greenhouse");
	}
	
	 public void click1(WebElement sElement)
	  {
		 System.out.println(sElement);
		 logger.info(sElement+"trying to click");
		 
		 try {
			 sElement.click();
			// System.out.println("clicked ");
			 logger.info(sElement+"clicked");
		 }catch(Exception e) {
			 Assert.fail("Link is not found");
		 }
	  }
	  

	  public void getfirstname(WebElement Firstname, String fname)
	  {
		  try
		  {
			  
			 Firstname.sendKeys(fname);
			 logger.info(Firstname+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	  
	  public void getlastname(WebElement Lastname,String lname)
	  {
		  try
		  {
			  
			 Lastname.sendKeys(lname);
			 logger.info(Lastname+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	  public void getemail(WebElement Email,String email)
	  {
		  try
		  {
			  
			Email.sendKeys(email);
			 logger.info(Email+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	  public void getConfirmemail(WebElement ConEmail,String email)
	  {
		  try
		  {
			  
			ConEmail.sendKeys(email);
			 logger.info(ConEmail+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	  public void getpcode(WebElement Password,String pwd)
	  {
		  try
		  {
			  
			Password.sendKeys(pwd);
			 logger.info(Password+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	  public void getmonth(WebElement month)
	  {
		  try
		  {
			  
			month.sendKeys("07");
			 logger.info(month+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	   
	  public void getday(WebElement day)
	  {
		  try
		  {
			  
			day.sendKeys("19");
			 logger.info(day+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	  
	  public void getyear(WebElement year)
	  {
		  try
		  {
			  
			year.sendKeys("1994");
			 logger.info(year+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	  
	  public void getgender(WebElement gender,String gndr)
	  {
		  try
		  {
			  
			gender.sendKeys(gndr);
			 logger.info(gender+ "entered ");
		  }
		  catch(Exception e){
			  Assert.fail();
			  
		  }
	  }
	   
}
