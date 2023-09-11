package com.jenkins.Jenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithPageFactory {
	@Test
	public void Login1() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, LoginObject.class);
		Thread.sleep(7000);
		LoginObject.username.sendKeys("Admin");
		LoginObject.password.sendKeys("admin123");
		LoginObject.btnLogin.click(); // driver.quit()
		LoginObject.btnProfile.click(); 
		LoginObject.btnLogout.click(); 
	}
}