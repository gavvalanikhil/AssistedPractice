package com.service;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTest {
  @Test
  public void f1() {
	  System.out.println("first method sample test");
  }

@Test
public void f2() {
	System.out.println("second method sample test");
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("before method - second class");
}

@AfterMethod
public void afterMethod() {
	System.out.println("after method - second class");
}
@BeforeClass
public void beforeclass() {
	System.out.println("before class - second class");
}
@AfterClass
public void afterclass() {
	System.out.println("after class - second class");
}
}

