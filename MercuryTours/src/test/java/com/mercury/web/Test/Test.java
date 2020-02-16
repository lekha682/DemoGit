package com.mercury.web.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fb.web.pages.LoginPage;


public class Test {
public	WebDriver driver;
@org.testng.annotations.Test
	public void login()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Use\\Downloads\\exe files\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/index.php");
	LoginPage l=new LoginPage();
	l.logincheck("lekhu", "lekhashah@11", driver);
	
	
	}
		
	
	

}
