package apachePOI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_09_HashMapToExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student Data");

		Map<String, String> data = new HashMap<String, String>();
		data.put("101", "John");
		data.put("102", "Kim");
		data.put("103", "Steve");
		data.put("104", "David");
		data.put("105", "Mery");
		data.put("106", "Tom");

		int rownum = 0;
		for (Map.Entry entry : data.entrySet()) {
			XSSFRow row = sheet.createRow(rownum++);
			row.createCell(0).setCellValue((String)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());
		}
		FileOutputStream fos=new FileOutputStream("./datafiles/Student.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("Done!!");
	}

}
