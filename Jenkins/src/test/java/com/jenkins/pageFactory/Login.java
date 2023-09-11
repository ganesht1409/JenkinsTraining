package com.jenkins.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver;

By loginbtn=By.linkText("Log in");
By Enteremail=By.name("Email");
By Enterpassword=By.name("Password");
By login=By.xpath("//input[@value=\"Log in\"]");

public Login(WebDriver driver)
{
	this.driver=driver;
}

public void setUsername(String email ) {
	driver.findElement(Enteremail).sendKeys(email);
}



public void setPassword(String pwd) {
	driver.findElement(Enterpassword).sendKeys(pwd);
}

public void clickloginbtn()
{
	driver.findElement(loginbtn).click();
}

public void clicklogin()
{
	driver.findElement(login).click();
}

void performLoginAction(String email,String pwd)
{
	this.clickloginbtn();
	this.setUsername(email);
	this.setPassword(pwd);
	this.clicklogin();
}


}
