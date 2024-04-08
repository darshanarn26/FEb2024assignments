package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase19Summary {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		summaryreport();
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
	
	static void summaryreport() throws InterruptedException
	{
		WebElement opportunity=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunity.click();
		
		String beforerun=driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement interval=driver.findElement(By.id("quarter_q"));
		Select intervalval=new Select(interval);
		intervalval.selectByVisibleText("Current and Next FQ");
		
		Thread.sleep(2000);
		WebElement include=driver.findElement(By.id("open"));
		Select includeval=new Select(include);
		includeval.selectByVisibleText("All Opportunities");
		
		Thread.sleep(2000);
		WebElement runreport=driver.findElement(By.xpath("//input[@value='Run Report']"));
		runreport.click();
		
		String afterrun=driver.getCurrentUrl();
		Thread.sleep(2000);
		if(!beforerun.equals(afterrun))
		{
			System.out.println("Test case passed : Summary displayed");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}

}
