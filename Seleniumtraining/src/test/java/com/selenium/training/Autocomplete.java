package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
		WebElement widget=driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		Actions action=new Actions(driver);
		action.moveToElement(widget).build().perform();
		
		WebElement autocomplete=driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"));
		autocomplete.click();
		
		/*WebElement country=driver.findElement(By.id("myInput"));
		country.sendKeys("i");
		
		Thread.sleep(2000);
        List<WebElement> countries=driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
        for(WebElement countrylist : countries)
        {
        	System.out.println(countrylist.getText());
        	if(countrylist.getText().equalsIgnoreCase("India"))
        	{
        		countrylist.click();
        	}
        	
        }*/
		
		autocompletetest("i","India");
        
	}
	
	static void autocompletetest(String inputstr,String country) throws InterruptedException
	{
		WebElement countrynew=driver.findElement(By.id("myInput"));
		countrynew.sendKeys(inputstr);
		
		Thread.sleep(2000);
		List<WebElement> countryval=driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
		for(WebElement element : countryval)
		{
			if(element.getText().equalsIgnoreCase(country))
			{
				element.click();
				break;
			}
		}
	}

}
