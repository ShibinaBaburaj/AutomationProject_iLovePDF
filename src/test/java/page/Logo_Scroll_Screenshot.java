package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Logo_Scroll_Screenshot {
	
	WebDriver driver;
	
	public Logo_Scroll_Screenshot(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void logo()
	{
		WebElement log = driver.findElement(By.xpath("/html/body/header/nav/a/img"));
		
		boolean b= log.isDisplayed();
		
		if (b)
		{
			System.out.println("Logo Test Passed");
			System.out.println("Logo is present in the page");
		}
		else
		{
			System.out.println("Logo Test Failed");
			System.out.println("Logo is missing in the page");
		}
	}
	
	public void scroll()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}
	
	public void sselement() throws IOException
	{
		WebElement elment = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/ul/li[4]/a"));
		File src=elment.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//Features.png"));
	}
	
	public void sspage() throws IOException
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/ul/li[4]/a")).click();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//FeaturesPage.png"));
	}

}
