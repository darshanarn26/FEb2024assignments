package salesforcetestcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase13Merge {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		mergeaccounts();
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
	
	static void mergeaccounts() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		accounts.click();
		
		String beforemerge=driver.getCurrentUrl();
		Thread.sleep(2000);
		WebElement mergeaccounts=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		mergeaccounts.click();
		
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("srch"));
		search.sendKeys("Darshana");
		
		Thread.sleep(2000);
		WebElement findaccounts=driver.findElement(By.xpath("//input[@value='Find Accounts']"));
		findaccounts.click();
		
		Thread.sleep(2000);
		WebElement firstaccount=driver.findElement(By.id("cid1"));
		firstaccount.click();
		WebElement secondaccount=driver.findElement(By.id("cid2"));
		secondaccount.click();
		//WebElement thirdaccount=driver.findElement(By.id("cid2"));
		//thirdaccount.click();
		WebElement next=driver.findElement(By.cssSelector("input.btn"));
		next.click();
		
		
		Thread.sleep(2000);
		WebElement mergelink=driver.findElement(By.xpath("//input[@title='Merge']"));
		mergelink.click();
		
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement recentlyviewed=driver.findElement(By.id("hotlist_mode"));
		Select recent=new Select(recentlyviewed);
		recent.selectByVisibleText("Recently Viewed");
		String aftermerge=driver.getCurrentUrl();
		
		if(beforemerge.equals(aftermerge))
		{
			System.out.println("Test case passed : accounts merged");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}

}
