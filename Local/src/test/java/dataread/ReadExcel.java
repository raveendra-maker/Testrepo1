package dataread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		String excelFilePath=".\\Datafile\\country.xlsx";
		FileInputStream inputstream=new FileInputStream(excelFilePath);
		
		HSSFWorkbook workbook = new HSSFWorkbook(inputstream);
		
		HSSFSheet sheet= workbook.getSheetAt(0);//HSSFSheet sheet= workbook.getSheet(Sheet1)
		
		//using for loop
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows; r++) {
			HSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<cols;c++) {
				
				HSSFCell cell=row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
				}
				System.out.println(" | ");
			
			}
			System.out.println();
		}
		
	}

}
