package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\eclipse-workspace\\\\\\\\PracticeProject\\\\\\\\src\\\\\\\\phase 5 practice projects\\\\\\\\msedgedriver.exe");
       WebDriver driver = new EdgeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.com/");
        
        WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
        
        Actions a = new Actions(driver);
        
        a.moveToElement(e1).perform();

       driver.findElement(By.xpath("(//span[@class='nav-text'])[10]")).click();
       Thread.sleep(2000);
 
       driver.findElement(By.id("ap_email")).sendKeys("nikhillikhita@gmail.com");
       Thread.sleep(2000);
 
       driver.findElement(By.id("ap_password")).sendKeys("123456");
       Thread.sleep(2000);

       driver.findElement(By.id("signInSubmit")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//a[contains(text(),'Create a new Amazon account')]")).click();
       Thread.sleep(5000);
      
       driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("Gavvala NikhilLikitha");
       Thread.sleep(5000);
  
       driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("nikhillikhita@gmail.com");
       Thread.sleep(5000);

       driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("123456");
       Thread.sleep(3000);

       driver.findElement(By.xpath("(//input[@id='continue'])")).click();
       
       driver.close();
             
	}
}