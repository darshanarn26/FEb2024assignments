package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase31cancel 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		contactstabcancel();
	}
	static void launch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("darshanarn@naukri.com");
		Thread.sleep(1000);
	    
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Nathasha19!");
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.id("Login"));
		login.click();

	}
	
	static void contactstabcancel() throws InterruptedException
	{

		Thread.sleep(2000);
		WebElement contactstab=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactstab.click();
		

		Thread.sleep(2000);
		WebElement newview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		newview.click();
		
		Thread.sleep(2000);
		WebElement viewname=driver.findElement(By.id("fname"));
		viewname.sendKeys("IJKL");
		
		Thread.sleep(2000);
		WebElement viewuniquename=driver.findElement(By.id("devname"));
		viewuniquename.sendKeys("");
		
		Thread.sleep(2000);
		WebElement cancel=driver.findElement(By.xpath("//input[@value='Cancel']"));
		cancel.click();
		
		String page=driver.getPageSource();
		String expectedvalue="IJKL";
		if(!page.contains(expectedvalue))
		{
			System.out.println("Test case passed : cancelled");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}
		
}
