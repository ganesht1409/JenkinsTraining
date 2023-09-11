package com.jenkins.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Loginpage1 {
	WebDriver driver;
 By username=By.name("username");
 By password=By.name("password");
 By loginbtn=By.xpath("//button[@type='submit']");
 
 public Loginpage1(WebDriver driver)
 {
	 this.driver=driver;
 }


public void setUsername(String uname) {
	driver.findElement(username).sendKeys(uname);
}



public void setPassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
}

public void clickloginbtn()
{
	driver.findElement(loginbtn).click();
}

void performLoginAction(String uname,String pwd)
{
	this.setUsername(uname);
	this.setPassword(pwd);
	this.clickloginbtn();
}
}
