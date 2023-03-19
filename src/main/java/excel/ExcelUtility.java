package excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream("./Pradeep.xlsx");
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row rowN = sheet.getRow(rowNum);
		Cell cell = rowN.getCell(cellNum);
		String value=cell.getStringCellValue();
		return value;
	}
	public static void main(String[] args) throws Throwable {
		ExcelUtility ex = new ExcelUtility();
		String pra=ex.readDataFromExcel("sheet1", 0, 0);
		System.out.println(pra);
		String dd=ex.readDataFromExcel("sheet1", 0, 1);
		System.out.println(dd);
		System.out.println(ex.readDataFromExcel("sheet1", 1, 0));
		System.out.println(ex.readDataFromExcel("sheet1", 1, 1));
		System.out.println(ex.readDataFromExcel("sheet1", 2, 0));
		System.out.println(ex.readDataFromExcel("sheet1", 2, 1));
		
	}

}
