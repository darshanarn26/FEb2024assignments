package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase27 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		recentcontact();
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
	static void recentcontact() throws InterruptedException
	{

		Thread.sleep(2000);
		WebElement contactstab=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactstab.click();
		
		
		Thread.sleep(2000);
		WebElement recent=driver.findElement(By.id("hotlist_mode"));
		Select recents=new Select(recent);
		recents.selectByVisibleText("Recently Created");
		
		String expectedvalue="LMN";
		String pagesource=driver.getPageSource();
		if(pagesource.contains(expectedvalue))
		{
			System.out.println("Test case passed : page has the new contact value");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}

}
