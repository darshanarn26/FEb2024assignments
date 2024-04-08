package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase36 {

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
		WebElement datelink=driver.findElement(By.xpath("//div[@class='content']/span[@class='pageDescription']"));
		datelink.click();
		
		Thread.sleep(2000);
		WebElement time=driver.findElement(By.id("p:f:j_id25:j_id61:4:j_id64"));
		time.click();
		
		Thread.sleep(2000);
		WebElement combo=driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']"));
		combo.click();
		
		Thread.sleep(2000);
		
		//String parentwindow=driver.getWindowHandle();
		for(String handle : driver.getWindowHandles())
		{
			
			driver.switchTo().window(handle);
			
			WebElement other=driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']"));
			other.click();
			}
		
		
		
	}
			

}
