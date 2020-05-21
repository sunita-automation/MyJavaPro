package com.firstlife.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager 
{
	
public static final Logger logger = Logger.getLogger(FirstLifeTestCaseHelper.class);
	
	
	static
	{
		PropertyConfigurator.configure("C:\\Users\\sanjoy\\Desktop\\Sanjoy\\projectAutomationFramework\\workspace\\AuFramework\\src\\main\\java\\log4j.properties");
	}
	private File currentFile;
private ExtentReports extent;

    public FirstLifePropertyReader propertyReader;
    
    public  ExtentReports createInstance(String fileName) 
    {
    	ExtentHtmlReporter htmlReporter;
    	propertyReader = new FirstLifePropertyReader();
    	/*
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-report/report.html");
        
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Automation Testing Report");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Captains Chair | Automation Testing");
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        extent.setSystemInfo("OS", ""+System.getProperty("os.name"));
        extent.setSystemInfo("Host Name", System.getProperty("os.name"));
        extent.setSystemInfo("Environment", "Dev");
        extent.setSystemInfo("User Name", "Sanjoy Santra");
        */
    	if (extent == null) {
            extent = new ExtentReports();
            
            Date date = new Date() ;
    		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss") ;
    		
    		File dir = new File("extent-report/"+dateFormat.format(date));
    		
    		dir.mkdirs();
    		String value = dateFormat.format(date);
    		//propertyReader.updateApplicationProperty("ReportFolder", value);
    		logger.debug("A new folder has been created with name of current date and time");
    		setCurrentFile(dir);
            //htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-report/report.html");
            htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-report/"+value+"/"+"report.html");
            logger.info("Creating report");
            System.out.println("Creating report");
            //path+"screenshots/"+propertyReader.readApplicationFile("ScreenShotFolder")+"/"+fileName+".png"
            htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
            htmlReporter.config().setChartVisibilityOnOpen(true);
            htmlReporter.config().setTheme(Theme.DARK);
            htmlReporter.config().setDocumentTitle("Automation Testing Report");
            htmlReporter.config().setEncoding("utf-8");
            htmlReporter.config().setReportName("Captains Chair | Automation Testing");
            extent.attachReporter(htmlReporter);
            
            extent.setSystemInfo("OS", ""+System.getProperty("os.name"));
            extent.setSystemInfo("Host Name", System.getProperty("os.name"));
            extent.setSystemInfo("Environment", "Dev");
            extent.setSystemInfo("User Name", "Sanjoy Santra");
        }
        else {
        	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-report/report.html");
        	htmlReporter.setAppendExisting(true);
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }
    
    public File getCurrentFile() 
	{
		return currentFile;
	}

	public void setCurrentFile(File currentFile) {
		this.currentFile = currentFile;
	}

}
