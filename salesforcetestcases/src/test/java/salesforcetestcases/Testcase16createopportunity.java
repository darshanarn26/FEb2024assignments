package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase16createopportunity {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		createopportunity();
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
	
	static void createopportunity() throws InterruptedException
	{
		WebElement opportunity=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunity.click();
		
		Thread.sleep(2000);
		WebElement newooportunity=driver.findElement(By.xpath("//input[@value=' New ']"));
		newooportunity.click();
		
		Thread.sleep(2000);
		WebElement opporname=driver.findElement(By.id("opp3"));
		opporname.sendKeys("abc_123");
		
		Thread.sleep(2000);
		WebElement accountname=driver.findElement(By.id("opp4"));
		accountname.sendKeys("Darshana123");
		
		Thread.sleep(2000);
		WebElement stage=driver.findElement(By.id("opp11"));
		Select stageval=new Select(stage);
		stageval.selectByVisibleText("Qualification");
		
		Thread.sleep(2000);
		WebElement probability=driver.findElement(By.id("opp12"));
		probability.sendKeys("");
		
		Thread.sleep(2000);
		WebElement leadsource=driver.findElement(By.id("opp6"));
		Select lead=new Select(leadsource);
		lead.selectByVisibleText("Other");
		
		Thread.sleep(2000);
		//WebElement primarysource=driver.findElement(By.id("opp17"));
		//primarysource.sendKeys("Darshana Nishanth");
		
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.id("opp9"));
		date.sendKeys("3/16/2024");
		
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		save.click();
		
		Thread.sleep(2000);
		WebElement newopportunity=driver.findElement(By.id("Opportunity_Tab"));
		boolean selected=newopportunity.isDisplayed();
		if(selected)
		{
			System.out.println("Test case passed : New opportunity created");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}
	

}
