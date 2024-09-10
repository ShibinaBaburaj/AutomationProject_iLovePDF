package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Logo_Scroll_Screenshot;

public class Logo_Scroll_Screenshot_Test {
	
	WebDriver driver;
	
	@BeforeTest
	public void loadbrowser()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod
	public void loadurl()
	{
		driver.get("https://www.ilovepdf.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws IOException
	{
		Logo_Scroll_Screenshot lss= new Logo_Scroll_Screenshot(driver);
		lss.logo();
		lss.scroll();
		lss.sselement();
		lss.sspage();
	}

}
