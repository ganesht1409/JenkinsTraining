package com.jenkins.Jenkins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGListner1.class)
public class TestNGListner {
	WebDriver driver;
  @Test
  public void f() {
	  //Search selenium
      driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium",Keys.ENTER);
      //Assert Titles
 	  Assert.assertEquals(driver.getTitle(),"Selenium - Google Search");
  }
  
  @Test
  public void f2() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.navigate().back();

  }
  @BeforeMethod
  public void beforeMethod() {
	  //creating instance of chromedriver
     driver=new ChromeDriver();
      //opening bing.com
      driver.get("https://www.google.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
