package com.firstlife.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.firstlife.pages.LoginPage;

public abstract class FirstLifeTestCaseHelper 
{
	public static final Logger logger = Logger.getLogger(FirstLifeTestCaseHelper.class);

	public static Object action;
	protected Robot robot;
	public String domain = "";

	// Initialize objects
	public FirstLifePropertyReader propertyReader = new FirstLifePropertyReader();
	protected String browser = propertyReader.readApplicationFile("BROWSER");
	// Define objects
	protected WebDriver driver;
	private Runtime runtime = Runtime.getRuntime();
	private static final long MEGABYTE = 1024L * 1024L;
	private FirefoxProfile profile;
	private String path = "";
	private HashMap<String, Object> chromePrefs;
	private ChromeOptions options;
	private String gickoPath;
	private File currentFile;
	public static ExtentHtmlReporter htmlRepoter;
	public static ExtentReports extent;
	public static ExtentTest repoterLog;

	@SuppressWarnings("deprecation")
	@BeforeClass(enabled=true)
	public void setUp() throws Exception {
		if (("firefox").equalsIgnoreCase(browser)) {
			FirefoxProfile firefoxProfile = new FirefoxProfile();
	        firefoxProfile.setPreference("browser.private.browsing.autostart",true);
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			capabilities.setCapability("browser.private.browsing.autostart", true);
			
			//capabilities.setCapability(CapabilityType.
			gickoPath = propertyReader.readApplicationFile("_gicko_path");
			System.setProperty("webdriver.gecko.driver", gickoPath);
			driver = new FirefoxDriver();
		} else if (("IE").equalsIgnoreCase(browser)) {
			String path = getPath();
			final File file = new File(path + "//drivers//IEDriverServer.exe");
			
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, false);
			capabilities.setCapability("EnableNativeEvents", false);
			driver = new InternetExplorerDriver(capabilities);
		} else if (("chrome").equalsIgnoreCase(browser)) {
//			final String path = getPath();
//			System.out.println("path::::::" + path);
		final File file = new File(path + "//drivers//chromedriver_1.exe");
			System.setProperty("webdriver.chrome.driver", "D://FirstlifeAutomationTest//drivers//chromedriver_1.exe");
			System.setProperty("webdriver.chrome.driver", "D://FirstlifeAutomationTest//drivers//chromedriver_1.exe");
//			@SuppressWarnings("static-access")
		final DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
		ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("useAutomationExtension", false);
//			options.addArguments("--disable-extensions");
//
//			options.addArguments("start-maximized");
//
//
	capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(ChromeOptions.CAPABILITY, setChromePreferenceForFileDownload());
			driver = new ChromeDriver(capabilities);
		} else if (("grid").equalsIgnoreCase(browser))
		{
			 /*
			    
			    File file = new File("C:\\Users\\Sanjoys\\Desktop\\FirstLife\\FirstLifeAutomation_gradle_workspace\\FirstlifeAutomationTest\\drivers\\chromedriver.exe");
			    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			    DesiredCapabilities capa =DesiredCapabilities.chrome();
			    capa.setBrowserName("chrome");
			    capa.setPlatform(Platform.WIN10);
			    driver=new RemoteWebDriver(new URL("http://172.16.24.196:5566/wd/hub"),capa);
			*/
			//File fireFoxfile = new File(propertyReader.readApplicationFile(""));
			//gickoPath = propertyReader.readApplicationFile("_gicko_path");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sanjoys\\Desktop\\FirstLife\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			//driver= new RemoteWebDriver(new URL("http://"+ip+":".concat(port).concat("/wd/hub")), capabilities);
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			/*
			FirefoxOptions firefoxOptions = new FirefoxOptions();

	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.merge(desiredCapabilities);
	        capabilities.setPlatform(Platform.WIN10);
	        capabilities.setBrowserName("firefox");
	        firefoxOptions.merge(capabilities);
	        */
			desiredCapabilities = DesiredCapabilities.firefox();
			desiredCapabilities.setBrowserName("firefox");
			desiredCapabilities.setVersion("65.0");
			desiredCapabilities.setPlatform(Platform.WINDOWS);
			desiredCapabilities.setCapability("marionette", true);
try
{
	driver = new RemoteWebDriver(new URL("http://172.16.25.60:5566/wd/hub"), desiredCapabilities);
} catch(MalformedURLException e)
{
	e.getStackTrace();
}
			
			
		}
		// Maximize window
		driver.manage().window().maximize();
		logger.debug("Maximizing window");

		// Delete cookies
		driver.manage().deleteAllCookies();
		logger.debug("Deleting all cookies");
		FirstLifePropertyReader.domainName = propertyReader.readApplicationFile("Server");
		logger.debug("Reading server name from application.properties file");
	}
	
	 @Parameters({"browser","port","ip"})
	    @BeforeClass(enabled=false)
	    public void initialize(String browser, String port, String ip) throws MalformedURLException
	 {
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 final File file = new File(path + "//drivers//chromedriver.exe");
			 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			    DesiredCapabilities capa =DesiredCapabilities.chrome();
			    capa.setBrowserName(browser);
			    capa.setPlatform(Platform.WIN10);
			    driver= new RemoteWebDriver(new URL("http://"+ip+":".concat(port).concat("/wd/hub")), capa);
		 } else if(browser.equalsIgnoreCase("firefox"))
		 {
			 //DesiredCapabilities capabilities = new DesiredCapabilities;
			 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				capabilities.setCapability("browser.private.browsing.autostart", true);
				capabilities.setBrowserName(browser);
				capabilities.setPlatform(Platform.WIN10);
				gickoPath = propertyReader.readApplicationFile("_gicko_path");
				System.setProperty("webdriver.gecko.driver", gickoPath);
				driver= new RemoteWebDriver(new URL("http://"+ip+":".concat(port).concat("/wd/hub")), capabilities);
		 }

			// Maximize window
			driver.manage().window().maximize();
			logger.debug("Maximizing window");

			// Delete cookies
			driver.manage().deleteAllCookies();
			logger.debug("Deleting all cookies");
			FirstLifePropertyReader.domainName = propertyReader.readApplicationFile("Server");
			logger.debug("Reading server name from application.properties file");
	    }

	/**
	 * Navigate to the application
	 * 
	 * @throws Exception
	 * 
	 */
	public LoginPage applicationSetup() throws Exception {
		driver.navigate().to(propertyReader.readApplicationFile(FirstLifePropertyReader.getDomain() + "_URL"));
		logger.debug("Navigating to URL");
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	

	@AfterClass(alwaysRun = true)
	public void tearDown() throws IOException {
		logger.debug("Execution completed for test\n");
		logger.debug("*****************************************************************************");
		logger.debug("Memory after execution (in MB) " + runtime.totalMemory() / MEGABYTE);

		// Run the garbage collector
		runtime.gc();
		logger.debug("Memory freed after execution (in MB) " + runtime.freeMemory() / MEGABYTE);

		// Calculate the used memory
		final long memory = runtime.totalMemory() - runtime.freeMemory();
		logger.debug("Used memory (in MB) " + memory / MEGABYTE);
		try {
			if (!(driver == null)) {
				driver.quit();
			}
		} catch (final Exception e) {
			
		}
		
		System.out.println("Aftet" + Runtime.getRuntime().freeMemory());
	}

	@AfterSuite(alwaysRun = true)
	public void afterMainMethod() throws IOException {

		
	}

	public void setWebDriver(WebDriver driver) {
		this.driver = driver;
	}

	// Handle child windows
	public String switchPreviewWindow() {
		final Set<String> windows = driver.getWindowHandles();
		final Iterator<String> iter = windows.iterator();
		final String parent = iter.next();

		driver.switchTo().window(iter.next());
		return parent;
	}

	// Get absolute path
	public String getPath() {
		String path = "";
		final File file = new File("");
		final String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");
		return path;
	}

	// Get absolute path
	public String getPathUpload() {
		String path = "";
		final File file = new File("");
		final String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("/", "//");
		return path;
	}

	// Capture Screenshot
	public void takeScreenShot(String fileName)
	{
		try
		{
			TakesScreenshot tss = (TakesScreenshot)driver;
			File source = tss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(getCurrentFile(), fileName+".png"));
		} catch(Exception e)
		{
			logger.debug("Exception while taking screenshot"+e.getMessage());
		}
	}
	
	// Creating file name
	public String getFileName(final String file) {
		final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat dateFormat1 = new SimpleDateFormat("hh-mm-ss");
		final Calendar cal = Calendar.getInstance();

		final String fileName = file + dateFormat.format(cal.getTime()) + "_" + dateFormat1.format(cal.getTime());

		return fileName;
	}

	// Switch frame
	public void switchFrame(final String[] arr) {
		for (final String element : arr) {
			driver.switchTo().frame(element);
		}
	}

	enum DriverType {
		Firefox, IE, Chrome
	}

	public void minimizeAllWindows() throws InterruptedException, AWTException {
		robot.keyPress(KeyEvent.VK_WINDOWS);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_D);
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(1000);

	}

	public void clearMemory() {
		// Get the Java runtime
		final int MAXJVMMemoryUsage = 50;
		logger.debug("Initial Memory consumed (in MB) "
				+ (runtime.totalMemory() - runtime.freeMemory()) / runtime.totalMemory() * 100);
		if ((runtime.totalMemory() - runtime.freeMemory()) / runtime.totalMemory() * 100 >= MAXJVMMemoryUsage) {
			runtime.gc();
			runtime.gc();
			logger.debug("Memory Cleared");
		}
	}



	public String getRandomNumber() {
		DateFormat format = new SimpleDateFormat("ddMMyyHHmmSS");
		Date date = new Date();
		String randomInteger = format.format(date);
		return randomInteger;
	}

	public void addLog(String message) {
		Reporter.log(message + "<br>");
	}


	public String randomString(int len) {
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}


	public FirefoxProfile setFirefoxPreferenceForFileDownload() {
		profile = new FirefoxProfile();
		path = propertyReader.readApplicationFile("File_Path");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", path);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"application/msword, application/csv, application/ris, text/csv, image/png, application/pdf, text/html, text/plain, application/zip, application/x-zip, application/x-zip-compressed, application/download, application/octet-stream");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.useDownloadDir", true);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.closeWhenDone", true);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);
		return profile;
	}


	public ChromeOptions setChromePreferenceForFileDownload() {
		path = propertyReader.readApplicationFile("File_Path");
		chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", path);
		options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		return options;
	}
	
	@BeforeSuite(alwaysRun = true)
	public void revCreateDirectory()  
	{
		
		
		
        //To create single directory/folder
       
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss") ;
		
		File dir = new File("screenshots/"+dateFormat.format(date));
		
		dir.mkdirs();
		logger.debug("A new folder has been created with name of current date and time");
		setCurrentFile(dir);
		
        
        }
	
	public File getCurrentFile() 
	{
		return currentFile;
	}

	public void setCurrentFile(File currentFile) {
		this.currentFile = currentFile;
	}

	
	@BeforeClass
	public void startReport()
	{
		htmlRepoter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/extentReport.html");
		extent.attachReporter(htmlRepoter);
		extent.setSystemInfo("OS", "Window 10");
		extent.setSystemInfo("Host Name:", "Sanjoy");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name:", "Sanjoy");
		
		htmlRepoter.config().setDocumentTitle("Automation Report For FirstLife");
		htmlRepoter.config().setReportName("My Own Report");
		htmlRepoter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlRepoter.config().setTheme(Theme.DARK);
	}
	
	@BeforeClass
	public static synchronized ExtentReports getExtent()
	{
		if(extent!=null)
		{
			return extent;
		}else
		{
			return extent = new ExtentReports();
		}
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			repoterLog.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case failed", ExtentColor.RED));
			repoterLog.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			repoterLog.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test case pass", ExtentColor.GREEN));
		}
		else
		{
			repoterLog.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test case skiped", ExtentColor.YELLOW));
			repoterLog.skip(result.getThrowable());
		}
		
	}
	
	@AfterClass
	public void flushToReport()
	{
		extent.flush();
		
	}


}
