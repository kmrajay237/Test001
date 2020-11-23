package apachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_06_ApplyExcelFormula {

	public static void main(String[] args) throws Exception {
		String filepath="./datafiles/book.xlsx";
		FileInputStream fis =new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		sheet.getRow(8).getCell(2).setCellFormula("SUM(C2:C7)");
		fis.close();
		
		FileOutputStream fos=new FileOutputStream(filepath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("Done");
	}

}
