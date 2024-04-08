package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testcase37 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		launch();
		calender();
		
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
	
	static void calender() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hometab=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		hometab.click();
		
		Thread.sleep(2000);
		WebElement datelink=driver.findElement(By.xpath("//a[@href='/00U/c?md3=88&md0=2024']"));
		datelink.click();
		
		Thread.sleep(2000);
		
		
		
	}
			

}
