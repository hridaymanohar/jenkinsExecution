package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	@FindBy(xpath ="//td[@onmouseout=\"fnHide_Event('allMenu');\"]")
	private WebElement MoreOptionLink;
	
	@FindBy(xpath ="//a[@name='Campaigns']")
	private WebElement Campaigne;
	
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administator;
	
	@FindBy(xpath ="//a[text()='Sign Out']")
	private WebElement signOut;
	

	//contact
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement ContactButtonLink;
	
	
	


	//initilization
	
	
	public  homePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	
	//getters
	
	public WebElement getContactButtonLink() {
		return ContactButtonLink;
	}


	public WebElement getAdministator() {
		return administator;
	}


	public WebElement getSignOut() {
		return signOut;
	}


	public WebElement getMoreOptionLink() {
		return MoreOptionLink;
	}

	

	public WebElement getCampaigne() {
		return Campaigne;
	}

}
