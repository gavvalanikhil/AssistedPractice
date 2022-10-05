package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OperationTest {
  @Test
  @Ignore        //@disable annotation in jUnit
  public void addTest() {
	  Operation op = new Operation();
	  int result = op.add(200,100);
	  assertEquals(result, 300);	  
  }
  
  @Test
  public void subTest() {
	  Operation op = new Operation();
	  int result = op.sub(200,50);
	  assertEquals(result, 150);
  }
  
  @Test
  public void mulTest() {
	  Operation op = new Operation();
	  int result = op.mul(200,50);
	  assertEquals(result, 10000);
  }
  
  @Test
  public void divTest() {
	  Operation op = new Operation();
	  int result = op.div(200,50);
	  assertEquals(result, 4);
  }
}
