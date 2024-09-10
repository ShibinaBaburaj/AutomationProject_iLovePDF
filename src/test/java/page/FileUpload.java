package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	
	WebDriver driver;
	
	By wdtop= By.xpath("/html/body/div[1]/div[3]/div/div[7]/a");
	By btn= By.xpath("//*[@id=\"pickfiles\"]");
	By covert= By.xpath("/html/body/div[1]/div[1]/button");
	
	public FileUpload(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void upload() throws AWTException
	{
		driver.findElement(wdtop).click();
		driver.findElement(btn).click();
	}
	
	public void fileload(String p) throws AWTException
	{
		StringSelection str= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Robot rb= new Robot();
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(covert));
		
		driver.findElement(covert).click();
	}

}
