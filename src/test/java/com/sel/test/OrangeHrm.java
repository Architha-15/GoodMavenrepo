package com.sel.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.sel.uitls.ReadProperties;




public class OrangeHrm  {
	public static WebDriver driver = null;
	
	
	
	
	@Parameters("url")
	@Test(priority=1)
	public void launchApp(String url) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Annangi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		Thread.sleep(4000);
	}

	@Test(priority=2)
	public void clickOnOrangeDemo(){
       driver.findElement(By.xpath("//a[contains(text(),'Get a Free Demo')]")).click();
		
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() throws Exception{
	ArrayList<Object[]> testData =ReadProperties.readProperties();
	return testData.iterator();
	}
	
	
	
	
	@Test(priority=3,dataProvider="getTestData")
	public void orangeDemoRegPage(String firstname, String lastname, String email, String phonenumber,String country,String state) throws Exception{

		driver.findElement(By.xpath("//input[@id='Form_submitForm_FirstName']")).clear();
		driver.findElement(By.xpath("//input[@id='Form_submitForm_FirstName']")).sendKeys(firstname);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='Form_submitForm_LastName']")).clear();
		driver.findElement(By.xpath("//input[@id='Form_submitForm_LastName']")).sendKeys(lastname);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='Form_submitForm_Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Form_submitForm_Email']")).sendKeys(email);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='Form_submitForm_Contact']")).clear();
		driver.findElement(By.xpath("//input[@id='Form_submitForm_Contact']")).sendKeys(phonenumber);
		Thread.sleep(5000);
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']")));
		select.selectByVisibleText(country);
		Thread.sleep(5000);
		
		Select select1 = new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_State']")));
		select1.selectByVisibleText(state);
		Thread.sleep(5000);
		driver.close();
	}
	
	
		
		
		
		
		


	
	
	

}
