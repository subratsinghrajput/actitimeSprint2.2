package DD2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToreadDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./Testdata/ExcelName.xlsx");

Workbook workbook = WorkbookFactory.create(fis);
Sheet sheet = workbook.getSheet("Sheet1");
Row row = sheet.getRow(2);
Cell cell = row.getCell(0);

String customername = cell.getStringCellValue();
System.out.println("2nd customer name is "+customername );
int secondndCustomerphone = (int) row.getCell(1).getNumericCellValue();
System.out.println("mobile nome is "+secondndCustomerphone);

	}

}
