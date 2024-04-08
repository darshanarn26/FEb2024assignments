package salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase6myprofile {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
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
		
		Thread.sleep(2000);
		WebElement usermenu=driver.findElement(By.id("userNavButton"));
		usermenu.click();
		
		Thread.sleep(2000);
		WebElement myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		myprofile.click();
		
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
		lastname.sendKeys("EFGH");
		
		Thread.sleep(2000);
		WebElement saveall=driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement post=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
		post.click();
		
		
		Thread.sleep(2000);
		WebElement frames=driver.findElement(By.xpath("//iFrame[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(frames);
		
		WebElement shareupdate=driver.findElement(By.xpath("//body[contains(text(),'Share an update')]"));
		shareupdate.sendKeys("Hello everyone");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement share=driver.findElement(By.xpath("//input[@value='Share']"));
		share.click();
		
		Thread.sleep(2000);
		WebElement file=driver.findElement(By.id("publisherAttachContentPost"));
		file.click();
		
		WebElement uploadfile=driver.findElement(By.id("chatterUploadFileAction"));
		uploadfile.click();
		WebElement choosefile=driver.findElement(By.id("chatterFile"));
		choosefile.sendKeys("C:\\Users\\darsh\\Desktop\\Tekarch\\seletest.txt");
		WebElement sharefile=driver.findElement(By.xpath("//input[@value='Share']"));
		sharefile.click();
		
		
		WebElement moderator=driver.findElement(By.xpath("//div[@class='photoUploadSection']"));
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(moderator).build().perform();
		Thread.sleep(2000);
		WebElement updatepic=driver.findElement(By.id("uploadLink"));
		updatepic.click();
		
		WebElement frame3=driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(frame3);
		
		WebElement choosepic=driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		choosepic.sendKeys("C:\\Users\\darsh\\Pictures\\Screenshots\\Sales force manual test cases\\th.jpg");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame4=driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(frame4);
		WebElement upload=driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		upload.click();
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.id("j_id0:uploadFileForm:save"));
		save.click();
		
		//save the pic
		
		//WebElement croppedarea=driver.findElement(By.xpath("//div[@class='imgCrop_selArea']"));
		//croppedarea.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement savepic=driver.findElement(By.id("j_id0:j_id7:save"));
		savepic.click();
		
		

	}

}
