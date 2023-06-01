package DD2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis =new FileInputStream("./Testdata/ExcelName.xlsx");

Workbook workbook = WorkbookFactory.create(fis);

Cell NameOfCustomer = workbook.getSheet("Sheet1").getRow(2).getCell(0);
System.out.println("Name of cusomer is "+ NameOfCustomer);

	}

}
