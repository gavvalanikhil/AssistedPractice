package com.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

 


public class RegisterTest {
    WebDriver edge;
      @Test(priority = 1)
      //this is for registration
      public void register() {
          
          edge.get("http://automationpractice.com/index.php");
          WebElement registerbtn= edge.findElement(By.className("login"));
          registerbtn.click();
          WebElement email= edge.findElement(By.id("email_create"));
          email.sendKeys("gavvalanikhil1@gmail.com");
          WebElement create= edge.findElement(By.id("SubmitCreate"));
          create.click();
          
          edge.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          
          
          WebElement title = edge.findElement(By.cssSelector("label[for='id_gender1']"));
          title.click();
          
          WebElement firstName = edge.findElement(By.id("customer_firstname"));
          firstName.sendKeys("nikhil");
          WebElement lastName = edge.findElement(By.id("customer_lastname"));
          lastName.sendKeys("gavvala");
          WebElement password = edge.findElement(By.id("passwd"));
          password.sendKeys("nikhil@13");
          
          Select day= new Select(edge.findElement(By.id("days")));
          day.selectByValue("18");
          Select month= new Select(edge.findElement(By.id("months")));
          month.selectByValue("8");
          Select year= new Select(edge.findElement(By.id("years")));
          year.selectByValue("2001");
          
          WebElement add = edge.findElement(By.id("address1"));
          add.sendKeys("Sastra university");
          WebElement city = edge.findElement(By.id("city"));
          city.sendKeys("thanjavur");
          
          Select state= new Select(edge.findElement(By.id("id_state")));
          state.selectByValue("14");
          
          WebElement postcode = edge.findElement(By.id("postcode"));
          postcode.sendKeys("510061");
          WebElement phno = edge.findElement(By.id("phone_mobile"));
          phno.sendKeys("8500358962");
          
          WebElement acsubmit = edge.findElement(By.id("submitAccount"));
          acsubmit.click();
    
    
          }
      
      //this is for login
          @Test(priority = 2)
      public void login()
      {
              edge.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
               edge.get("http://automationpractice.com/index.php");
              WebElement btn= edge.findElement(By.className("login"));
              btn.click();
              
              WebElement email= edge.findElement(By.id("email"));
              email.sendKeys("gavvalanikhil1@gmail.com");
              
              WebElement password= edge.findElement(By.id("passwd"));
              password.sendKeys("nikhil@13");
              
              WebElement login= edge.findElement(By.id("SubmitLogin"));
              login.click();
              //System.out.println(chrome.getCurrentUrl());
              assertEquals(edge.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication","Invalid credentials");
                        
      }
          //this is to search
          @Test(priority = 3)
          public void search()
          {
              edge.findElement(By.id("search_query_top")).sendKeys("shirt");
              edge.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              edge.findElement(By.name("submit_search")).click();
          }
          //this is add to cart method
          @Test(priority = 4)
          public void addToCart()
          
          {
              
              
              edge.get("http://automationpractice.com/index.php?id_product=2&controller=product");
              edge.findElement(By.name("Submit")).click();

 

          }
      //before executing methods it will wait for 5 seconds
      @BeforeMethod
      public void beforeMethod() {
          edge.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      }
      //before running the test class this method will run and set the property path of chrome driver
      @BeforeClass
      public void beforeClass() {
          System.setProperty("webdriver.edge.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\HP\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\PracticeProject\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\phase 5 practice projects\\\\\\\\\\\\\\\\msedgedriver.exe");
          edge = new EdgeDriver();
          edge.manage().window().maximize();
      }
      
}
 