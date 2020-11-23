package apachePOI;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_05_CreateAndWriteFormula1 {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Numbers");
		XSSFRow row = sheet.createRow(0);
		
		row.createCell(0).setCellValue(10);
		row.createCell(1).setCellValue(20);
		row.createCell(2).setCellValue(30);
		
		row.createCell(3).setCellFormula("A1*B1*C1");
		
		Date date = new Date();
		String filepath = "./datafiles/" + date + "_Formula.xlsx";
		FileOutputStream fos = new FileOutputStream(filepath);
		workbook.write(fos);
		fos.close();
		System.out.println("Formula File Written Successfully!");
	}

}
