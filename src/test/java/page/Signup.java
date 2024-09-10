package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {
	
	WebDriver driver;
	
	By sname= By.id("name");
	By semail= By.id("signupEmail");
	By spassword= By.id("password");
	By ssignup= By.id("registerButton");
	
	public Signup(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void setvalues(String name, String email, String password)
	{
		driver.findElement(sname).sendKeys(name);
		driver.findElement(semail).sendKeys(email);
		driver.findElement(spassword).sendKeys(password);
	}
	
	public void reg()
	{
		driver.findElement(ssignup).click();
	}

}
