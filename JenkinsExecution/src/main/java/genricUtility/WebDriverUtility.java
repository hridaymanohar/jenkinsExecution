package genricUtility;

import java.net.URI;
import java.sql.Driver;
import java.time.Duration;

import javax.swing.ActionMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	/**
	 * this method is use to maximize the window 
	 * @param driver
	 */
	public void toMaximize(WebDriver driver ) {
		
		driver.manage().window().maximize();
		
		
	}
	
	
	
	/**
	 * this method is use to wait the driver control
	 * @param driver
	 */
	public void toImplicitlyWait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	/**
	 * this method is use to scroll to the web element 
	 * @param driver
	 * @param element
	 */
	public void toScrollToElement(WebDriver driver , WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.scrollToElement(element).perform();
	}
	
	
	
	/**
	 * this method is use to scroll basic of x,y value 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void toScrollByAmount(WebDriver driver,int x,int y) {
		Actions ac = new Actions(driver);
		ac.scrollByAmount(x,y).perform();;
		
	}
	
	
	/**
	 * This method is use to 
	 * @param driver
	 * @param element
	 */
	public void toMoveByElement(WebDriver driver,WebElement element) {
		Actions ac= new Actions(driver);
		ac.moveToElement(element).perform();;
	}
	
	
	/**
	 * This method is use to move by offset
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void toMoveByOffSet(WebDriver driver,int x,int y) {
		Actions ac = new Actions(driver);
		ac.moveByOffset(x, y).perform();;
		
	}
	
	
	/**
	 *This method is use to select the web element by index 
	 *
	 * @param element
	 * @param index
	 */
	public void toSelectByIndex(WebElement element, int index) {
		Select sel = new Select(element)  ;
		sel.selectByIndex(index);
	}
	
	
	/**
	 * this method is use to select element by value
	 * @param element
	 * @param string
	 */
	public void toSelectBtValue(WebElement element,String string) {
		Select sel = new Select(element);
		sel.selectByValue(string);
	}
	
	
	/**
	 * This method is use to perform select by visible text.
	 * @param element
	 * @param string
	 */
	public void toSelectByVisibleText(WebElement element,String string) {
		Select sel = new Select(element);
		sel.selectByVisibleText(string);
	}
	
	
	/**
	 * This method is use to perform explicitly wait
	 * @param driver
	 * @param element
	 */
	public void toWaitUntilElementToBeClickable(WebDriver driver,WebElement element) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	/**
	 * This method is use to navigate to the URL
	 * @param driver
	 * @param url
	 */
	public void toGetURL(WebDriver driver,String url) {
		driver.get(url);
		
	}
	/**
	 *  This method is use to get current session URL.
	 * @param driver
	 */
	public void toGetCurrentURL(WebDriver driver) {
		driver.getCurrentUrl();
	}
	/**
	 *  This method is use to capture page source code.
	 * @param driver
	 */
	public void toGetPageSource(WebDriver driver) {
		driver.getPageSource();
	}
	/**
	 *  This method is use to capture Title of the session
	 * @param driver
	 */
	public void toGetTitle(WebDriver driver) {
		driver.getTitle();
	}
	/**
	 *  This method is use to close the current session
	 * @param driver
	 */
	public void close(WebDriver driver) {
		driver.close();
	}
	/**
	 *  This method is use to close all the sessions and terminate the server connection.
	 * @param driver
	 */
	public void quit(WebDriver driver) {
		driver.quit();
	}
	/**
	 *  This method is use to minimize the browser
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 *  This method is use to full Screen the browser.
	 * @param driver
	 */
	public void fulScreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	/**
	 *  This method is use to capture the size of Browser.
	 * @param driver
	 */
	public void getSize(WebDriver driver) {
		driver.manage().window().getSize();
	}
	/**
	 *  This method is use to capture the position
	 * @param driver
	 */
	public void getPosition(WebDriver driver) {
		driver.manage().window().getPosition();
	}
	/**
	 *  This method is use to set the width and height of the web page
	 * @param driver
	 * @param w
	 * @param h
	 */
	public void setSize(WebDriver driver,int w,int h) {
		driver.manage().window().setSize(new Dimension(w, h));
	}
	/**
	 *  This method is use to perform back operation
	 * @param driver
	 */
	public void back(WebDriver driver) {
		driver.navigate().back();
	}
	/**
	 *  This method is use to perform forward operation
	 * @param driver
	 */
	public void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	/**
	 *  This method is use to perform Refresh
	 * @param driver
	 */
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	/**
	 * this method is use to 
	 * @param driver
	 * @param string
	 */
	public void to(WebDriver driver,String string) {
		driver.navigate().to(string);
	}
	

	
	
	
	/**
	 * This method is use to get windowHandle
	 * @param driver
	 */
	public void toGetWindowHandle(WebDriver driver) {
		driver.getWindowHandle();
	}
	/**
	 * this method is use to get WindowHandles
	 * @param driver
	 */
	public void toGetWindowhandels(WebDriver driver) {
		driver.getWindowHandles();
	}
	/**
	 * This method is use to perform SwitchTo (Accept) alert
	 * @param driver
	 */
	public void switchTo(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * This method is use to perform SwitchTo (dismiss) alert
	 * @param driver
	 */
	public void switchToDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method is use to perform SwitchTo alert (string argument)
	 * @param driver
	 * @param string
	 */
	public void switchToSendKey(WebDriver driver,String string) {
		driver.switchTo().alert().sendKeys(string);
	}
	/**
	 * This method is use to perform Switchto alert (get text).
	 * @param driver
	 */
	public void switchToGetText(WebDriver driver) {
		driver.switchTo().alert().getText();
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void SwitchToFrameStr(WebDriver driver,String str) {
		driver.switchTo().frame(str);
	}
	public void SwitchToFrameElement(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
		
	}
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void switchToWindow(WebDriver driver,String str) {
		driver.switchTo().window(str);
		
	}
	
	
	/**
	 * This method is use to select by Index
	 * @param driver
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebDriver driver,WebElement element,int index) {
		Select sc= new Select(element);
		sc.selectByIndex(index);
	}
	/**
	 * This method is use to select by visible Text.
	 * @param element
	 * @param str
	 */
	public void selectByVisibleText(WebElement element,String str) {
		Select sc=new Select(element);
		sc.selectByContainsVisibleText(str);
	}
	/**
	 * This method is to select by value
	 * @param element
	 * @param str
	 */
	public void selectByValue(WebElement element,String str) {
		Select sc=new Select(element);
		sc.selectByContainsVisibleText(str);
	
}
	/**
	 * This method is use to deselectAll 
	 * @param element
	 */
	public void toDeselectAll(WebElement element) {
		Select sc= new Select(element);
		sc.deselectAll();
	}
	
	public void toGetFirstSelectedOption(WebElement element ) {
		Select sc = new Select(element);
		sc.getFirstSelectedOption();
	}
	public void toGetAllselectedOption(WebElement element) {
		Select sc = new Select(element);
		sc.getAllSelectedOptions();
		
	}
	public void toGetOption(WebElement element) {
		Select sc = new Select(element);
		sc.getOptions();
	}
	public void isMultiple(WebElement element) {
		Select sc = new Select(element);
		sc.isMultiple();
	}
	 public void toContextClick(WebDriver driver) {
		 Actions act =new Actions(driver);
		 act.contextClick().perform();
		 
	 }
	 public void toContextClick(WebDriver driver,WebElement element) {
		 Actions act =new Actions(driver);
		 act.contextClick(element).perform();
		 
	 }
	 public void toClickAndHold(WebDriver driver) {
		 Actions act = new Actions(driver);
		 act.clickAndHold().perform();
	 }
	 
	 public void toClickAndHold(WebDriver driver,WebElement element) {
		 Actions act = new Actions(driver);
		 act.clickAndHold(element).perform();
		 
	 }
	 public void release(WebDriver driver) {
		 Actions act = new Actions(driver);
		 act.release().perform();
	 }
	 public void release(WebDriver driver,WebElement element) {
		 Actions act = new Actions(driver);
		 act.release(element).perform();
	 }
	 public void doubleClick(WebDriver driver) {
		 Actions act = new Actions(driver);
		 act.doubleClick().perform();
	 }
	 public void doubleClick(WebDriver driver,WebElement element) {
		 Actions act = new Actions(driver);
		 act.doubleClick(element).perform();
	 }
	 public void dragAndDrop(WebDriver driver,WebElement element) {
		 Actions act = new Actions(driver);
		 act.dragAndDrop(element,null).perform();
	 }
	 
	 public void dragAndDrop(WebDriver driver,WebElement element,WebElement element1) {
		 Actions act = new Actions(driver);
		 act.dragAndDrop(element, element1).perform();
	 }
	 public void dragAndDropByXY(WebDriver driver,WebElement element,int x ,int y) {
		 Actions act = new Actions(driver);
		 act.dragAndDropBy(element, x, y).perform();
	 }
	 public void moveToElement(WebDriver driver,WebElement element) {
		 Actions act =new Actions(driver);
		 act.moveToElement(element).perform();;
	 }
	 public void moveByOffSet(WebDriver driver,int x,int y) {
		 Actions act = new Actions(driver);
		 act.moveByOffset(x, y).perform();;
		 
	 }
	 public void scrollToElement(WebDriver driver ,WebElement element) {
		 Actions act = new Actions(driver);
		 act.scrollToElement(element).perform();;
	 }
	 public void scrollByAmount(WebDriver driver,int x, int y) {
		 Actions act = new Actions(driver);
		 act.scrollByAmount(x,y).perform();
	 }
	 
	 
	 
	 
	 
	 
	 /**
	  * This method is to Execute java Script
	  * @param driver
	  * @param string
	  */
	 public void executeScript(WebDriver driver, String string) {
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript(string);
	 }
	 public void executeScript(WebDriver driver, String string,WebElement element) {
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript(string,element);
	 
	 
}
	 
	 
	 /**
	  * This method is use to handle javaScript popup (Accept)
	  * @param driver
	  */
	 public void JavaScriptPopUp_Accept(WebDriver driver) {
	 Alert jspopUp = driver.switchTo().alert();
	 jspopUp.accept();
	 
	 }
}
