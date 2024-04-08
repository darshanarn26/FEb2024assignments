package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase22Leads {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		leads();
		checkleads();
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
		WebElement leadstab=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leadstab.click();
		
		Thread.sleep(2000);
		WebElement leadsdropdown=driver.findElement(By.id("fcf"));
		leadsdropdown.click();
		
		Select recent=new Select(leadsdropdown);
		recent.selectByVisibleText("Recently Viewed Leads");
		
		Thread.sleep(2000);
		WebElement usermenu=driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("darshanarn@naukri.com");
		Thread.sleep(1000);
	    
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Nathasha19!");
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		
		
	}
	static void checkleads() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement leadstab=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leadstab.click();
		
		Thread.sleep(2000);
		WebElement go=driver.findElement(By.xpath("//input[@name='go']"));
		go.click();
		
		Thread.sleep(2000);
		WebElement listselected=driver.findElement(By.id("00Baj000004sSDm_listSelect"));
		String selectedvalue=listselected.getAttribute("value");
		System.out.println(selectedvalue);
		String expectedvalue="00Baj000004sSDm";
		
		if(selectedvalue.equals(expectedvalue))
		{
			System.out.println("Test case passed : Default selection displayed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}

}
