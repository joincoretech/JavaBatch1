package class33;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path ="Files/MyData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= xssfWorkbook.getSheet("userData");
        int numberOfRowINsheet=sheet.getPhysicalNumberOfRows();

        for (int i=0; i<numberOfRowINsheet; i++){
            Row row=sheet.getRow(i);
            if (i==0){
                Cell cell=row.createCell(3);
                cell.setCellValue("Salary");
            }else {
                Cell cell=row.createCell(3);
                cell.setCellValue(150000);
            }
        }
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
    }
}
