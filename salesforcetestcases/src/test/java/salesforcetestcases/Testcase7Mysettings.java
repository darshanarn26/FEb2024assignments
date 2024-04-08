package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase7Mysettings {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
      login();
      usermenu();
      displayandlayout();
      email();
      calenderandreminders();
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
	 static void usermenu() throws InterruptedException
	 {
		    Thread.sleep(2000);
			WebElement usermenu=driver.findElement(By.id("userNavButton"));
			usermenu.click();
			
			WebElement mysettings=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
			mysettings.click();
			
			Thread.sleep(2000);
			WebElement personallink=driver.findElement(By.id("PersonalInfo_font"));
			personallink.click();
			
			WebElement loginhistory=driver.findElement(By.id("LoginHistory_font"));
			loginhistory.click();
			
			Thread.sleep(2000);
			WebElement downloadlogin=driver.findElement(By.xpath("//a[@href='/servlet/servlet.LoginHistory?id=005aj000002HDyz']"));
			downloadlogin.click();
	 }
	 
	 static void displayandlayout() throws InterruptedException
	 {
		 WebElement displayandlayout=driver.findElement(By.id("DisplayAndLayout_font"));
		 displayandlayout.click();
		 
		 Thread.sleep(2000);
		 
		 WebElement customizetabs=driver.findElement(By.id("CustomizeTabs_font"));
		 customizetabs.click();
		 
		 Thread.sleep(2000);
		 WebElement customapp=driver.findElement(By.id("p4"));
		 Select content=new Select(customapp);
		 content.selectByVisibleText("Salesforce Chatter");
		 
		 Thread.sleep(2000);
		 WebElement reportstab=driver.findElement(By.id("duel_select_0"));
		 Select reports=new Select(reportstab);
		 reports.selectByValue("report");
		 
		 WebElement add=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		 add.click();
		 Thread.sleep(2000);
		 
		 WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		 save.click();
		 
		 Thread.sleep(2000);
		 WebElement saleschatter=driver.findElement(By.id("tsidLabel"));
		 saleschatter.click();
		 
	 }
	 static void email() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 WebElement emaillink=driver.findElement(By.id("EmailSetup_font"));
		 emaillink.click();
		 
		 Thread.sleep(2000);
		 WebElement emailsettings=driver.findElement(By.id("EmailSettings_font"));
		 emailsettings.click();
		 
		 Thread.sleep(2000);
		 WebElement emailname=driver.findElement(By.id("sender_name"));
		 emailname.clear();
		 emailname.sendKeys("Darshana");
		 
		 Thread.sleep(2000);
		 WebElement emailaddress=driver.findElement(By.id("sender_email"));
		 emailaddress.clear();
		 emailaddress.sendKeys("darshanarn26@gmail.com");
		 
		 Thread.sleep(2000);
		 WebElement autobutton=driver.findElement(By.id("auto_bcc1"));
		 autobutton.click();
		 
		 WebElement save=driver.findElement(By.xpath("//input[@class='btn primary']"));
		 save.click();
	 }
	 
	 static void calenderandreminders() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 WebElement calenderlink=driver.findElement(By.id("CalendarAndReminders_font"));
		 calenderlink.click();
		 
		 Thread.sleep(2000);
		 WebElement activityreminder=driver.findElement(By.id("Reminders_font"));
		 activityreminder.click();
		 
		 Thread.sleep(2000);
		 WebElement opentestreminder=driver.findElement(By.id("testbtn"));
		 opentestreminder.click();
		 boolean popupdisplay=opentestreminder.isDisplayed();
		 if(popupdisplay)
		 {
			 System.out.println("Test case passed : Pop up displayed");
		 }
		 else
		 {
			 System.out.println("Test case failed");
		 }
	 }

}
