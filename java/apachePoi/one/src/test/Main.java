package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        
        File file = new File("resources/temp-artigos-aceitos.xlsx");
        XSSFWorkbook myWorkBook = null;
        try {
            FileInputStream fStream = new FileInputStream(file);
            myWorkBook = new XSSFWorkbook(fStream);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            
            Iterator<Row> rowIterator = mySheet.iterator();
            
            while (rowIterator.hasNext()) {
                Row row = (Row) rowIterator.next();
                
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = (Cell) cellIterator.next();
                    
                    switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() +"[[" +cell.getColumnIndex() +"]]" +"\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "[[" +cell.getColumnIndex() + "]]" +"\t");
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() +"[[" +cell.getColumnIndex() +"]]" + "\t");
                        break;
                    default:
                        break;
                    }
                    
                }
                System.out.println();
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        try {
            myWorkBook.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("null pointer exception");
            e.printStackTrace();
        }
        
    }
}
