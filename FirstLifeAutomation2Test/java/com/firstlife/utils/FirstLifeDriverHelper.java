package com.firstlife.utils;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class FirstLifeDriverHelper 
{
	
public static final Logger logger = Logger.getLogger(FirstLifeDriverHelper.class);
	
	// Declaring objects for FirstLifeDriverHelper class
	protected static WebDriver driver;
	public FirstLifePropertyReader propertyReader;
	protected static WebDriverWait ajaxWait;
	private String time;
	private int TIME_OUT;
	private String pageLoadTime;
	private int PAGE_LOAD_TIME_OUT;
	protected Robot robot;

	// Initializing objects with in constructor
	public FirstLifeDriverHelper(WebDriver webdriver) {
		FirstLifeDriverHelper.driver = webdriver;
		propertyReader = new FirstLifePropertyReader();
		initializeTimeOutValues();
		ajaxWait = new WebDriverWait(driver, TIME_OUT);
		try {
			robot = new Robot();
		} catch (AWTException e) {
			Assert.fail("AWT Exception");
			e.printStackTrace();
		}
	}
	
	//this method will help to enter text in webElement
	

	// Handle locator type
	public static By byLocator(final String locator) {
		By result = null;

		if (locator.startsWith("//")) {
			result = By.xpath(locator);
		} else if (locator.startsWith("css=")) {
			result = By.cssSelector(locator.replace("css=", ""));
		} else if (locator.startsWith("#")) {
			result = By.name(locator.replace("#", ""));
		} else if (locator.startsWith("Link=")) {
			result = By.linkText(locator.replace("Link=", ""));
		} else if (locator.startsWith("xpath=")) {
			result = By.xpath(locator);
		}

		else if (locator.startsWith("(//")) {
			result = By.xpath(locator);
		} else {
			result = By.id(locator);
		}
		return result;
	}

	
	//Normal wait
	public void waitfor5sec() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	// Assert element present which will accept xpath as argument
	public static Boolean isElementPresent(final String locator) {
		Boolean result = false;
		try {
			driver.findElement(byLocator(locator));
			result = true;
		} catch (final Exception ex) {
		}
		return result;
	}
	
	// Assert element display which will accept web element as argument
	public Boolean isElementPresent(final WebElement ele)
	{
		Boolean result = false;
		try
		{
			ele.isDisplayed();
			result = true;
		} catch (final Exception ex)
		{
			
		}
		return result;
	}
	
	// This method will help to fetch title of a page
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void hitEnter() throws InterruptedException  
	{
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
	// This method will help to save something by key board action
	public void saveForm() throws InterruptedException, AWTException {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
	}

	// This method will help to wait for element present, it will take locator as argument
	public static void waitForElementPresent(final String locator, final int timeout) {
		ajaxWait.until(ExpectedConditions.presenceOfElementLocated(byLocator(locator)));
	}

	// This method will help to wait for element present, it will take web element as argument
	public static void waitForWebElementPresent(WebElement element, int timeout) {
		try{
			ajaxWait.until(ExpectedConditions.visibilityOf(element));
			
		}
		catch ( Error e) {
			Reporter.log("WebElement "+element+" is missing ");
			e.printStackTrace();
			throw e;
		} catch ( Exception e) {
			Reporter.log("WebElement "+element+" is missing ");
			e.printStackTrace();
			throw e;
		}
		
	}

	// This method will help to wait for element not present, it will take locator as argument
	public void waitForElementNotPresent(final String locator, final int timeout) 
	{
		ajaxWait.until(ExpectedConditions.invisibilityOfElementLocated(byLocator(locator)));
	}

	// This method will help to wait for element enable, it will take locator as argument
	public void waitForElementEnabled(final String locator, final int timeout) 
	{
		ajaxWait.until(ExpectedConditions.visibilityOfElementLocated(byLocator(locator)));
	}
	
	// This method will help to wait for element to be clickable, it will take web element as argument
		public void waitForElementToBeClickable(WebElement element, final int timeout) {
			ajaxWait.until(ExpectedConditions.elementToBeClickable(element));
		}

	// This method will help to wait for element present, it will take locator as argument
	public static void waitForElementVisible(final String locator, final int timeout) {
		for (int i = 0; i < timeout; i++) {
			if (isElementPresent(locator)) {
				if (driver.findElement(byLocator(locator)).isDisplayed()) {
					break;
				}
			}

			try {
				Thread.sleep(1000);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// This method will help to wait for element not present, it will take locator as argument
	public void waitForElementNotVisible(final String locator, final int timeout) 
	{
		for (int i = 0; i < timeout; i++) {
				if (!FirstLifeDriverHelper.isElementPresent(locator)) {
					break;
				}
			

			try {
				Thread.sleep(1000);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// This method will help to switch to frame by frame index
	public void switchFrameByFrameIndex(int index)
    {
        driver.switchTo().frame(index);
    }

	// This method will help to wait for text present with in a web element which will take locator as argument
	public void waitForTextPresent(String locator, String text, final int timeout, final String element) {
		waitForElementPresent(locator, timeout);
		ajaxWait.until(ExpectedConditions.textToBePresentInElementLocated((byLocator(locator)), text));
	}

	// This method will help to wait for alert present
	public void waitForAlert() 
	{
		ajaxWait.until(ExpectedConditions.alertIsPresent());
	}

	// Handle mouse over action
	public void mouseOver(final String locator, final int timeout) {
		waitForElementVisible(locator, timeout);
		waitForElementEnabled(locator, timeout);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));

		// build and perform the mouseOver with Advanced User Interactions API
		final Actions builder = new Actions(driver);
		builder.moveToElement(el).build().perform();
	}
	
	//Handle mouse over action which will accept web element as argument
	public void mouseOver(final WebElement ele, final int timeout) {
		waitForWebElementPresent(ele, getTimeOut());
		// build and perform the mouseOver with Advanced User Interactions API
		final Actions builder = new Actions(driver);
		builder.moveToElement(ele).build().perform();
	}


	// Handle mouse double click action
	public void mouseDoubleClick(final String locator, final int timeout) {
		waitForElementPresent(locator, timeout);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));
		waitForElementToBeClickable(el, timeout);

		// build and perform the mouse click with Advanced User Interactions API
		final Actions builder = new Actions(driver);
		builder.doubleClick(el).perform();
	}

	// Handle mouse click action by actions class
	public void mouseClick(final String locator, final int timeout) {
		waitForElementPresent(locator, timeout);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));

		// build and perform the mouse click with Advanced User Interactions API
		final Actions builder = new Actions(driver);
		builder.click(el).build().perform();
	}
	public void timeOutFor5Sec() throws Exception
	{
		Thread.sleep(5000);
	}

	// Handle drag and drop action
	public void dragAndDrop(final String draggable, final String to, final int timeout) {
		waitForElementPresent(draggable, timeout);
		waitForElementPresent(to, timeout);
		final WebElement elDraggable = driver.findElement(FirstLifeDriverHelper.byLocator(draggable));
		final WebElement todrag = driver.findElement(byLocator(to));

		// build and perform drag and drop with Advanced User Interactions API
		final Actions builder = new Actions(driver);
		builder.dragAndDrop(elDraggable, todrag).build().perform();
	}

	// This method will help to click on a web element
	public void clickOn(final String locator, final String element) {
		

		ajaxWait.until(ExpectedConditions.elementToBeClickable(byLocator(locator)));
		WebElement we = driver.findElement(byLocator(locator));

		try {
			new Actions(driver).moveToElement(we).perform();
			we.click();
		} catch (org.openqa.selenium.interactions.MoveTargetOutOfBoundsException e) {
			// Special case for partially visible elements
			_clickUsingJavaScript(we);
		}
	}

	// This method will help to enter text in a web element
	public void typeString(final String locator, final String text, final String element) {
		waitForElementVisible(locator, 30);
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));
		final Actions builder = new Actions(driver);
		el.clear();
		builder.sendKeys(el, text).perform();
		logger.debug("click On locator =" + locator + " for element " + element);

	}
	public void typeString(final WebElement ele, final String text) {
		waitForWebElementPresent(ele, getTimeOut());
		final Actions builder = new Actions(driver);
		ele.clear();
		builder.sendKeys(ele, text).perform();
	}

	// This method will help to enter path
	public void enterPath(String path) throws InterruptedException {

		final Actions builder = new Actions(driver);
		builder.sendKeys(path).perform();

	}

	// This method will help to click on a web element which will take locator as argument
	public void mouseClickByLocator(final String locator, final String element, final int timeout) {

		waitForElementVisible(locator, timeout);
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));
		final Actions builder = new Actions(driver);
		builder.moveToElement(el).click(el);
		builder.perform();
		logger.debug("click On locator =" + locator + " for element " + element);
	}

	// Select value from drop down by visible text which will take locator as argument
	public void selectDropDown(final String locator, final String targetValue, final String element, final int timeout) {
		waitForElementPresent(locator, timeout);
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		new Select(driver.findElement(byLocator(locator))).selectByVisibleText(targetValue);
		logger.debug("Select value=" + targetValue + " from drop down" + element);

	}

	// Select value from drop down by visible text which will take web element as argument
	public void selectDropDown(final WebElement el, final String targetValue, final int timeout) {

		waitForWebElementPresent(el, timeout);
		waitForElementToBeClickable(el, timeout);
		Assert.assertTrue(el.isDisplayed());
		Assert.assertTrue(el.isEnabled());
		new Select(el).selectByVisibleText(targetValue);
		logger.debug("Select value=" + targetValue + " from drop down");

	}
	
	// This method will help to drag and drop, which will take web elements as argument
	public void dragAndDrop(final WebElement fromEle, final WebElement toEle)
	{
		waitForWebElementPresent(fromEle, 20);
		waitForWebElementPresent(toEle, 20);
		Assert.assertTrue(fromEle.isDisplayed());
		Assert.assertTrue(toEle.isDisplayed());
		final Actions builder = new Actions(driver);
		builder.dragAndDrop(fromEle, toEle).build().perform();
		
	}
	
	// Select value from drop down by index which will take web element as argument
	public void selectDropDownByIndex(final WebElement ele, final int index)
	{
		waitForWebElementPresent(ele, getTimeOut());
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertTrue(ele.isEnabled());
		new Select(ele).selectByIndex(index);
	}

	// This method will help to verify text present or not
	public boolean isTextPresent(final String locator, final String str, final String element) {
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		final String message = driver.findElement(byLocator(locator)).getText();
		if (message.contains(str)) {
			logger.debug("Check " + message + " text present at locator " + locator + " for element " + element);
			return true;
		} else {
			return false;
		}

	}

	// This method will help to fetch text from a web element which will take locator as argument
	public String getText(final String locator, final String element) {
		waitForElementPresent(locator, getTimeOut());
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		final String text = driver.findElement(byLocator(locator)).getText();
		logger.debug("Get text from the locator " + locator + " from element " + element);
		return text;
	}
	
	// This method will help to fetch text from a web element which will take web element as argument
	public String getText(final WebElement ele, final String webelementdetails)
	{
		waitForWebElementPresent(ele, getTimeOut());
		Assert.assertTrue(isElementPresent(ele));
		final String text = ele.getText();
		logger.debug("Get text from element "+webelementdetails);
		return text;
	}

	// This method will help to assert if check box selected or not
	public boolean isChecked(final String locator, final String element) {
		boolean checkStatus = false;
		waitForElementPresent(locator, getTimeOut());
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));
		checkStatus = el.isSelected();
		logger.debug("Verfy " + locator + " is checked  for element " + element);
		return checkStatus;
	}

	// This method will help to fetch attribute from a web element which will take locator as argument
	public String getAttribute(final String locator, final String attribute, final String element) {
		waitForElementPresent(locator, getTimeOut());
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		final String text = driver.findElement(byLocator(locator)).getAttribute(attribute);
		logger.debug("Get attribute " + attribute + " from the locator " + locator + " from element " + element);
		return text;
	}

	// Execute java script
	public void javaScriptExecute(final String javascrpt) {
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(javascrpt);
	}

	// This method will help to accept alert
	public void acceptAlert(final int time) {
		this.selectAlertPresent(time);
	}

	// This method will help to get count of all web elements by a locator
	public int getTotalWebElement(final String locator) {
		waitForElementVisible(locator, PAGE_LOAD_TIME_OUT);
		Assert.assertTrue(isElementPresent(locator), "Element " + locator + " is not present");
		final int number = driver.findElements(byLocator(locator)).size();
		logger.debug("Count total numbers of Rows at locator " + locator);
		return number;
	}

	// Switch frame by locator of elements
	public static void switchFrame(final String[] arr) {
		driver.switchTo().defaultContent();
		for (final String element : arr) {
			waitForElementVisible(element, 5);
			driver.switchTo().frame(element);
			System.out.println("Selected Frame" + arr);
		}
	}

	// Select value from drop down by index which will accept locator as argument
	public void selectDropDownByIndex(final String locator, final int index, final String element) {
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found for element" + element);
		waitForElementPresent(locator, getTimeOut());
		new Select(driver.findElement(byLocator(locator))).selectByIndex(index);
		logger.debug("Select index=" + index + " from drop down" + element);
	}

	// This method will help to dismiss alert
	public void dismissAlert() {

		final Alert alert = driver.switchTo().alert();
		alert.dismiss();

		logger.debug("Cancel the Alert Pop up");
	}

	// This method will help to switch focus on parent window
	public String selectParentWindow() {
		final Set<String> str = driver.getWindowHandles();
		final Iterator<String> itr = str.iterator();
		final String parrentId = itr.next();
		final String popUpId = itr.next();
		driver.switchTo().window(popUpId);
		return parrentId;
	}
	
	// Switch focus to default frame
	public void switchToDefaultFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	// This method will help to close all window except parent window
	public void closerAllWindow()
	{
		String parent = driver.getWindowHandle();
		Set<String> popUp = driver.getWindowHandles();
		Iterator<String> it = popUp.iterator();
		while(it.hasNext())
		{
			String popUpWindow = it.next().toString();
			if(!popUpWindow.contains(parent))
			{
				driver.switchTo().window(popUpWindow);
				driver.close();
			}
		}
	}

	// This method will help to verify if alert present or not and move to alert
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			logger.debug("Check if alert present");
			return true;
		} catch (final NoAlertPresentException e) {
			return false;
		}
	}

	// This method will return current window id
	public String getCurrentWindowHandle() {
		final String winHandleBefore = driver.getWindowHandle();
		return winHandleBefore;

	}

	// This method will help to fetch current window url
	public String getNewWindowUrl() {
		_waitForJStoLoad();
		for (String newWinHandle : driver.getWindowHandles())
			driver.switchTo().window(newWinHandle);
		return driver.getCurrentUrl();
	}

	// This method will help to close new popup windows
	public void closeNewPopup(final String parentWindow) {
		for (final String winHandle : driver.getWindowHandles()) {
			if (!winHandle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(winHandle);
				driver.close();
			}
		}

	}

	// This method will help to switch focus to a window which will accept window id as argument
	public void setWindowHandle(final String winHandleBefore) 
	{
		driver.switchTo().window(winHandleBefore);
	}

	// Accept the alert if alert present
	public void selectAlertPresent(final int time) {

		for (int i = 0; i < time; i++) {
			if (isAlertPresent()) {
				final Alert alert = driver.switchTo().alert();
				alert.accept();

				break;

			}
			try {
				Thread.sleep(1000);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// Handle send keys action
	public void sendKeys(final String locator, final String text, final String element) {
		waitForElementPresent(locator, getTimeOut());
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found" + " Not found for element" + element);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));
		el.clear();
		el.sendKeys(text);
		logger.debug("Entered text: " + text + " at locator: " + locator + " for element " + element);

	}

	// This method will help to enter text with out removing existing text
	public void sendKeysWithoutRemovingPreviousText(final String locator, final String text, final String element) {
		waitForElementPresent(locator, getTimeOut());
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found" + " Not found for element" + element);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));
		el.sendKeys(text);
		logger.debug("Entered text: " + text + " at locator: " + locator + " for element " + element);
	}

	// This method will help to scroll window to a particular x,y coordinator
	public void scrollWindow(final int x, final int y) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(" + x + "," + y + ")");
		logger.debug("Scroll up the window");
	}

	// This method will help to scroll window to bottom of the page
	public void scrollWindowToBottomOfPage() {
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.clientHeight)");
		logger.debug("Scroll Down till bottom of the page");
	}

	// This method will help to scroll window to scroll height
	public void scrollWindowToBottomOfScrollHeight() {
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		logger.debug("Scroll Down till bottom of the page");
	}

	// This method will help to scroll window to top of the page
	public void scrollWindowToTopOfPage() {
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,0)");
		logger.debug("Scroll Up the page");
	}

	// This method will help to scroll window to a web element
	public void scrollWindowToElement(WebElement el) {
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", el);
		logger.debug("Scroll To Element");
	}

	// This method will help to verify if alert present or not
	public boolean verifyAlertPresent(final int time) {

		for (int i = 0; i < time; i++) {
			if (isAlertPresent()) {
				return true;
			}
		}
		return false;
	}

	public boolean isDialogPresent() {
		try {
			driver.getTitle();
			return true;
		} catch (final NoAlertPresentException e) {
			return false;
		}
	}

	// Mouse click by actions class
	public void mouseClickByWebElement(final WebElement ele) {
		final Actions builder = new Actions(driver);
		builder.moveToElement(ele).click(ele);
		builder.perform();
	}

	// ****************POM Framework Methods*************//
	public void initializeTimeOutValues() {
		time = propertyReader.readApplicationFile("Time_Out");
		TIME_OUT = Integer.parseInt(time);
		pageLoadTime = propertyReader.readApplicationFile("Page_Load_Time_Out");
		PAGE_LOAD_TIME_OUT = Integer.parseInt(pageLoadTime);
	}

	public int getTimeOut() {
		return TIME_OUT;
	}

	public int getPageLoadTimeOut() {
		return PAGE_LOAD_TIME_OUT;
	}

	public void selectFramePM() {
		switchFrame(new String[] { "content", "jspFrame", "content" });
	}

	public void selectJSPFrame() {
		driver.switchTo().defaultContent();
		switchFrame(new String[] { "jspFrame", "content" });
		logger.debug("Switching the frame");
	}

	// This method will help to clear a input box
	public void clear(final String locator, final String element) {
		waitForElementPresent(locator, getTimeOut());
		Assert.assertTrue(isElementPresent(locator),
				"Element Locator :" + locator + " Not found" + " Not found for element" + element);
		final WebElement el = driver.findElement(FirstLifeDriverHelper.byLocator(locator));
		el.clear();
		logger.debug("Cleared text:  at locator: " + locator + " for element " + element);
	}
	
	// This method will help to clear a input box
		public void clear(final WebElement ele, final String comment) 
		{
			waitForWebElementPresent(ele, getTimeOut());
			
			ele.clear();
			
		}

	// This method will open new window by keyword action
	public void openNewWindow() throws InterruptedException, AWTException {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
	}

	// This method will help to execute query
	public void runQuery() throws InterruptedException, AWTException {

		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_Q);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
	}

	// Get random integer
	public int getRandomInteger(final long aStart, final long aEnd) {
		final Random aRandom = new Random();
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		// get the range, casting to long to avoid overflow problems
		final long range = aEnd - aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		final long fraction = (long) (range * aRandom.nextDouble());
		final int randomNumber = (int) (fraction + aStart);
		return randomNumber;
	}

	// Get random string
	public String randomString(final int len) {
		final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final Random rnd = new Random();
		final StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		}
		return sb.toString();
	}

	
	private Object _executeJavaScript(String jsCode) {
		return ((JavascriptExecutor) FirstLifeDriverHelper.driver).executeScript(jsCode);
	}

	// wait for jQuery to load
	private final ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver theDriver) {
			try {
				return ((Long) FirstLifeDriverHelper.this._executeJavaScript("return jQuery.active") == 0);
			} catch (Exception e) {
				return true;
			}
		}
	};

	
	private final ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver theDriver) {
			Object rsltJs = FirstLifeDriverHelper.this._executeJavaScript("return document.readyState");
			if (rsltJs == null) {
				rsltJs = "";
			}
			return rsltJs.toString().equals("complete") || rsltJs.toString().equals("loaded");
		}
	};


	private WebDriverWait _getWebDriverWait(int timeoutInSeconds) {
		return new WebDriverWait(FirstLifeDriverHelper.driver, timeoutInSeconds);
	}

	public boolean _waitForJStoLoad() {

		WebDriverWait wait = this._getWebDriverWait(getTimeOut());
		boolean waitDone = wait.until(this.jQueryLoad) && wait.until(this.jsLoad);

		return waitDone;
	}
	/*
	public void _waitForPageLoad(WebDriver driver) 
	{
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>()
				{
			public Boolean apply(WebDriver driver)
			{
				return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("completed");
			}
			
				};
				Wait<WebDriver> wait = new WebDriverWait(driver, getTimeOut());
				try
				{
					wait.until(expectation);
				} catch (Throwable error)
				{
					Assert.assertFalse(false, "Timeout waiting for Page Load Request to complete.");
				}
				

	    
	}
	*/
	public void _waitForPageLoad()
	{
		new WebDriverWait(driver, getPageLoadTimeOut()).until(
		          webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

	}
	/*
	public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, getPageLoadTimeOut());
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
    */

	public void scrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(250,0)", "");
		System.out.println("scrolled up");
	}


	public void scrollWindowToLocator(String locator) {
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement el = driver.findElement(byLocator(locator));
		jse.executeScript("arguments[0].scrollIntoView(true);", el);
		logger.debug("Scroll To Element");
	}
	
	public void scrollToWebElement(WebElement element)
	{
		final JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	
	public void scrollToElementView(WebElement element) {
		Point point = element.getLocation();
		int yaxis = point.getY() - 150;
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + yaxis + ");");
	}


	public WebElement getElement(String locator) {
		return driver.findElement(byLocator(locator));
	}

	
	public List<WebElement> getElements(String locator) {
		return driver.findElements(byLocator(locator));
	}

	
	public void waitTillElementClickable(WebElement element) {
		ajaxWait.until(ExpectedConditions.elementToBeClickable(element));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitTillElementClickable(String locator) {
		WebElement el = driver.findElement(byLocator(locator));
		ajaxWait.until(ExpectedConditions.elementToBeClickable(el));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



	public void navigateBack() {
		driver.navigate().back();
		_waitForJStoLoad();
		System.out.println("Navigate Back.");
	}

	public void pressTab() throws InterruptedException, AWTException {

		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
	}
	
	

	public void pressEnter(String locator) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		WebElement el = driver.findElement(byLocator(locator));
		el.sendKeys(Keys.ENTER);

	}
	
	
	public String presenttDate() {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String currentDate = format.format(date);
		return currentDate;
	}



	// Click on a web element by java script executor
	public static void _clickUsingJavaScript(WebElement we) 
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", we);
	}


	public void pressKey(final Keys keyName) {
		// build and perform the keypress with Advanced User Interactions API
		final Actions builder = new Actions(driver);
		builder.keyDown(keyName);
	}

	
	public void releaseKey(final Keys keyName) {
		// build and perform the keypress with Advanced User Interactions API
		final Actions builder = new Actions(driver);
		builder.keyUp(keyName);
	}

	
	public void enterValueInFieldInput(WebElement fieldInput, String value) {
		_waitForJStoLoad();
		fieldInput.click();
		fieldInput.clear();
		fieldInput.sendKeys(value);
		fieldInput.sendKeys(Keys.ENTER);
	}


	public void waitForElementPresent(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	
	
	public void upload(String path) throws InterruptedException, AWTException {
		
		StringSelection stringSelection = new StringSelection(path);
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, stringSelection);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_C);
	    Thread.sleep(1000);
	    robot.keyRelease(KeyEvent.VK_C);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    Thread.sleep(1000);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
	}

	
	
	public void scrollToRightWindow(){
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(2000,0)", "");
		logger.debug("Scroll Down till bottom of the page");
	}
	public void scrollToLeftWindow(){
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(-2000,0)", "");
		logger.debug("Scroll Down till bottom of the page");
	}
	
	public void scrollToElementViewOnScreen(WebElement element) {
		Point point = element.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(" + xaxis + "," + yaxis + ");");
	}
	
	public void accept_Alert(){
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}
	
	public List<WebElement> allWebElement(String locator)
	{
		List<WebElement> allelement = driver.findElements(byLocator(locator));
		return allelement;
	}




}
