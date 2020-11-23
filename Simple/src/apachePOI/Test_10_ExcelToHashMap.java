package apachePOI;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_10_ExcelToHashMap {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./datafiles/Student.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Student Data");
		
		int rows = sheet.getLastRowNum();

		Map<String, String> data = new HashMap<String, String>();
		
//		Reading Data from Excel to HashMap
		for (int r = 0; r <= rows; r++) {
			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();
			data.put(key, value);
		}
//		Read Data from HashMap
		for (Map.Entry<String, String> entry: data.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
