package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRead {
	
	WebDriver driver;
	@BeforeSuite
	public void openbrows()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Use\\Downloads\\exe files\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@BeforeClass
	public void url()
	{
		driver.get("http://newtours.demoaut.com/");
	}
	@BeforeTest
	public void max()
	{
		driver.manage().window().maximize();
	}
	@Test(dataProvider="listdata")
	public void login(String un,String pass) throws IOException
	{
		/*File f= new File("B:\\corejavaNotpad\\Book2.xlsx");
		FileInputStream f1=new FileInputStream(f);
		XSSFWorkbook w= new XSSFWorkbook(f1);
		XSSFSheet s=w.getSheet("sheet1");
		String s1=s.getRow(0).getCell(0).getStringCellValue();	
		System.out.println(s1);
		String s2=s.getRow(0).getCell(1).getStringCellValue();
		System.out.println(s2);*/
		driver.findElement(By.name("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		
		
	}
	@DataProvider
public 	Object[][] listdata() throws IOException

{
		File f= new File("D:\\Book3.xlsx");
		FileInputStream f1=new FileInputStream(f);
		XSSFWorkbook w= new XSSFWorkbook(f1);
		XSSFSheet s=w.getSheet("sheet1");
		
		int row=s.getPhysicalNumberOfRows();
		System.out.println(row);
		int col=s.getRow(0).getLastCellNum();
		System.out.println(col);
		Object[][] obj=new Object[row][col];
		Object[][] obj1=new Object[3][2];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String s1=s.getRow(i).getCell(j).getStringCellValue();
				obj1[i][j]=s1;
				
				
			}
			
			
		}
		return obj1;		
		
		
}
	
	
	
	

}
