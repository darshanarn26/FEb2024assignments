package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase32saveandnew {

	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		contactssaveandnew();
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
	
	static void contactssaveandnew() throws InterruptedException
	{

		Thread.sleep(2000);
		WebElement contactstab=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactstab.click();
		
	   Thread.sleep(2000);
	   WebElement newbutton=driver.findElement(By.xpath("//input[@value=' New ']"));
	   newbutton.click();
	   
	   Thread.sleep(2000);
	   WebElement lastname=driver.findElement(By.id("name_lastcon2"));
	   lastname.sendKeys("Indian");
	   
	   Thread.sleep(2000);
	   WebElement accountname=driver.findElement(By.id("con4"));
	   accountname.sendKeys("Global media");
	    
	   Thread.sleep(2000);
	   WebElement saveandnew=driver.findElement(By.xpath("//input[@value='Save & New']"));
	   saveandnew.click();
	   
	   System.out.println("Test case failed");

	}

}
