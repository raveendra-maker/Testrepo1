package excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelReading1 {

	public static void main(String[] args) {
		
	}
		/**
		 * Reading Excel - the step-by-step version
		 *
		 * The previous example (ReadExcel) did everything in one long chained
		 * statement. That works, but for beginners it can be confusing. This class
		 * shows exactly the same Excel reading process broken down into small,
		 * easy-to-read steps. Each line creates one object so you can clearly see
		 * what is happening at each layer.
		 *
		 * The 4-step flow to read any Excel cell
		 *   1. File - point to the physical .xlsx file on disk.
		 *   2. FileInputStream - open a stream so Java can read bytes from that
		 *      file.
		 *   3. XSSFWorkbook - hand the stream to Apache POI; it parses the bytes
		 *      and gives us an object that represents the whole workbook.
		 *   4. Drill down: Workbook -> Sheet -> Row -> Cell -> value.
		 *
		 * Extra concept in this example
		 * wb.getNumberOfSheets() tells us how many sheet tabs exist in the
		 * workbook. This is useful when you do not know in advance how many sheets
		 * your test data file contains and want to loop through all of them.
		 *
		 * Indexing reminder
		 * Excel shows rows starting at 1 (1, 2, 3 ...) and columns as letters
		 * (A, B, C ...). In code, both are zero-based:
		 *
		 *   Excel row 1  => getRow(0)
		 *   Excel row 2  => getRow(1)
		 *   Excel col A  => getCell(0)
		 *   Excel col C  => getCell(2)
		 *
		 * So sh1.getRow(1).getCell(2) reads the cell at Excel position
		 * Row 2, Column C.
		 */
		
			@Test
			public void readData() throws IOException
			{

				/*
				 *  Quick reference:
				 *  FileInputStream  - Load any file as input stream for reading
				 *  FileOutputStream - Save/Write any file as output stream for writing
				 *  XSSFWorkbook     - Work with the .xlsx file
				 *  XSSFSheet        - Work with a sheet inside the workbook
				 *  XSSFRow          - Work with a row inside a sheet
				 *  XSSFCell         - Work with a cell inside a row
				 */

				// Step 1: Build the path to the Excel file using the project folder.
				File src = new File(System.getProperty("user.dir") + "/TestData/TestData.xlsx");

				// Step 2: Open an input stream so we can read bytes from that file.
				FileInputStream fis = new FileInputStream(src);

				// Step 3: Let Apache POI parse those bytes into a Workbook object.
				XSSFWorkbook wb = new XSSFWorkbook(fis);

				// How many sheet tabs does this workbook have?
				// Helpful when we want to loop through every sheet.
				int numberOfSheets = wb.getNumberOfSheets();

				System.out.println(numberOfSheets);

				// Step 4a: Pick the sheet we are interested in (by its tab name).
				XSSFSheet sh1 = wb.getSheet("RegistrationData");

				// Step 4b: Pick the row. Index 1 = the SECOND row in Excel.
				XSSFRow row1 = sh1.getRow(1);

				// Step 4c: Pick the cell. Index 2 = column C in Excel.
				XSSFCell cell1 = row1.getCell(2);

				// Step 4d: Finally, read the value as text.
				String data = cell1.getStringCellValue();

				System.out.println(data);

			}


	}


