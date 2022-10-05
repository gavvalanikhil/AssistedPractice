package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\PracticeProject\\src\\phase 5 practice projects\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("file:///C:/Users/HP/eclipse-workspace/PracticeProject/src/phase%205%20practice%20projects/selenium%20programs/index.html"); //load static or dynamic web page
		//wd.get("http://127.0.0.1:5500/index.html");
//		String titleTagContent = wd.getTitle();
//		String url = wd.getCurrentUrl();
//		String pageContent = wd.getPageSource();
//		System.out.println(titleTagContent);
//		System.out.println(url);
//		System.out.println(pageContent);
		WebElement h2TagRef =  wd.findElement(By.tagName("h2"));
		WebElement pTagRef =  wd.findElement(By.tagName("p"));
		WebElement divTagRef =  wd.findElement(By.tagName("div"));
		
		System.out.println(h2TagRef.getTagName()+" = "+h2TagRef.getText());
		System.out.println(pTagRef.getTagName()+" = "+pTagRef.getText());
		System.out.println(divTagRef.getTagName()+" = "+divTagRef.getText());
		List<WebElement> listOfPTag = wd.findElements(By.tagName("p"));
		Iterator<WebElement> ii = listOfPTag.iterator();
		while(ii.hasNext()) {
			WebElement ww = ii.next();
			System.out.println(ww.getTagName()+" "+ww.getText());
		}
		WebElement divTagUsingIdRef = wd.findElement(By.id("d1"));
		System.out.println(divTagUsingIdRef.getTagName()+" "+divTagUsingIdRef.getText());
		wd.close();
	}

}
