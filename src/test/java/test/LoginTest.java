package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Login;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void loadbrowser()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod()
	public void loadurl()
	{
		driver.get("https://www.ilovepdf.com/login");
	}
	
	@Test
	public void test()
	{
		Login l= new Login(driver);
		l.setvalues("Yaara@gmail.com", "Yaara@123");
		l.intothesite();
	}

}
