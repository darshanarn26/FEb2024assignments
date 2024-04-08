package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase5usermenu {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
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
		
		Thread.sleep(2000);
		WebElement usermenu=driver.findElement(By.id("userNavButton"));
		usermenu.click();
				
		WebElement menuitems=driver.findElement(By.id("userNav-menuItems"));
		boolean displayed=menuitems.isDisplayed();
		if(displayed)
		{
			System.out.println("Test case passed : Drop down with \n" +menuitems.getText());
		}
		else
		{
			System.out.println("Test case failed :");
		}

	}

}
