package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay3 {

	public static void main(String[] args) throws InterruptedException 
	{

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://selenium-prd.firebaseapp.com/");
     
     WebElement email=driver.findElement(By.id("email_field"));
     email.sendKeys("admin123@gmail.com");
     
     WebElement password=driver.findElement(By.id("password_field"));
     password.sendKeys("admin123");
     
     Thread.sleep(5000);
     WebElement login=driver.findElement(By.xpath("//button[@onclick='login()']"));
     login.click();
     
     Thread.sleep(4000);
     
     WebElement home=driver.findElement(By.xpath("//a[@href='./home.html']"));
     home.click();
     
        
     WebElement name=driver.findElement(By.id("name"));
     name.sendKeys("Darshana");
     
     Thread.sleep(3000);
     
     WebElement label=driver.findElement(By.xpath("//label[text()='Name']"));
     System.out.println(label.getText());
     
     WebElement city=driver.findElement(By.xpath("//label[contains(text(),'Cit')]"));
     System.out.println(city.getText());
     
     WebElement radiofemale=driver.findElement(By.xpath("//input[@value='female']"));
     radiofemale.click();
     
    // WebElement radiomale=driver.findElement(By.xpath("//input[@value='male']"));
    // radiomale.click();
     
     WebElement citynew=driver.findElement(By.id("city"));
     Select cities=new Select(citynew);
     cities.selectByVisibleText("GOA");
     
     WebElement course=driver.findElement(By.name("course"));
     Select courses=new Select(course);
     courses.selectByValue("bca");
     
     WebElement state=driver.findElement(By.id("state"));
     Select states=new Select(state);
     states.selectByIndex(4);
     

	}

}
