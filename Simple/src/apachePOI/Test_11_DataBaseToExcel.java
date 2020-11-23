package apachePOI;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_11_DataBaseToExcel {
//	execution pending - Need to install MySql prior to execution
	public static void main(String[] args) throws Exception {

//		Connect to the DataBase
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");

//		Statement/Query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from locations");

//		Excel
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Locations Data");

		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("LOCATION_ID");
		row.createCell(1).setCellValue("STREET_ADDRESS");
		row.createCell(2).setCellValue("POSTAL_CODE");
		row.createCell(3).setCellValue("CITY");
		row.createCell(4).setCellValue("STATE_PROVINCE");
		row.createCell(5).setCellValue("COUNTRY_ID");

		int r = 1;
		while (rs.next()) {
			double locID = rs.getDouble("LOCATION_ID");
			String stAdd = rs.getString("STREET_ADDRESS");
			String posCode = rs.getString("POSTAL_CODE");
			String city = rs.getString("CITY");
			String state = rs.getString("STATE_PROVINCE");
			String cId = rs.getString("COUNTRY_ID");

			row = sheet.createRow(r++);
			row.createCell(0).setCellValue(locID);
			row.createCell(1).setCellValue(stAdd);
			row.createCell(2).setCellValue(posCode);
			row.createCell(3).setCellValue(city);
			row.createCell(4).setCellValue(state);
			row.createCell(5).setCellValue(cId);
		}
		FileOutputStream fos=new FileOutputStream("./datafiles/DB.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		con.close();
		System.out.println("Done!!");
	}

}
