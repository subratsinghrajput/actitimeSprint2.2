package DatadrivenData.TestData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToAddDatainExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("./Testdata/ExcelName.xlsx");
Workbook workbook = WorkbookFactory.create(fis);
Sheet sheet = workbook.getSheet("Sheet1");
sheet.createRow(3).createCell(0).setCellValue("Shivam");

FileOutputStream fos=new FileOutputStream("./Testdata/ExcelName.xlsx");

workbook.write(fos);
workbook.close();
System.out.println("Data Has Been Updated " );

	}

}
