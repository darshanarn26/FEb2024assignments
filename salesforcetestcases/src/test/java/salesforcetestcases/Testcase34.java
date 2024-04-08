package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase34 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		checkedit();
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
	
	static void checkedit() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement hometab=driver.findElement(By.xpath("//a[@title='Home Tab']"));
		hometab.click();
		
		Thread.sleep(2000);
		WebElement namelink=driver.findElement(By.xpath("//a[@href='/_ui/core/userprofile/UserProfilePage' and contains(text(),'Darshana ABCD')]"));
		namelink.click();
		
		Thread.sleep(2000);
		WebElement editprofile=driver.findElement(By.xpath("//img[@src='/img/func_icons/util/pencil12.gif']"));
		editprofile.click();
		
		WebElement iframe=driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(iframe);
		
		Thread.sleep(2000);
		WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		about.click();
		
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.clear();
		lastname.sendKeys("ABCD");
		
		Thread.sleep(2000);
		WebElement saveall=driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
		
		Thread.sleep(2000);
		/*WebElement topleftcorner=driver.findElement(By.xpath("//span[@class='tailNode cxTailNode']"));
		String strname=topleftcorner.getText();
		System.out.println(strname);
		WebElement usermenuname=driver.findElement(By.id("userNavLabel"));
		String usermenulabel=usermenuname.getText();
		System.out.println(usermenulabel);
		*/
		String pagesrc=driver.getPageSource();
		
		
		String expectedname="Darshana ABCD";
		
		if(pagesrc.contains(expectedname))
		{
			System.out.println("Test case passed : Name displayed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}

}
