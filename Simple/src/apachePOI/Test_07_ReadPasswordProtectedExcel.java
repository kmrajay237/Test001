package apachePOI;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_07_ReadPasswordProtectedExcel {

	public static void main(String[] args) throws Exception{
		String filepath="./datafiles/Customer.xlsx";
		FileInputStream fis =new FileInputStream(filepath);
		String password="Zxcv@1234";
//		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fis, password);
		XSSFSheet sheet = workbook.getSheet("Cus Details");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		int columns=sheet.getRow(0).getLastCellNum();
		System.out.println(columns);
//		Read data from sheet using for loop
		/*
		 * for(int r=0;r<=rows;r++) { XSSFRow row = sheet.getRow(r); for(int
		 * c=0;c<columns;c++) { XSSFCell cell = row.getCell(c); switch
		 * (cell.getCellType()) { case NUMERIC:
		 * System.out.print(cell.getNumericCellValue()); break;
		 * 
		 * case STRING: System.out.print(cell.getStringCellValue()); break;
		 * 
		 * case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
		 * 
		 * default: break; } System.out.print(" - *|* -"); } System.out.println(); }
		 */
		
//		Read Data using Iterator
		Iterator<Row> iterator = sheet.iterator();
		while(iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
					
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
					
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
					
				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;

				default:
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}

}
