package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase30errormessage {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		contactstaberror();
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
	
	static void contactstaberror() throws InterruptedException
	{

		Thread.sleep(2000);
		WebElement contactstab=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactstab.click();
		
	   Thread.sleep(2000);
	   WebElement newview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	   newview.click();
	   	  
	      
	   Thread.sleep(2000);
	   WebElement viewunique=driver.findElement(By.id("devname"));
	   viewunique.sendKeys("EFGH");
	   
	   Thread.sleep(2000);
	   WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
	   save.click();
	   
	   Thread.sleep(2000);
	   WebElement viewname=driver.findElement(By.xpath("//div[@class='errorMsg' and contains(text(),' You must enter a value')]"));
	   String errormessage=viewname.getText();
	   System.out.println(errormessage);
	   String expectedmessage="Error: You must enter a value";
	   if(errormessage.equals(expectedmessage))
	   {
		   System.out.println("Test case passed : error message displayed");
	   }
	   else
	   {
		   System.out.println("Test case failed");
	   }
	  
		
	}

}
