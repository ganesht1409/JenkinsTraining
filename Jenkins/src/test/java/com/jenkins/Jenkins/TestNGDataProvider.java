package com.jenkins.Jenkins;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import jxl.Workbook;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class TestNGDataProvider {
	@DataProvider(name="datapro")

    String[][] readExcel() throws BiffException, IOException

    {    
		//input stream object creation
        FileInputStream excel= new FileInputStream("C:\\Users\\gtambe\\Documents\\Data.xls");

        //getting workbook,sheet,rows and col
        Workbook workbook=Workbook.getWorkbook(excel);
        Sheet sheet=workbook.getSheet(0);
        int row_count=sheet.getRows();
        int col_count=sheet.getColumns();

        //create 2d array
        String[][] data1=new String[row_count-1][col_count];
        for(int i=1;i<row_count;i++)//row iteration
        {
            for(int j=0;j<col_count;j++)//column iteration
            {
            	data1[i-1][j]=sheet.getCell(j,i).getContents();//getcell(columns,row)
            }

         }
        return data1;  

      }    

    @Test(dataProvider="datapro")
    void LoginUsingJXL(String uname1,String pwd1) throws Exception
    {   
       WebDriver driver=new ChromeDriver();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        
      WebElement userName = driver.findElement(By.name("username"));
  	  WebElement password = driver.findElement(By.name("password"));
  	  userName.sendKeys(uname1);
  	  password.sendKeys(pwd1);
  	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
  	  login.click();
  	  
  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  	  Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  	
     }
}
