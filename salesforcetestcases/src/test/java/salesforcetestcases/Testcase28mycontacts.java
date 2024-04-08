package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase28mycontacts {

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
		
		String beforeclick=driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement mycontacts=driver.findElement(By.id("fcf"));
		Select contact=new Select(mycontacts);
		contact.selectByVisibleText("My Contacts");
		
		String afterclick=driver.getCurrentUrl();
		if(!beforeclick.equals(afterclick))
		{
			System.out.println("Test case passed : my contacts page appeared");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}

}
