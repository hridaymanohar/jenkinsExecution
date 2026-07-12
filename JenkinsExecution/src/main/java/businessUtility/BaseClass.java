package businessUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import genricUtility.FileUtility;
import genricUtility.WebDriverUtility;
import genricUtility.javaUtility;
import objectRepository.LoginPage;
import objectRepository.contactPage;
import objectRepository.creatCampaignePage;
import objectRepository.homePage;

public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;
	
	public FileUtility futil=new  FileUtility();
	public WebDriverUtility webUtil=  new WebDriverUtility();
	public javaUtility jUtil = new javaUtility();
	
	public homePage homepage = new homePage(driver);
	public LoginPage login;
	public homePage home ;
	public creatCampaignePage campaignPage;
	public contactPage contactPage;
	
	
	//@Parameters ("browser")
	@BeforeClass
	public void launchBrowser() throws IOException {
	
		
		 String BROWSER1 = futil.readDataFromPropertiesFile("browser");
		
		if(BROWSER1.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if (BROWSER1.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if (BROWSER1.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			Reporter.log("browser not supported");
			
		}
		
		
		String URL = futil.readDataFromPropertiesFile("url");
		//driver= new ChromeDriver();
		sdriver = driver;
		
		
		webUtil.toMaximize(driver);
		webUtil.toImplicitlyWait(driver);
		webUtil.toGetURL(driver, URL);
	}
	@BeforeMethod
	public void login() throws IOException {
		
		LoginPage loginpage=new LoginPage(driver);
		String USERNAME=futil.readDataFromPropertiesFile("username");
		String PASSWORD= futil.readDataFromPropertiesFile("password");
		
		loginpage.getEmailTextField().sendKeys(USERNAME);
		loginpage.getPassWord().sendKeys(PASSWORD);
		loginpage.getLoginButton().submit();
	}
	
	@AfterMethod
	public void logout() {
		homePage homepage=new homePage(driver);
		webUtil.moveToElement(driver,homepage.getAdministator());
		homepage.getSignOut().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		webUtil.quit(driver);
	}
	

}




