import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	@SuppressWarnings("deprecation")
	public ArrayList<String> addData(String testCaseName) throws IOException {
	ArrayList<String> data=new ArrayList<String>();
		
		//XSSFWorkbook is a class to access the worksheet of excel sheets
		// XSSFWorkbok accepts filenputstream arguments to pass the location of your excel sheet
		//FileInputSteam is a class used to get the files from our computer
		//By ceating its object it will read the file
		//This input object can pass to the XSSFWorkbook object to access the excel sheet data.
		
		FileInputStream input = new FileInputStream("C://Users//User//Desktop//excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		 int sheets = workbook.getNumberOfSheets();//give the count of sheets in that document.
		 for (int i=0;i<sheets;i++) {
			 if(workbook.getSheetName(i).equalsIgnoreCase("DataSheet"))
			{
				 XSSFSheet sheet= workbook.getSheetAt(i);//method getSheet has a return type of XSSFSheet
		         //After you get the sheet from where you want to drive data
             	//look for desired column
				 Iterator<Row> rows = sheet.iterator();//collections of rows
				Row firstRow = rows.next();
				
				Iterator<Cell> cell=firstRow.cellIterator();//collection of cells
				int k=0;
				int column = 0;
				while(cell.hasNext()) {
			     Cell value = cell.next();
			     if( value.getStringCellValue().equalsIgnoreCase("TestCases"))
                {
			    	 column = k; 
			
			    }
			     k++;

	}
				System.out.println(column);
				while(rows.hasNext()) {
					Row r =rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cellData = r.cellIterator();
						while(cellData.hasNext()) {
							
							//System.out.println(cellData.next().getStringCellValue());
							Cell cellValue=cellData.next();
							if(cellValue.getCellTypeEnum()==CellType.STRING) {
							data.add(cellValue.getStringCellValue());
						}
							else {
								data.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
							}
					}
				}
				

}
}
		 
		 }
		return data;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	}
}