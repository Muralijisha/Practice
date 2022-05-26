package Read_excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Maximum_salary {
	List<String> numbusarray = new ArrayList<String>();
	List<String> numcommutersarray = new ArrayList<String>();
	List<String> numcommercialarray = new ArrayList<String>();
	
	public void readExcel() //method to read       contents form excel
	{		
		String FilePath = "Bus1.xls";
	    Scanner sc = new Scanner(System.in);
	    int max=0;

	    FileInputStream fs = new FileInputStream(FilePath);
	    Workbook wb = Workbook.getWorkbook(fs);
	    Sheet sh = wb.getSheet("Bus1");// TO get the access to the sheet
	    int totalNoOfRows = sh.getRows();// To get the number of rows present in  sheet
	    int totalNoOfCols = sh.getColumns();// To get the number of columns present in sheet

	    //adding excel contents from every column to arraylist

	    for (int row = 1; row < totalNoOfRows; row++)
	    {
	        numcommutersarray.add(sh.getCell(3, row).getContents());
	    }

	    for (int row = 1; row < totalNoOfRows; row++)
	    {
	        numcommercialarray.add(sh.getCell(5, row).getContents());
	    }

	    for (int row = 1; row < totalNoOfRows; row++)
	    {
	        if(numbusarray.get(row)>=max);
	        max=numbusarray.get(row);

	    }
	    System.out.println(max);

	    Iterator itr=numbusarray.iterator(); //to print arraylist demo 
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }
	    }//end of method to read contents from excel

	    public static void main(String args[]) throws BiffException, IOException  //main class
	    {
	    	Maximum_salary DT = new Maximum_salary();
	        DT.readExcel();
	    }//end of main class

	}


