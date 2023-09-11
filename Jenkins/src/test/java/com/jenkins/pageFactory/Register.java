package com.jenkins.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
  WebDriver driver;
  
  By registerbtn=By.linkText("Register");
  By Selctgender=By.id("gender-male");
  By EnterfirstName=By.name("FirstName");
  By EnterlastName=By.name("LastName");
  By Enteremail=By.name("Email");
  By Enterpassword=By.id("Password");
  By Confirmpwd=By.id("ConfirmPassword");
  By clickRegister=By.id("register-button");
  
  
  public Register(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void clickregisterbtn()
  {
	  driver.findElement(registerbtn).click();
  }
  
  public void clickgender()
  {
	  driver.findElement(Selctgender).click();
  }
  
  public void setFname(String fname)
  {
	  driver.findElement(EnterfirstName).sendKeys(fname);
  }
  
 
  public void setLname(String lname)
  {
	  driver.findElement(EnterlastName).sendKeys(lname);
  }
  
  public void setEmail(String email)
  {
	  driver.findElement(Enteremail).sendKeys(email);
  }
  
  
  public void setpassword(String pwd)
  {
	  driver.findElement(Enterpassword).sendKeys(pwd);
  }
  
  public void setConfpassword(String cpwd)
  {
	  driver.findElement(Confirmpwd).sendKeys(cpwd);
  }
  
  public void clickregister()
  {
	  driver.findElement(clickRegister).click();
  }
  
  void performRegisterAction(String fname,String lname,String email,String pwd,String cpwd)
  {
	this.clickregisterbtn();
  	this.clickgender();
  	this.setFname(fname);
  	this.setLname(lname);
  	this.setEmail(email);
  	this.setpassword(pwd);
  	this.setConfpassword(cpwd);
  	this.clickregister();
  }
  
}
