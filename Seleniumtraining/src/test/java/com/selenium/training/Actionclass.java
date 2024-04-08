package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{

		launchApp(); 
		login();
		//mouseover();
		//doubleclick();
		tooltip();
		

	}
	
	static void launchApp()
	{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://selenium-prd.firebaseapp.com/");
		 
				 
	}
	
	static void login() throws InterruptedException
	{
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
		
	}
	
	static void mouseover() throws InterruptedException
	{
		WebElement mouseover=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		Actions action=new Actions(driver);
		action.moveToElement(mouseover).build().perform();
		
		//double click
		
		WebElement doubleclick=driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"));
		doubleclick.click();
		
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
				
		WebElement singleclick=driver.findElement(By.xpath("//button[contains(text(),'single Click')]"));
		singleclick.click();
		
	}
	
	static void doubleclick() throws InterruptedException
	{
		WebElement intractions=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		Actions action=new Actions(driver);
		action.moveToElement(intractions).build().perform();
		
		Thread.sleep(1000);
		
		WebElement doubleclick=driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"));
		doubleclick.click();
		
		WebElement intraction=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(intraction).build().perform();
		
		Thread.sleep(2000);
		
		WebElement doubleclicks=driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"));
		doubleclicks.click();
		
		WebElement singleclick=driver.findElement(By.xpath("//button[contains(text(),'single Click')]"));
		singleclick.click();
		
		Thread.sleep(2000);
		WebElement doubles=driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		Actions actiones=new Actions(driver);
		actiones.doubleClick(doubles).build().perform();
	}
	
	static void tooltip() throws InterruptedException
	{
		WebElement intraction=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		Actions action=new Actions(driver);
		action.moveToElement(intraction).build().perform();
		
		Thread.sleep(2000);
		
		WebElement tooltip=driver.findElement(By.xpath("//a[contains(text(),'Tool')]"));
		tooltip.click();
		
		WebElement right=driver.findElement(By.className("tooltipr"));
		Actions action1=new Actions(driver);
		action1.moveToElement(right).build().perform();
		
		Thread.sleep(2000);
		
		WebElement righttext=driver.findElement(By.className("tooltiptextr"));
		String str=righttext.getText();
		System.out.println(str);
		
	}
	

}
