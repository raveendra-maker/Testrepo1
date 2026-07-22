package day;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelByIterator {

	public static void main(String[] args) throws IOException {
		try {
		
		String filepath="\\Datafile\\country.xlsx";
		FileInputStream inputfile=new FileInputStream(filepath);
		
		HSSFWorkbook wb=new HSSFWorkbook(inputfile);
		HSSFSheet sheet=wb.getSheetAt(0);
		
		// Iterate through rows
		for(Row row: sheet) {
			for(Cell cell: row) {
				System.out.println(cell.toString() + "\t");
			}
			System.out.println();
			wb.close();
			inputfile.close();
		}
		
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
