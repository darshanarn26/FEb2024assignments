package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		WebElement email= driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password= driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement fileupload=driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));
		fileupload.click();
		
		WebElement choosefile=driver.findElement(By.id("logo"));
		choosefile.sendKeys("C:\\Users\\darsh\\Desktop\\Tekarch\\seletest.txt");

	}

}
