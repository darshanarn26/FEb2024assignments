package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3Rememberme {

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
		Thread.sleep(2000);
		
		WebElement checkbox=driver.findElement(By.id("rememberUn"));
		checkbox.click();
		
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("userNav-arrow"));
		username.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		
	    Thread.sleep(2000);   
		verifyusername();
	}
	
	static void verifyusername()
	{
		WebElement actualuname=driver.findElement(By.id("username"));
		String expectednamefield="darshanarn@naukri.com";
		String uname=actualuname.getAttribute("value");
		System.out.println("username is :" +uname);
		if(expectednamefield.equals(uname))
		{
			System.out.println("Test case Passed : username as expected");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
