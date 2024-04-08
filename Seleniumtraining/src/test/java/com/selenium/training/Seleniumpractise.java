package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumpractise {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	
	{
		Loginapplication();
		home();
		Switches();
		intraction();
		dragDrop();
		

	}
	
	static void Loginapplication() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://selenium-prd.firebaseapp.com/");
	     
	     WebElement email=driver.findElement(By.id("email_field"));
	     email.sendKeys("admin123@gmail.com");
	     
	     WebElement password=driver.findElement(By.id("password_field"));
	     password.sendKeys("admin123");
	     
	     Thread.sleep(5000);
	     WebElement login=driver.findElement(By.xpath("//button[@onclick='login()']"));
	     login.click();
	     
	     Thread.sleep(4000);
	}
	
	
	static void home()
	{
		  WebElement home=driver.findElement(By.xpath("//a[@href='./home.html']"));
		     home.click();
	}
	
	static void Switches() throws InterruptedException
	{
		WebElement switchTo=driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action=new Actions(driver);
		action.moveToElement(switchTo).build().perform();
		Thread.sleep(2000);
	}
	
	static void intraction()
	{
		WebElement intractions=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		Actions action=new Actions(driver);
		action.moveToElement(intractions).build().perform();
		
	}
	
	static void dragDrop() throws InterruptedException
	{
		WebElement dragdrop=driver.findElement(By.xpath("//a[@href='./draganddrop.html']"));
		dragdrop.click();
		Thread.sleep(3000);
		WebElement drag=driver.findElement(By.xpath("//div[contains(text(),' Drop')]"));
		WebElement drop=driver.findElement(By.xpath("//div[contains(text(),' Drop')]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	
	}

}
