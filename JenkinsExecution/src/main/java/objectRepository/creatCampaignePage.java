package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatCampaignePage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement creatCampaigneButton;
	
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement CampaigneNameTextField;
	
	@FindBy(xpath="//input[@name='closingdate']")
	private WebElement ExpectedLastDate;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	@FindBy(id = "dtlview_Campaign Name")
	private WebElement CampaigneNameView;
	
	//delete operation
	
	@FindBy(xpath= "//input[@id='selectCurrentPageRec']")
	private WebElement DelectAllCheckBox;
	
	
	@FindBy(xpath =" //input[@class='crmbutton small delete']")
	private WebElement DelectButton;
	
	@FindBy(xpath="//span[normalize-space(text())='No Campaign Found !']")
	private WebElement viewDelectStatus;
	
	
	
	//initiLIZATION
	
	public WebElement getDelectAllCheckBox() {
		return DelectAllCheckBox;
	}


	public WebElement getDelectButton() {
		return DelectButton;
	}


	public WebElement getViewDelectStatus() {
		return viewDelectStatus;
	}


	public WebElement getCampaigneNameView() {
		return CampaigneNameView;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}


	public WebElement getCampaigneNameTextField() {
		return CampaigneNameTextField;
	}


	public WebElement getExpectedLastDate() {
		return ExpectedLastDate;
	}


	public creatCampaignePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreatCampaigneButton() {
		return creatCampaigneButton;
	}



}
