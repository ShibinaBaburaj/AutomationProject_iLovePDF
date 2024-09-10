package page;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links_Verification {
	
	WebDriver driver;
	
	public Links_Verification(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void linkcount() 
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
				
		for(WebElement l:li)
		{
			String link = l.getAttribute("href");
			String txt = l.getText();
			verifylink(link,txt);
		}
		
		System.out.println("No.of links in the page is: "+li.size());

	}
	
	public void verifylink(String link, String txt) 
	{
		try
		{
		
			URL ob= new URL(link);
			HttpURLConnection con=(HttpURLConnection) ob.openConnection();
			con.connect();
		
			if (con.getResponseCode()==200)
			{
				System.out.println("Valid---"+link+"---"+txt);
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("Broken link---"+link+"---"+txt);
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
