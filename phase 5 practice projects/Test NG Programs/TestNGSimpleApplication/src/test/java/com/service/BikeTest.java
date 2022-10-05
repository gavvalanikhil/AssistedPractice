package com.service;

import org.testng.annotations.Test;

public class BikeTest {
  @Test(groups = {"speed"})
  public void speed() {
	  System.out.println("bike speed testing");
  }
  
  @Test
  public void mileage() {
	  System.out.println("bike mileage testing");
  }
  @Test
  public void color() {
	  System.out.println("bike color testing");
  }
}
