package com.firstlife.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstLifePropertyReader 
{
	
	HSSFCell Cell;
	HSSFCell cell1;
	String path = getFilePath();
    public static String domainName; 

    public String readApplicationFile(String key) {
        String value = "";
        try {
            final Properties prop = new Properties();
            final File f = new File(path + "//propertyFile"
                    + "//application.properties");

            if (f.exists()) {
                prop.load(new FileInputStream(f));
                value = prop.getProperty(key);
            }
        } catch (final Exception e) {
            System.out
                    .println("Failed to read from application.properties file.");
        }
        return value;
    }
    
    @SuppressWarnings("deprecation")
	public String getCellData(int sheetIndex, int RowNo, int ColNo) throws Exception
    {
    	final File f = new File(path + "//propertyFile"
                + "//Test Data_ALL Party Role_Creation.xls");
    	FileInputStream fis = new FileInputStream(f);
		//Here we are creating an object of XSSFWorkbook class supported by apache poi.
		@SuppressWarnings("resource")
		HSSFWorkbook workBook = new HSSFWorkbook(fis);
		//Here we are taking sheet which is in index 0.
		HSSFSheet Arco_Smoke_TestData_St = workBook.getSheetAt(sheetIndex);
		
		//Here we are assigning data to variable Cell.
		Cell = Arco_Smoke_TestData_St.getRow(RowNo).getCell(ColNo);
		//Here we are getting data from the Cell.
		
		String CellData=null;
		if(Cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC) {
		    CellData = NumberToTextConverter.toText(Cell.getNumericCellValue());
		}
		else
		{
			CellData = Cell.getStringCellValue();
			
		}
		//Here we are returning cell value for further use.
		return CellData;
    }
    
    @SuppressWarnings("deprecation")
   	public String getCellData1(int RNo, int CNo) throws Exception
       {
       	final File f = new File(path + "//propertyFile"
                   + "//Test Data_ALL Party Role_Creation_n.xls");
       	FileInputStream fis = new FileInputStream(f);
   		//Here we are creating an object of XSSFWorkbook class supported by apache poi.
   		@SuppressWarnings("resource")
   		HSSFWorkbook workBook = new HSSFWorkbook(fis);
   		//Here we are taking sheet which is in index 0.
   		HSSFSheet Arco_Smoke_TestData_St = workBook.getSheetAt(0);
   		
   		//Here we are assigning data to variable Cell.
   		cell1 = Arco_Smoke_TestData_St.getRow(RNo).getCell(CNo);
   		//Here we are getting data from the Cell.
   		
   		String CellData=null;
   		if(cell1.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC) {
   		    CellData = NumberToTextConverter.toText(cell1.getNumericCellValue());
   		}
   		else
   		{
   			CellData = cell1.getStringCellValue();
   			
   		}
   		//Here we are returning cell value for further use.
   		return CellData;
       }


    public  static String getDomain() throws Exception{
    	if (domainName.isEmpty()|| domainName==null){
    		throw new Exception("Please specify domain name");
    	}
    	return domainName;
    }
    public String readTestData(final String key) {
        String value = "";
        try {
            final Properties prop = new Properties();
            final File f = new File(path + "//propertyFile"
                    + "//testData.properties");
            if (f.exists()) {
                prop.load(new FileInputStream(f));
                value = prop.getProperty(key);
            }
        } catch (final Exception e) {
            System.out
                    .println("Failed to read from application.properties file.");
        }
        return value;
    }

    public String getFilePath() {
        String filepath = "";
        final File file = new File("");
        final String absolutePathOfFirstFile = file.getAbsolutePath();
        filepath = absolutePathOfFirstFile.replaceAll("\\\\+", "/");

        return filepath;
    }

    public void updateProperty(final String key, final String value) {
        final Properties props = new Properties();
        final String propsFileName = path + "//propertyFile"
                + "//testData.properties";
        try {
            // first load old property file:
            final FileInputStream configStream = new FileInputStream(
                    propsFileName);
            props.load(configStream);
            configStream.close();

            // modifies new property
            props.setProperty(key, value);

            // save modified property file
            final FileOutputStream output = new FileOutputStream(propsFileName);
            props.store(output, "");
            output.close();

        } catch (final IOException ex) {
            System.out.println(ex);
        }
    }





}
