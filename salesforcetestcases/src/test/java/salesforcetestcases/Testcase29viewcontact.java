package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase29viewcontact {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		contactstab();
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
	
	static void contactstab() throws InterruptedException
	{

		Thread.sleep(2000);
		WebElement contactstab=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactstab.click();
		
		Thread.sleep(2000);
		WebElement contactname=driver.findElement(By.xpath("//a[@href='/003aj000001FNH2']"));
		contactname.click();
		
		String expectedcontact="ABCD";
		String page=driver.getPageSource();
		if(page.contains(expectedcontact))
		{
			System.out.println("Test case passed : contact appeared");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}
}
