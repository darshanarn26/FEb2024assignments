package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase8Devconsole {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{

     login();
     usermenu();
     devconsole();

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
	
	 static void usermenu() throws InterruptedException
	 {
		    Thread.sleep(2000);
			WebElement usermenu=driver.findElement(By.id("userNavButton"));
			usermenu.click();
	 }
	 
	 static void devconsole() throws InterruptedException
	 {
		Thread.sleep(2000);	    
	    String parentwindow=driver.getWindowHandle();
	    String parentwindowtitle=driver.getTitle();
	    System.out.println("parentwindow title : " + parentwindowtitle);
	    WebElement devconsole=driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
	    devconsole.click();
	    
	    Thread.sleep(2000);
	    	    
	    for(String handle : driver.getWindowHandles())
	    {
	    	
	    	driver.switchTo().window(handle);	
	    		
	    		
	    }
	    
	    String childwindowtitle=driver.getTitle();
	    System.out.println("childwindow title : " + childwindowtitle);
	    driver.close();
	    driver.switchTo().window(parentwindow);
	    WebElement sflogo=driver.findElement(By.id("phHeaderLogoImage"));
	    boolean displayed=sflogo.isDisplayed();
	    
	    if(displayed)
	    {
	    	System.out.println("Test case Passed : Developer console window closed");
	    }
	    else
	    {
	    	System.out.println("Test case failed ");
	    }
	  
	    
	 }

}
