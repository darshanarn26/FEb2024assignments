package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	
	WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
    driver.switchTo().frame(iframe);
    
    WebElement srcimage=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
    
    WebElement target=driver.findElement(By.id("trash"));
    
    Thread.sleep(2000);
    Actions action=new Actions(driver);
    action.dragAndDrop(srcimage, target).build().perform();
	}

}
