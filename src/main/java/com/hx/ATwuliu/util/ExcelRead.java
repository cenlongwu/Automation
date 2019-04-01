package com.hx.ATwuliu.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Reporter;

/**
 * Created by Administrator on 2018/12/5.
 */
public class ExcelRead {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    /**
     * 判断Excel的版本,获取Workbook
     *
     * @param in
     * @param
     * @return
     * @throws IOException
     */
    public static Workbook getWorkbook(InputStream in, File file) throws IOException {
        Workbook wb = null;
        if (file.getName().endsWith(EXCEL_XLS)) {     //Excel 2003
            wb = new HSSFWorkbook(in);
        } else if (file.getName().endsWith(EXCEL_XLSX)) {    // Excel 2007/2010
            wb = new XSSFWorkbook(in);
        }
        return wb;
    }

    /**
     * 判断文件是否是excel
     *
     * @throws Exception
     */
    public static void checkExcelValid(File file) throws Exception {
        if (!file.exists()) {
            throw new IOException("文件不存在");
        }
        if (!(file.isFile() && (file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))) {
            throw new Exception("文件不是Excel");
        }
    }

    /**
     * 读取Excel测试，兼容 Excel 2003/2007/2010
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        getTestData2("D:\\HXAutomation\\TestData\\Test1.xlsx");
    }

    public static Object[][] getTestData2(String fileName) throws Exception {
        // SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        List result = new ArrayList();

        //BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:/xxx/InsertSql.txt")));
        Object[][] results = new Object[0][];
        try {
            // 同时支持Excel 2003、2007
            File excelFile = new File(fileName); // 创建文件对象
            FileInputStream is = new FileInputStream(excelFile); // 文件流
            checkExcelValid(excelFile);
            Workbook workbook = getWorkbook(is, excelFile);
            //Workbook workbook = WorkbookFactory.create(is); // 这种方式 Excel2003/2007/2010都是可以处理的


            int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
            /**
             * 设置当前excel中sheet的下标：0开始
             */
            //Sheet sheet = workbook.getSheetAt(0);	// 遍历第一个Sheet
            /**
             * 历遍当前workbook的所有sheet
             */
            for (int numsheet = 0; numsheet < sheetCount; numsheet++) {
                //sheet标识一个页
                Sheet sheet = workbook.getSheetAt(numsheet);
                if (sheet == null) {
                    continue;
                }
                //处理当前页，循环读取
                for (int rowNum = 2; rowNum <= sheet.getLastRowNum(); rowNum++) {
                    Row row = sheet.getRow(rowNum);
                    int minColIx = row.getFirstCellNum();
                    int maxColIx = row.getLastCellNum();
                    List rowList = new ArrayList();
                    for (int colIx = minColIx; colIx < maxColIx; colIx++) {
                        Cell cell = row.getCell(colIx);
                        if (cell == null) {
                            continue;
                        }
                        rowList.add(cell.toString());
                        Reporter.log(String.valueOf(result));
                    }
                    result.add(rowList);

                }

                // 设置二位数组每行的值，每行是一个Object对象
                results = new Object[result.size()][];
                for (int i = 0; i < result.size(); i++) {
                    results[i] = (Object[]) result.get(i);
                    System.out.println(results[i]);
                }
                //return results;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
}