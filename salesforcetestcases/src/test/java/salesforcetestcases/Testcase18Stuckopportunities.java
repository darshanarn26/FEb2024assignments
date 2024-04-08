package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase18Stuckopportunities {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		stuckopportunity();
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
	
	static void stuckopportunity() throws InterruptedException
	{
		WebElement opportunity=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunity.click();
		
		String beforeclick=driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement stucklink=driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		stucklink.click();
		
		Thread.sleep(2000);
		String afterclick=driver.getCurrentUrl();
		if(!beforeclick.equals(afterclick))
		{
			System.out.println("Test case passed : Stuck opportunities page displayed");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}

}
