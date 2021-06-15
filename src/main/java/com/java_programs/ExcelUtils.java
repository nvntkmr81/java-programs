package main.java.com.java_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static void main(String[] args) throws IOException {

		String baseDir = System.getProperty("user.dir");
		String sheetName = "Sheet1";
		String sourceFilePath = baseDir + "/Resources/Source.xlsx";
		String targetFilePath = baseDir + "/Resources/Target.xlsx";

		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		ExcelUtils exl = new ExcelUtils();

		map1 = exl.getSheetValues(sourceFilePath, sheetName);
		map2 = exl.getSheetValues(targetFilePath, sheetName);
		List<String> errors = exl.compare(map1, map2);
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(errors);

	}

	/**
	 * 
	 * @param filePath
	 *            : Path of the excel file
	 * @param SheetName
	 *            : Name of the required Sheet
	 * @return Map<String,String> : Map containing cell address and value.
	 * @throws IOException
	 */

	public Map<String, String> getSheetValues(String filePath, String SheetName) throws IOException {

		Map<String, String> map = new HashMap<String, String>();
		File src = new File(filePath);
		FileInputStream fis = new FileInputStream(src);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet(SheetName);
		String value;
		for (Row row : sh) {
			for (Cell cell : row) {
				try {
					value = cell.getStringCellValue();
				} catch (Exception e) {
					value = "" + cell.getNumericCellValue();
				}
				map.put(cell.getAddress().toString(), value);
			}

		}

		wb.close();

		return map;

	}

	public List<String> compare(Map<String, String> sourceMap, Map<String, String> targetMap) {
		List<String> error = new ArrayList<String>();

		Set<String> address = sourceMap.keySet();

		for (String ad : address) {
			if (!(sourceMap.get(ad).equals(targetMap.get(ad)))) {
				error.add(ad);
			}
		}

		return error;
	}

}