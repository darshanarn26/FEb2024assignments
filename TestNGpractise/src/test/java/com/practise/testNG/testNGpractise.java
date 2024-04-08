package com.practise.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNGpractise 
{
	WebDriver driver;
  
	 @BeforeMethod
		 
	 public void beforemethod()
	 {
		 if(driver==null)
		 
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 
	 }
	 @Test(priority=2)
	 
	 public void login()
	 {
		 
		 WebElement id=driver.findElement(By.id("username"));
		 id.sendKeys("darshanarn@naukri.com");
	 }
	 
	 @Test(priority=1)
	 public void withoutusername()
	 {
		 
		 WebElement id=driver.findElement(By.id("idcard-identity"));
	 }
	 
	 @AfterMethod
	 public void aftermethod()
	 {
		 driver.close();
		 driver=null;
	 }
	
}
