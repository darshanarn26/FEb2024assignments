package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Table {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//WebElement tablecustomers=driver.findElement(By.xpath("//table[@id='customers']"));
		//System.out.println(tablecustomers.getText());
		
		
		//print a specific data
		
		WebElement place=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		System.out.println(place.getText());
		
		
		//print all the datas from the table
		
		/*List<WebElement> tabledata=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		for(WebElement element : tabledata)
		{
			System.out.println(element.getText());
		}
		*/
		findtableelements("Germany");
		findelements(5,1);
		findtablelements(2,3,"Germany");

	}
	
	//checking the given value is present in a table
	
	static void findtableelements(String findelement)
	{
		List<WebElement>  tabledata=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		for(WebElement element : tabledata)
		{
			if(element.getText().equalsIgnoreCase(findelement))
			{
				System.out.println("Expected element is present");
			}
		}
	}
	
	//finding elements using inndexes
	
	static void findelements(int rowid,int colid)
	{
		WebElement data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+rowid+"]/td["+colid+"]"));
		System.out.println(data.getText());
	}
	
	static void findtablelements(int rowid,int colid,String expectedtext)
	{
		WebElement actualtext=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+rowid+"]/td["+colid+"]"));
		if(actualtext.getText().equalsIgnoreCase(expectedtext))
		{
			System.out.println("Expected string is in the row "+ rowid +" and in the column "+ colid);
		}
		
	}

}
