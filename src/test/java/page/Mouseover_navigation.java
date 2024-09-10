package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_navigation {
	
	WebDriver driver;
	
	public Mouseover_navigation(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void check()
	{
		WebElement tools = driver.findElement(By.xpath("/html/body/header/nav/div[1]"));
		
		Actions act= new Actions(driver);
		act.moveToElement(tools).perform();
		
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/ul[2]/li/div/ul/li[3]/ul/li[3]/a")).click();
	}
	
	public void back()
	{
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
