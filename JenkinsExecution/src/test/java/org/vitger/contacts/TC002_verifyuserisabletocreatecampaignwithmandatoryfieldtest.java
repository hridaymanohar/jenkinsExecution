package org.vitger.contacts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC002_verifyuserisabletocreatecampaignwithmandatoryfieldtest {
	@Test
	public void mavenDemo() throws InterruptedException {
		
		
		Reporter.log("*****************<<<<<<<<<<<<<+++++WELCOME TO MAVEN+++++++>>>>>>>>>>>>>*****************",true);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
	}

}
