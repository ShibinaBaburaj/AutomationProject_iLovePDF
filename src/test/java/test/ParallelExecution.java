package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser)
	{
		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver= new EdgeDriver();
		}
	}
	
	@Test
	public void loadsite()
	{
		driver.get("https://www.ilovepdf.com/");
	}

}
