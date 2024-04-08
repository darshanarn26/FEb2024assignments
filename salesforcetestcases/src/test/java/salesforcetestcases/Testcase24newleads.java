package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase24newleads {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		newleads();
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
	static void newleads() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement leadstab=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leadstab.click();
		
		String beforeclick=driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement newlead=driver.findElement(By.xpath("//input[@value=' New ']"));
		newlead.click();
		
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.id("name_lastlea2"));
		lastname.sendKeys("HIJ");
		
		Thread.sleep(2000);
		WebElement company=driver.findElement(By.id("lea3"));
		company.sendKeys("HIJ");
		
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		save.click();
		String afterclick=driver.getCurrentUrl();
		
		if(!beforeclick.equals(afterclick))
		{
			System.out.println("Test case passed : New lead created");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}
	

}
