package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.FileUpload;

public class FileUpload_Test {
	
	WebDriver driver;
	
	@BeforeTest
	public void loadbrowser()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void loadurl()
	{
		driver.get("https://www.ilovepdf.com/");
	}
	
	@Test
	public void test() throws AWTException
	{
		FileUpload fu= new FileUpload(driver);
		fu.upload();
		fu.fileload("D:\\SHIBINA\\Shibina");
	}

}
