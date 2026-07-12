package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage {
	
	
	@FindBy(xpath ="//img[@alt='Create Contact...']")
	private WebElement CreatContactButton;

	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement salutationtypeDropDown;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement FirstName;
	
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextFiled;
	
	
	
	
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailTextField;
	
	@FindBy(id = "mobile")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement ContactSaveButton;
	
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	private WebElement selectAllCheckBox;
	
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement Deletebutton;
	
	@FindBy(xpath="//span[@class='genHeaderSmall']")
	private WebElement ContactviewStatus;
	
	public WebElement getContactviewStatus() {
		return ContactviewStatus;
	}

	public WebElement getSalutationtypeDropDown() {
		return salutationtypeDropDown;
	}

	public WebElement getSelectAllCheckBox() {
		return selectAllCheckBox;
	}

	public WebElement getDeletebutton() {
		return Deletebutton;
	}

	public WebElement getContactSaveButton() {
		return ContactSaveButton;
	}

	public contactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreatContactButton() {
		return CreatContactButton;
	}


	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastNameTextFiled() {
		return lastNameTextFiled;
	}

	

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}
}
