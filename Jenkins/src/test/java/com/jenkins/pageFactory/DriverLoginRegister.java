package com.jenkins.pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DriverLoginRegister {
	WebDriver driver;
	Login objLogin;
	Register objRegister;
	@Test
	public void f() {
//		objRegister=new Register(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		objRegister.performRegisterAction("Ganesh","Tambe","xyz@1234.com","Ganesh@123","Ganesh@123");
		
		objLogin=new Login(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		objLogin.performLoginAction("xyz@1234.com", "Ganesh@123");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
