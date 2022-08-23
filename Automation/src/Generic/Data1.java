package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Data1 {
public static String fetch_data(String s,int r,int c)
{
	String value=" ";
	try {
		FileInputStream fis = new FileInputStream ("./Excel/Data1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
	book.getSheet(s).getRow(r).getCell(c).toString();
	}
	 catch(Exception e) {
		 System.out.println("File not found");
	 }
	return value;
	   
}
}
	
		
		

