package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumxpath {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		loginApplication();
		home();
		name();
		radiobut();
		dropdown();
		mouseover();
		//alert();
		windowtab();

	}
	
	static void loginApplication() throws InterruptedException
	{
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://selenium-prd.firebaseapp.com/");
		  driver.manage().window().maximize();
		  
		  WebElement email=driver.findElement(By.id("email_field"));
		  email.sendKeys("admin123@gmail.com");
		  
		  WebElement password=driver.findElement(By.id("password_field"));
		  password.sendKeys("admin123");
		  
		  WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login to')]"));
		  login.click();
		  Thread.sleep(2000);
		  
	}
	
	static void home() throws InterruptedException
	{
		WebElement home=driver.findElement(By.xpath("//a[@href='./home.html']"));
		home.click();
		Thread.sleep(3000);
	}
	
	static void name() throws InterruptedException
	{
		WebElement name=driver.findElement(By.xpath("//label[text()='Name']"));
		System.out.println(name.getText());
		
		WebElement yourname=driver.findElement(By.id("name"));
		yourname.sendKeys("Darshana");
		Thread.sleep(3000);
	}
	
	static void radiobut() throws InterruptedException
	{
		WebElement radiobut=driver.findElement(By.xpath("//input[@value='female']"));
		radiobut.click();
		Thread.sleep(3000);
	}
	
	static void dropdown() throws InterruptedException
	{
		WebElement city=driver.findElement(By.id("city"));
		Select cities=new Select(city);
		cities.selectByVisibleText("GOA");
		
		WebElement course=driver.findElement(By.id("course"));
		Select courses=new Select(course);
		courses.selectByValue("mca");
		Thread.sleep(3000);
	}
	
	static void mouseover() throws InterruptedException
	{
		WebElement switchto=driver.findElement(By.className("dropbtn"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(switchto).build().perform();
		Thread.sleep(2000);
		
	}
	
	static void alert() throws InterruptedException
	{
		WebElement alert=driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		alert.click();
		
		Thread.sleep(2000);
		WebElement windowalert=driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowalert.click();
		
		Thread.sleep(2000);
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		WebElement promptalert=driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		promptalert.click();
		
		//driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Darshana");
		driver.switchTo().alert().accept();
			
		//Thread.sleep(2000);
		
		
	}
	
	static void windowtab() throws InterruptedException
	{
		WebElement windowtab=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		windowtab.click();
		Thread.sleep(2000);
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		System.out.println(parentwindow);
		WebElement tab=driver.findElement(By.xpath("//button[contains(text(),'Tab')]"));
		tab.click();
		
		for(String handle:driver.getWindowHandles())
		{
			System.out.println(handle);
			driver.switchTo().window(handle);
			
		}
		System.out.println(driver.getTitle());
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		
	}
	

}
