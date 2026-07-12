package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(xpath = "//input[@type='text']")
	private WebElement EmailTextField;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PassWord;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement Loginicone;
	
	// initialization
	
	
	public WebElement getLoginicone() {
		return Loginicone;
	}


	public void setLoginicone(WebElement loginicone) {
		Loginicone = loginicone;
	}


	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmailTextField() {
		return EmailTextField;
	}



	public WebElement getPassWord() {
		return PassWord;
	}


	public void setPassWord(WebElement passWord) {
		PassWord = passWord;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}


	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}


}
