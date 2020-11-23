package apachePOI;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_02_WriteExcelFile {
//	Workbook->Sheet->Rows->Cells
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp Info");
		Object empData[][] = { { "Empid", "Name", "Job" }, { 101, "David", "Engineer" }, { 102, "Miller", "Analyst" },
				{ 103, "Steve", "PO" }, { 104, "Smith", "Director" }, { 105, "Tyagi", "Manager" },
				{ 106, "Natraj", "Lead" }, { 107, "Morgan", "HR" } };
//		Using Normal for loop -> 8 rows and 3 columns
		/*
		 * int rows=empData.length; int cols=empData[0].length; //
		 * System.out.println(rows+" "+cols); for (int r = 0; r < rows; r++) { XSSFRow
		 * row = sheet.createRow(r); for (int c = 0; c < cols; c++) { XSSFCell cell =
		 * row.createCell(c); Object value = empData[r][c]; if(value instanceof String)
		 * cell.setCellValue((String)value); if(value instanceof Integer)
		 * cell.setCellValue((Integer)value); if(value instanceof Boolean)
		 * cell.setCellValue((Boolean)value); } }
		 */

//		Using for...each Loop
		int rowCount = 0;
		for (Object emp[] : empData) {
			XSSFRow row = sheet.createRow(rowCount++);
			int columnCount = 0;
			for (Object value : emp) {
				XSSFCell cell = row.createCell(columnCount++);
				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}
		Date date = new Date();
		String filepath = "./datafiles/" + date + "_employee.xlsx";
		FileOutputStream fos = new FileOutputStream(filepath);
		workbook.write(fos);
		fos.close();
		System.out.println("Employee File Written Successfully!");
	}

}
