package apachePOI;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_04_ReadExcelDataFormula {

	public static void main(String[] args) throws Exception {
		String filepath="./datafiles/salary.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		for(int r=0;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.getCell(c);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
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
				System.out.print("  |  ");
			}
			System.out.println();
		}
	}

}
