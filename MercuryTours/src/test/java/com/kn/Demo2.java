package com.kn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	@BeforeSuite
	public void openbrows()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Use\\Downloads\\exe files\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeTest
	public void url()
	{
		driver.get("http://newtours.demoaut.com/");
	}
	@BeforeClass
	public void max()
	{
		driver.manage().window().maximize();
	}
  @Test
  public void login() {
	  driver.findElement(By.name("userName")).sendKeys("lekhu");
	  driver.findElement(By.name("password")).sendKeys("lekhashah@11");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  
  }
  
}
