package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calculator {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		calculators();
	}
	
	static void launch() throws InterruptedException
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
	
	static void calculators() throws InterruptedException
	{
		
		WebElement calc=driver.findElement(By.xpath("//a[contains(text(),'Calculator')]"));
		calc.click();
		Thread.sleep(2000);
		WebElement display=driver.findElement(By.id("display"));
		WebElement value1=driver.findElement(By.xpath("//input[@value='4']"));
		value1.click();
		WebElement operation=driver.findElement(By.xpath("//input[@value='x']"));
		operation.click();
		WebElement value2=driver.findElement(By.xpath("//input[@value='3']"));
		value2.click();
		WebElement equals=driver.findElement(By.xpath("//input[@value='=']"));
		equals.click();
		Thread.sleep(1000);
		String result=display.getAttribute("value");
		System.out.println(result);
	}

}