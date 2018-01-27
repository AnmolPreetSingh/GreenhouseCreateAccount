package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExl {
	public String sendPwd() 
	{

		File src=new File("dummyDataGreenHs\\DataGreen.xlsx");
		
		String das=null;
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
	 das=sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(das);
		
		try {
			wb.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return das;
	}

	public  String sendfirstname() 
	{
		
		File src=new File("dummyDataGreenHs\\DataGreen.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String fname=sheet1.getRow(1).getCell(3).getStringCellValue();
		
		
		
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fname;

	}
	
	public  String sendlastname() 
	{
		
		File src=new File("dummyDataGreenHs\\DataGreen.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String lname=sheet1.getRow(1).getCell(4).getStringCellValue();
		
		
		
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lname;

	}
	public  String sendEmail() 
	{
		
		File src=new File("dummyDataGreenHs\\DataGreen.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String email =sheet1.getRow(1).getCell(5).getStringCellValue();
		
		
		
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return email;

	}
	public String gender() 
	{
		

		File src=new File("dummyDataGreenHs\\DataGreen.xlsx");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String n=sheet1.getRow(1).getCell(2).getStringCellValue();
		System.out.println(n);
		
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
}
