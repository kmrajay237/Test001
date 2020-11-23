package apachePOI;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_12_ExcelToDataBase {
//	execution pending - Need to install MySql prior to execution
	public static void main(String[] args) throws Exception {
//		DataBase Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		
//		Statement/Query
		Statement stmt = con.createStatement();
		
//		Create a new Table in DB as "places"
		String sql="create table places("
				+ "LOCATION_ID decimal(4,0),"
				+ "STREET_ADDRESS varchar2(40),"
				+ "POSTAL_CODE varchar2(12),"
				+ "CITY varchar2(40),"
				+ "STATE_PROVINCE varchar2(25),"
				+ "COUNTRY_ID varchar2(10))";
		stmt.execute(sql);
		
//		Excel
		FileInputStream fis=new FileInputStream("./datafiles/ExcelToDB.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.getSheet("Location Data");
		int rows = sheet.getLastRowNum();
		for(int r=1;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			double locId = row.getCell(0).getNumericCellValue();
			String stAdd = row.getCell(1).getStringCellValue();
			String psCode = row.getCell(2).getStringCellValue();
			String city = row.getCell(3).getStringCellValue();
			String state = row.getCell(4).getStringCellValue();
			String cId = row.getCell(5).getStringCellValue();
			
			sql="insert into places values('"+locId+"','"+stAdd+"','"+psCode+"','"+city+"','"+state+"','"+cId+"')";
			stmt.execute(sql);
			stmt.execute("commit");
		}
		workbook.close();
		fis.close();
		con.close();
		System.out.println("Done!!");
	}

}
