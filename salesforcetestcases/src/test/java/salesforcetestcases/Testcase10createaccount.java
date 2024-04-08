package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase10createaccount {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		login();
		accounts();
		newpage();
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
     
	static void accounts() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		accounts.click();
		
		Thread.sleep(2000);
		WebElement newbutton=driver.findElement(By.xpath("//input[@title='New']"));
		newbutton.click();
		
		Thread.sleep(2000);
		WebElement accountname=driver.findElement(By.id("acc2"));
		accountname.sendKeys("DarshanaABCD");
		
		Thread.sleep(2000);
		WebElement accounttype=driver.findElement(By.id("acc6"));
		Select acctype=new Select(accounttype);
		acctype.selectByVisibleText("Technology Partner");
		
		Thread.sleep(2000);
		WebElement customerpriority=driver.findElement(By.id("00Naj0000011vs7"));
		Select priority=new Select(customerpriority);
		priority.selectByValue("High");
		
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.cssSelector("input.btn"));
		save.click();
	}
	
	static void newpage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement topname=driver.findElement(By.xpath("//h2[contains(text(),'DarshanaABCD')]"));
		String newaccountname=topname.getText();
		String expectedname="DarshanaABCD";
		if(expectedname.equals(newaccountname))
		{
			System.out.println("Test case Passed : New page displayed");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}

}
