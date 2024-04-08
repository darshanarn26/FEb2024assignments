package com.practise.testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGannotations 

  {
	WebDriver driver;
 @Test
 public void firsttest()
 {
	 System.out.println("I am in first test");
 }
 
 @Test
 @Parameters({"username"})
 
 public void test2(String username)
 {
	 System.out.println("I am in second test" + username);
 }
 

 
 @BeforeMethod
 public void beforemethod()
 {
	 System.out.println("I am in before method");
 }
 
 @BeforeTest
 public void beforetest()
 {
	 System.out.println("I am in beforetest");
 }
 
 @AfterMethod
 public void aftermethod()
 {
	System.out.println("I am in after method"); 
 }
 
 @AfterTest
 public void aftertest()
 {
	 System.out.println("I am in after test");
 }
 
 @BeforeSuite
 public void suite()
 {
	 System.out.println("I am in suite");
 }
 
 @AfterSuite
 public void aftersuite()
 {
	 System.out.println("I am in after suite");
 }
  }

