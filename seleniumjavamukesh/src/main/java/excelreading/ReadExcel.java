package excelreading;

import org.testng.annotations.Test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	
	
		/**
		 * Reading the WHOLE Excel sheet using a nested loop
		 *
		 * The earlier examples read only a fixed cell (like row 0, column 0). But
		 * in real testing scenarios, you usually do not know in advance how many
		 * rows or columns the sheet has - the tester may keep adding more data.
		 * This class shows the standard pattern to read every cell in a sheet
		 * using a nested for loop.
		 *
		 * Two new useful methods
		 *   - sheet.getPhysicalNumberOfRows() - returns the total count of rows
		 *     that actually contain data. If the sheet has 5 rows filled with
		 *     data, this returns 5.
		 *   - row.getPhysicalNumberOfCells() - returns the total number of filled
		 *     cells in that particular row. Usually we call it on the header row
		 *     (row 0) to find out how many columns the sheet has.
		 *
		 * The nested loop pattern
		 *
		 *   for (each row i from 0 to rows-1) {
		 *       for (each column j from 0 to columns-1) {
		 *           read cell at (i, j)
		 *       }
		 *   }
		 *
		 * The outer loop moves vertically (row by row) and the inner loop moves
		 * horizontally (column by column inside that row). This is the same
		 * pattern you would use to print a 2-D matrix or table.
		 *
		 * Things to be careful about
		 *   - If a cell is empty, getCell(j) can return null and calling
		 *     .getStringCellValue() on null will throw NullPointerException. In
		 *     real projects we usually add a null check.
		 *   - If a cell contains a number or a date instead of text,
		 *     getStringCellValue() will throw an exception. To handle mixed data
		 *     types, we use cell.getCellType() and pick the right getter
		 *     (string / numeric / boolean).
		 */
		
			@Test
			public void readData() throws IOException
			{

				// Open the workbook (one-liner version, same as ReadExcel.java).
				XSSFWorkbook wb = new XSSFWorkbook(
						new FileInputStream(new File(System.getProperty("user.dir") + "/TestData/TestData.xlsx")));

				// Get the sheet we want to read.
				XSSFSheet sh1 = wb.getSheet("RegistrationData");

				// Total number of rows that have data.
				int rows = sh1.getPhysicalNumberOfRows();

				System.out.println("Total Number of rows " + rows);

				// Number of columns is taken from the first row (header row, index 0).
				// We assume every row has the same number of columns.
				int columns = sh1.getRow(0).getPhysicalNumberOfCells();

				System.out.println("Total Number of Columns " + columns);

				// Outer loop -> moves through each ROW.
				for (int i = 0; i < rows; i++)
				{

					// Inner loop -> moves through each COLUMN of the current row.
					for (int j = 0; j < columns; j++)
					{

						// Read the cell value as text and print it.
						String data = sh1.getRow(i).getCell(j).getStringCellValue();

						System.out.println(data);
					}

					// Print a separator line after each row to make the output
					// easier to read in the console.
					System.out.println("****************************");
				}

			}


		}


	


