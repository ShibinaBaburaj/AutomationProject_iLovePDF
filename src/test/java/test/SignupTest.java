package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Signup;



public class SignupTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void loadbrowser()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod
	public void loadurl()
	{
		driver.get("https://www.ilovepdf.com/register");
	}
	
	@Test
	public void test()
	{
		Signup su= new Signup(driver);
		su.setvalues("Yaara", "Yaara@gmail.com", "Yaara@123");
		su.reg();
	}

}
