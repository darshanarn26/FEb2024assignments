package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase35Tab {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		launch();
		verifytab();
		logoutandverify();
		
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
	
	static void verifytab() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement tab=driver.findElement(By.xpath("//img[@title='All Tabs']"));
		tab.click();
		
		Thread.sleep(2000);
		WebElement customizetab=driver.findElement(By.xpath("//input[@class='btnImportant']"));
		customizetab.click();
		
		Thread.sleep(2000);
		WebElement removetab=driver.findElement(By.id("duel_select_1"));
		Select productstab=new Select(removetab);
		productstab.selectByVisibleText("Products");
		
		Thread.sleep(2000);
		WebElement remove=driver.findElement(By.xpath("//img[@title='Remove']"));
		remove.click();
		
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
	}
	
	static void logoutandverify() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement usermenu=driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		
		driver.switchTo().defaultContent();
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
		WebElement tab=driver.findElement(By.xpath("//img[@title='All Tabs']"));
		tab.click();
		
		Thread.sleep(2000);
		WebElement customizetab=driver.findElement(By.xpath("//input[@class='btnImportant']"));
		customizetab.click();
		
		Thread.sleep(2000);
		
		
		WebElement removetab=driver.findElement(By.id("duel_select_1"));
		Select productstab=new Select(removetab);
		productstab.selectByVisibleText("Products");
		
		
		
		
		
		
		}
		
		
	    	
		
		
		
	}


