package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	By lemail= By.id("loginEmail");
	By lpassword= By.id("inputPasswordAuth");
	By llogin= By.id("loginBtn");
	
	public Login(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void setvalues(String email, String password)
	{
		driver.findElement(lemail).sendKeys(email);
		driver.findElement(lpassword).sendKeys(password);
	}
	
	public void intothesite()
	{
		driver.findElement(llogin).click();
	}

}
