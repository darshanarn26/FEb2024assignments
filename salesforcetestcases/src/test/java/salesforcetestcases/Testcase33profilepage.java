package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase33profilepage {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		launch();
		checkpages();
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
	
	static void checkpages() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hometab=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		hometab.click();
		
		Thread.sleep(2000);
		WebElement namelink=driver.findElement(By.xpath("//a[@href='/_ui/core/userprofile/UserProfilePage' and contains(text(),'Darshana EFGH')]"));
		namelink.click();
		
		String namepagelink=driver.getCurrentUrl();
				
		Thread.sleep(2000);
		WebElement usernamefield=driver.findElement(By.id("userNavLabel"));
		usernamefield.click();
		
		Thread.sleep(2000);
		WebElement myprofile=driver.findElement(By.xpath("//a[@title='My Profile']"));
		myprofile.click();
		
		String myprofilelink=driver.getCurrentUrl();
		
		if(namepagelink.equals(myprofilelink))
		{
			System.out.println("Test case passed : same page displayed");
		}
		else
		{
			System.out.println("Test case failed ");
		}
	}

}
