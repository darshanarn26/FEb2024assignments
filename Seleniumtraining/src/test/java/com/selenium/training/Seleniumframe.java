package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumframe {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		launchapp();

	}
	
	static void launchapp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		
		WebElement textdraw=driver.findElement(By.xpath("//div[contains(text(),'Draw a')]"));
		System.out.println(textdraw.getText());
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		
		WebElement item1=driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
		item1.click();
		
		Thread.sleep(2000);
		
		WebElement item2=driver.findElement(By.xpath("//li[contains(text(),'Item 2')]"));
		item2.click();
		
		
		
		
		
	}

}
