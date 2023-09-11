package com.jenkins.Jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginObject {
 
	  @FindBy(name="username") 
	  public static WebElement username; 
	  @FindBy(name="password")
	  public static WebElement password; 
	  @FindBy(xpath="//button[@type='submit']") 
	  public static WebElement btnLogin;
	  @FindBy(xpath="//img[@alt=\"profile picture\"]")
	  public static WebElement btnProfile;
	  @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	  public static WebElement btnLogout;
}
