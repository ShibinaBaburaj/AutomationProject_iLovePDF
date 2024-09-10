package page;

import org.openqa.selenium.WebDriver;

public class Title_Content_Verification {
	
	WebDriver driver;
	
	public Title_Content_Verification(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//Title verification
	public void title()
	{
		String ActualTtl = driver.getTitle();
		
		if (ActualTtl.equals("iLovePDF | Online PDF tools for PDF lovers"))
		{
			System.out.println("Title Test Passed");
		}
		else 
		{
			System.out.println("Title Test Failed");
		}
		
	}
	
	//Content Verification
	public void content()
	{
		String src = driver.getPageSource();
		
		if (src.contains("Merge PDF"))
		{
			System.out.println("Content Test Passed");
			System.out.println("Merge PDF is present");
		}
		else
		{
			System.out.println("Content Test Failed");
			System.out.println("Merge PDF is missing");
		}
		
		if (src.contains("Compare PDF"))
		{
			System.out.println("Content Test Passed");
			System.out.println("Compare PDF is present");
		}
		else
		{
			System.out.println("Content Test Failed");
			System.out.println("Compare PDF is missing");
		}
	}

}
