package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Title_Content_Verification;


public class Title_Content_Test {
	
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
	}
	
	@Test
	public void test()
	{
		Title_Content_Verification tcv= new Title_Content_Verification(driver);
		tcv.title();
		tcv.content();
	}

}
