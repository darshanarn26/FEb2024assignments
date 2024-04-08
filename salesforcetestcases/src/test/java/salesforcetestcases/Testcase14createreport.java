package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase14createreport {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		createreport();
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

	static void createreport() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		accounts.click();
		
		WebElement accountsactivity=driver.findElement(By.xpath("//a[contains(text(),'Accounts with')]"));
		accountsactivity.click();
		
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.id("ext-comp-1042"));
		from.sendKeys("2/24/2024");
		
		WebElement to=driver.findElement(By.id("ext-comp-1045"));
		to.sendKeys("");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.id("saveReportBtn"));
		save.click();
		
		Thread.sleep(2000);
		WebElement reportname=driver.findElement(By.id("saveReportDlg_reportNameField"));
		reportname.sendKeys("newreportsadded");
		//String reportname1=reportname.getText();
		WebElement uniquename=driver.findElement(By.id("saveReportDlg_DeveloperName"));
		uniquename.sendKeys("");
		
		Thread.sleep(2000);
		WebElement saveandrun=driver.findElement(By.xpath("//button[@id='ext-gen281']"));
		saveandrun.click();
		
		Thread.sleep(2000);
		WebElement reportstab=driver.findElement(By.id("report_Tab"));
		boolean selected=reportstab.isDisplayed();
		if(selected)
		{
			System.out.println("Test case passed : Reports created");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}
}
