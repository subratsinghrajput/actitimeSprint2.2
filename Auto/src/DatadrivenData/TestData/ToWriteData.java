package DatadrivenData.TestData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteData {





	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fs=new FileInputStream("./Testdata/ExcelName.xlsx");
Workbook workbook = WorkbookFactory.create(fs);
Sheet sheet = workbook.getSheet("Sheet1");
Row row = sheet.getRow(1);
Cell cell = row.getCell(0);
String customername1 = cell.getStringCellValue();
System.out.println("First customer name is "+customername1);

	}

}
