package apachePOI;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_03_WriteExcelFile2 {

	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp Info");
		ArrayList<Object[]> empData = new ArrayList<Object[]>();
		
		empData.add(new Object[] {"Empid", "Name", "Job"});
		empData.add(new Object[] {101, "David", "Engineer"});
		empData.add(new Object[] {102, "Miller", "Analyst"});
		empData.add(new Object[] {103, "Steve", "PO"});
		empData.add(new Object[] {104, "Smith", "Director"});
		empData.add(new Object[] {105, "Tyagi", "Manager"});
		empData.add(new Object[] {106, "Natraj", "Lead"});
		empData.add(new Object[] {107, "Morgan", "HR"});
		
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
