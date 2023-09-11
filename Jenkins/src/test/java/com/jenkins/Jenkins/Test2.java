package com.jenkins.Jenkins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
  @Test
  public void f() {
      driver=new ChromeDriver();
      
      //opening bing.com
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      
      //Object of Explicit wait
      //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
      
      //Search selenium
      driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium",Keys.ENTER);
	  
      //Assert Titles
 	  Assert.assertEquals(driver.getTitle(),"Selenium - Google Search");
 	 
  }
}
