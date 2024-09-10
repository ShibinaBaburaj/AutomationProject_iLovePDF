package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Links_Verification;

public class Links_Verification_Test {
	
	WebDriver driver;
	
	String baseurl= "https://www.ilovepdf.com/";
	
	@BeforeTest
	public void loadbrowser()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod()
	public void loadurl()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		Links_Verification lv= new Links_Verification(driver);
		lv.linkcount();
	}

}
