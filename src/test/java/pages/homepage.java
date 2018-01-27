package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common.common1;

public class homepage  {
	
	@FindBy(how = How.XPATH, using ="//*[@id='nav']/ul/li[2]/a")
    private WebElement JoinNow;
	
	@FindBy(how = How.XPATH, using = "//*[@id='firstName']")
    private WebElement Firstname;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lastName']")
    private WebElement Lastname;
	
	@FindBy(how = How.XPATH, using = "//*[@id='email']")
    private WebElement Email;
	
	@FindBy(how = How.XPATH, using = "//*[@id='confirmEmail']")
    private WebElement ConEmail;
    
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
    private WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id='gender']")
    private WebElement gender;
	
	@FindBy(how = How.XPATH, using = "//*[@id='month']")
    private WebElement month;
	
	@FindBy(how = How.XPATH, using = "//*[@id='day']")
    private WebElement day;
	
	@FindBy(how = How.XPATH, using = "//*[@id='year']")
    private WebElement year;
	
	@FindBy(how = How.XPATH, using = "//*[@id='signup']/p/button")
    private WebElement CreateButton;
	common1 CM;
	private WebDriver driver;


	public homepage(WebDriver driver) {
	   	   this.driver=driver;
	   	   CM=new common1();
	   	   PageFactory.initElements(this.driver, this);
	      }
	
	public void createAccount(String first, String last, String email, String gndr ,String pwd) {
		System.out.println("am in create account");
		CM.click1(JoinNow);
		CM.getfirstname(Firstname,first);
	   	  CM.getlastname(Lastname,last);
	   	   CM.getemail(Email,email);
	   	   CM.getConfirmemail(ConEmail,email);
	   	   CM.getpcode(Password,pwd);
	   	   CM.getmonth(month);
	   	   CM.getday(day);
	   	   CM.getyear(year);
	   	   CM.getgender(gender,gndr);
	   	  CM.click1(CreateButton);
	}

}
