package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase9logout {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		login();
		usermenulogout();
		verifylogout();
	}
	static void login() throws InterruptedException
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
	
	static void usermenulogout() throws InterruptedException
	{
		    Thread.sleep(2000);
			WebElement usermenu=driver.findElement(By.id("userNavButton"));
			usermenu.click();
			
			Thread.sleep(2000);
			WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			logout.click();
			
	}
	
	static void verifylogout() throws InterruptedException
	{
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement loginpage=driver.findElement(By.id("Login"));
		boolean logindisplayed=loginpage.isDisplayed();
		
		if(logindisplayed)
		{
			System.out.println("Test case passed : Logged out");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}

}
