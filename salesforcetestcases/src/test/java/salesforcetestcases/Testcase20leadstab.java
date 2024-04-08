package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase20leadstab {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		launch();
		leads();
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
	static void leads() throws InterruptedException
	{
		
		Thread.sleep(2000);
		String beforeclick=driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement leadstab=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leadstab.click();
		String afterclick=driver.getCurrentUrl();
		if(!beforeclick.equals(afterclick))
		{
			System.out.println("Test case passed : leads page displayed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}

}
