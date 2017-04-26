package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	  public static String getParameterValue(String FileName,String Sheet,String nColumn, String nRow) {
	        String oFieldName=null;
	            String TDwb = System.getProperty("user.dir") + "//src//test//resources//testData//" + FileName + ".xlsx";	            
	            try {
	                FileInputStream fileInputStream = new FileInputStream(TDwb);
	                XSSFWorkbook workbook = null;
	                try{
	                    workbook = new XSSFWorkbook(fileInputStream);
	                } catch(IOException e){}
	                XSSFSheet worksheet =workbook.getSheet(Sheet);
	                XSSFRow Row = worksheet.getRow(0);
	                int colCount = Row.getLastCellNum();
	                int gCol=0;
	                for(int i=0;i<=colCount;i++){
	                    String getFieldVal = Row.getCell(i).toString();
	                    if(nColumn.equalsIgnoreCase(getFieldVal)){
	                        gCol = i;
	                        break;
	                    }
	                }
	                int gRow = 0;
	                int rowCount = worksheet.getLastRowNum();
	                for(int j=0;j<=rowCount;j++){
	                	if(nRow.equals(worksheet.getRow(j).getCell(0).toString() )){
	                		gRow = j;
	                		break;
	                	}
	                }
	                
	                oFieldName=worksheet.getRow(gRow).getCell(gCol).toString();
	                
	            } catch (FileNotFoundException e) {
	                e.printStackTrace();
	            }
	   
	        return oFieldName;
	    }
}
