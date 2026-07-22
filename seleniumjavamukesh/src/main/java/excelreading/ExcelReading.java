package excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		/**
		 * Reading data from an Excel file (.xlsx) using Apache POI
		 *
		 * In real-world automation projects, test data (like usernames, emails,
		 * passwords) is usually kept in an Excel sheet and not hard-coded inside
		 * the code. This makes it easy to add or change data without touching
		 * the program. To read Excel files in Java, we use a popular library
		 * called Apache POI.
		 *
		 * Important POI classes used here
		 *   - FileInputStream - opens any file so Java can read its bytes. Think
		 *     of it as a "pipe" from the file to your program.
		 *   - XSSFWorkbook - represents the whole Excel file (the .xlsx workbook).
		 *     "XSSF" is the POI module that handles the modern .xlsx format. (For
		 *     old .xls files, the class is HSSFWorkbook.)
		 *   - XSSFSheet - represents one tab/sheet inside the workbook (for
		 *     example, "RegistrationData").
		 *   - XSSFRow - represents a single row of that sheet (indexes start at 0,
		 *     so row 1 in Excel = row 0 in code).
		 *   - XSSFCell - represents a single cell inside the row (columns also
		 *     start at 0; column A = 0, B = 1, C = 2 ...).
		 *
		 * The mental model
		 *
		 *   Workbook  ->  Sheet  ->  Row  ->  Cell  ->  value
		 *
		 * We always navigate in that order: open the workbook, pick a sheet, pick a
		 * row, pick a cell, then read its value.
		 *
		 * Why @Test from TestNG?
		 * Marking the method with @Test tells TestNG that this method is a test
		 * case and should be executed when we run it as a TestNG test. We could
		 * also have written this in a normal main method - the Excel reading logic
		 * would stay exactly the same.
		 *
		 * Why throws IOException?
		 * Anything that touches the file system (open, read, write) can fail - the
		 * file may not exist, may be locked, etc. Java forces us to either handle
		 * such errors with try/catch or declare them with throws.
		 */

		
		//Fileinputstream -  load any file as input stream for reading;
		//FileoutputStream - save/write any file as outputstream for wringin.
		//XSSFWorkbook - work with file
		//XSSFSheet -  work with sheet
		//XSSFRow - work with ros
		//XSSFCell -  work with cell
		/*
		File src=new File(System.getProperty("user.dir")+"/TestData/Data.xlsx");
		InPutStream fs=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Registration");
		XSSFRow row1=sheet.getRow(0);
		XSSFCell column=row1.getCell(2);
		String data=column.getStringCellValue();
		System.out.println(data);
		*/
		
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/Data.xlsx")));
		/*
		String name= wb.getSheet("Registration").getRow(0).getCell(0).getStringCellValue();
		String email=wb.getSheet("Registration").getRow(0).getCell(1).getStringCellValue();
		String category=wb.getSheet("Registration").getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(category);
		*/
		
		XSSFSheet sheet=wb.getSheet("Registration");
		int row=sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows:" +row);
		
	    int column=sheet.getRow(0).getPhysicalNumberOfCells();
	    System.out.println("Number of Columns:"+column);
	    
	    for(int i=0; i<row; i++) {
	    	for (int j=0;j<column; j++) {
	    		String data=sheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.println(data);
	    	}
	    	System.out.println("***********************************");
	    }
		
		}

		}
