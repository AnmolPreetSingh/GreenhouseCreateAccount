package tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.ReadExl;
import common.common1;
import pages.homepage;


public class createAcc {
	private WebDriver driver;
	public common1 obj1;
	
	public  Logger logger= Logger.getLogger(createAcc.class);
	
	@BeforeMethod
	public void Setup() {
		obj1=new common1();
		driver=obj1.openBrowser();
		obj1.openUrl();
		logger.info("first hurdle");
	}
	
	@Test
	public void maintest() {
		ReadExl obj2=new ReadExl();
		String fname=obj2.sendfirstname();
		String lname=obj2.sendlastname();
		String pwd=obj2.sendPwd();
		String gender=obj2.gender();
		String email=obj2.sendEmail();
	
		homepage object=new homepage(driver);
		object.createAccount(fname, lname, pwd, gender, email);
		logger.info("second hurdle");
	}
	
	@AfterMethod(alwaysRun=true)
	public void teardown() {
		obj1.closeBrowser();
	}
	

}
