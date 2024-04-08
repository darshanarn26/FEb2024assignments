package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase17pipeline {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		pipeline();
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
	
	static void pipeline() throws InterruptedException
	{
		WebElement opportunity=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunity.click();
		
		String beforepipelink=driver.getCurrentUrl();
		
		Thread.sleep(2000);
		WebElement pipelinelink=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		pipelinelink.click();
		
		String afrerpipelinelink=driver.getCurrentUrl();
		
		if(!beforepipelink.equals(afrerpipelinelink))
		{
			System.out.println("Testcase passed : pipeline report page appeared");
		}
		
		else
		{
			System.out.println("Test case failed");
		}
	}

}
