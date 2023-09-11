package com.jenkins.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
 
public class Homepage1 {
	WebDriver driver;
	By admintab = By.xpath("//span[text()='Admin']");
	By PIMtab = By.xpath("//span[text()='PIM']");
	By Leavetab = By.xpath("//span[text()='Leave']");
	
	public Homepage1(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void clickadmintab() {
		driver.findElement(admintab).click();
	}
	public void clickPIMtab() {
		driver.findElement(PIMtab).click();
	}
	public void clickLeavetab() {
		driver.findElement(Leavetab).click();
	}
	

}