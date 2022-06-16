package Maven_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTest {
	public static Object[][] test(String string) throws EncryptedDocumentException, IOException{
	File file=new File("./src/test/resources/Testdata/Data.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("Login");
	int row=sheet.getPhysicalNumberOfRows();
	int colcount =sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][] data=new Object[row-1][colcount];
	for(int i=1;i<row;i++) {
		for(int j=0;j<colcount;j++)
		
		{
			data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			
		}
	}
	return data;
	/*for(int i=1;i<row-1;i++) {
		for(int j=1;j<colcount;j++)
	{
		System.out.println(data[i][j]);
		
	}*/
	}
	
	

}

