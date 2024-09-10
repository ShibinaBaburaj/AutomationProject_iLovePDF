package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Mouseover_navigation;

public class Mouseover_Test {
	
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
		Mouseover_navigation m= new Mouseover_navigation(driver);
		m.check();
		m.back();
	}

}
