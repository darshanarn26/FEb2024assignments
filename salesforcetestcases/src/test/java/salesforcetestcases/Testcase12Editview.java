package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase12Editview {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		editview();
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
	
	static void editview() throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		accounts.click();
		
		Thread.sleep(2000);
		WebElement viewdropdown=driver.findElement(By.id("fcf"));
		Select viewvalue=new Select(viewdropdown);
		viewvalue.selectByValue("00Baj000004wfbZ");
		
		String beforeedit=driver.getCurrentUrl();
		Thread.sleep(3000);
		WebElement edit=driver.findElement(By.xpath("//form[@id='filter_element']//a[contains(text(),'Edit')]"));
		edit.click();
		
		Thread.sleep(2000);
		WebElement changeviewname=driver.findElement(By.id("fname"));
		changeviewname.clear();
		changeviewname.sendKeys("EFG");
		
		
		Thread.sleep(2000);
		WebElement filterfield=driver.findElement(By.id("fcol1"));
		Select filter=new Select(filterfield);
		filter.selectByVisibleText("Account Name");
		
		Thread.sleep(2000);
		WebElement operator=driver.findElement(By.id("fop1"));
		Select containsvalue=new Select(operator);
		containsvalue.selectByValue("c");
		
		Thread.sleep(2000);
		WebElement value=driver.findElement(By.id("fval1"));
		value.sendKeys("a");
		
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.cssSelector("input.btn.primary"));
		save.click();
		String afteredit=driver.getCurrentUrl();
		if(!beforeedit.equals(afteredit))
		{
			System.out.println("Test case passed : New edited view created");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}
	

}
