package apachePOI;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_08_FormattingCellColour {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Fill Colour");
		XSSFRow row = sheet.createRow(6);
		
//		Setting Background Colour
		XSSFCellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		
		XSSFCell cell = row.createCell(6);
		cell.setCellValue("Welcome to Java");
		cell.setCellStyle(style);
		
//		Setting ForeGround Colour
		style=workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell = row.createCell(7);
		cell.setCellValue("Automation With Selenium");
		cell.setCellStyle(style);
		
		Date date=new Date();
		String filepath="./datafiles/"+date+"ColursFormating.xlsx";
		FileOutputStream fos=new FileOutputStream(filepath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("Done");
	}

}
