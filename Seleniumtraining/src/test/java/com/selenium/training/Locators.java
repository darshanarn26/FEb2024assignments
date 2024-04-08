package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
			
		driver.get("https://www.facebook.com/");
	    WebElement email=driver.findElement(By.id("email"));
	    email.sendKeys("abcd@yahoo.co.in");
	    
	    WebElement password=driver.findElement(By.id("pass"));
	   password.sendKeys("1234");
		
	    //WebElement login= driver.findElement(By.name("login"));
	    //login.click();
	  
	   WebElement login= driver.findElement(By.xpath("//button[@name='login']"));
	   login.click();
	   
	   Thread.sleep(4000);

	   WebElement clickpicture=driver.findElement(By.xpath("//div[@class='_8e4l mbl _6o _6s _mf']"));
	   String str=clickpicture.getText();
	   System.out.println(str);
	   
	
	    
	    

	}

}
