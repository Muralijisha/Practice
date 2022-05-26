package Read_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_file {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File("D:\\Automation\\Exercise\\Interview.xlsx"));  
		
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet sheet=wb.getSheetAt(0);  
			  
			FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
			for(Row row: sheet)     //iteration over row using for each loop  
			{  
			for(Cell cell: row)    //iteration over cell using for each loop  
			{  
			switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
			{  
			case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
			//getting the value of the cell as a number  
			System.out.print(cell.getNumericCellValue()+ "\t\t");   
			break;  
			case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
			//getting the value of the cell as a string  
			System.out.print(cell.getStringCellValue()+ "\t\t");  
			break;  
			}  
			}  
			System.out.println();  
			}
		}  

	}

}
