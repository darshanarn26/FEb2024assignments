package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4Aforgotpwd {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		Thread.sleep(2000);
		WebElement forgotpwd=driver.findElement(By.id("forgot_password_link"));
		forgotpwd.click();
		
		Thread.sleep(2000);
		WebElement uname=driver.findElement(By.id("un"));
		uname.sendKeys("darshanarn@naukri.com");
		
		Thread.sleep(2000);
		WebElement continues=driver.findElement(By.id("continue"));
		continues.click();
		
		Thread.sleep(2000);
		WebElement mailmessage=driver.findElement(By.id("forgotPassForm"));
		boolean isDisplayed=mailmessage.isDisplayed();
		if(isDisplayed)
		{
			System.out.println("Pass : mail sent");
		}
		else
		{
			System.out.println("Fail");
		}
		
		

	}

}
