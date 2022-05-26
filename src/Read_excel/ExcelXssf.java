package Read_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelXssf {

	
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		InputStream inp = new FileInputStream("D:\\Automation\\Exercise\\Practice.xlsx");
        int rownumber = 0;
		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheetAt(0);
		Row row = null;
		Cell cell = null;
		boolean isNull = false;
		do{
			try{
				row = sheet.getRow(rownumber);
				cell = row.getCell(0);
				System.out.print(cell.toString() +"\t\t");
				cell = row.getCell(1);
				System.out.println(cell.toString());
				rownumber++;
			} catch(Exception e) {
				isNull = true;
			}

		}while(isNull!=true);
		inp.close();

	}
}
