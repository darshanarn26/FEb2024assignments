package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase25createcontact {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		contacts();
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
	
	static void contacts() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement contactstab=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactstab.click();
		
		String beforeclick=driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement newcontact=driver.findElement(By.xpath("//input[@value=' New ']"));
		newcontact.click();
		
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.id("name_lastcon2"));
		lastname.sendKeys("LMN");
		
		Thread.sleep(2000);
		WebElement accountname=driver.findElement(By.id("con4"));
		accountname.sendKeys("DarshanaABCD");
		
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		save.click();
		
		String afterclick=driver.getCurrentUrl();
		
		if(!beforeclick.equals(afterclick))
		{
			System.out.println("Test case passed : New contact created");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}
}
