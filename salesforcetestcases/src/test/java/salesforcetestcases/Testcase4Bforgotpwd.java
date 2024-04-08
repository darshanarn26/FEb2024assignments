package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4Bforgotpwd {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("123");
		Thread.sleep(1000);
        
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("123");
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		
		WebElement error=driver.findElement(By.id("error"));
		boolean errormessage=error.isDisplayed();
		if(errormessage)
		{
			System.out.println("Test case Passed : Error message is displayed \n" + error.getText() );
		}
		else
		{
			System.out.println("Test case failed");
		}

	}

}
