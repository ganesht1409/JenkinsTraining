package com.jenkins.Jenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class POMOLogin {
	 WebDriver driver;
	 Loginpage1 objlogin;
	 Homepage1 objHome;
  @Test
  public void f() {
	  objlogin = new Loginpage1(driver);
	  objlogin.performLoginAction("Admin","admin123");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  objHome = new Homepage1(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  objHome.clickadmintab();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

}
