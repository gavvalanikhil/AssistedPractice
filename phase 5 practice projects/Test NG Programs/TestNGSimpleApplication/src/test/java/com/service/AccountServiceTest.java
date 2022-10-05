package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.bean.Account;

public class AccountServiceTest {

  @Test
  @Ignore
  public void createAccountTest() {
   AccountService ac = new AccountService();
   Account acc1 = new Account(100,"Nikhil",400);
   String result1 = ac.createAccount(acc1);
   assertEquals(result1, "Min amount must be 500");
   
   
   Account acc2 = new Account(102,"sony",1200);
   String result2 = ac.createAccount(acc2);
   assertEquals(result2, "Account created");
   
   
//   Account acc3 = new Account(100,"gayi",10000);
//   String result3 = ac.createAccount(acc3);
//   assertEquals(result3, "Account didnt create");
   
   }
  
   
  

  @Test
  @Ignore
  public void depositTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
 @Ignore
  public void findBalanceTest() {
   // throw new RuntimeException("Test not implemented");
	  AccountService ac = new AccountService();
	  String balanceDetails1 = ac.findBalance(100);
	  String balanceDetails2 = ac.findBalance(102);
	  String balanceDetails3 = ac.findBalance(1000);
	  
	  assertEquals(balanceDetails1, "Your account balance is 700.0");
	  assertEquals(balanceDetails2, "Your account balance is 1200.0");
	  assertEquals(balanceDetails3, "Account number doesnt exist");
	  
	 
	  
  }

  @Test
 // @Ignore
  public void withdrawnTest() {
    throw new RuntimeException("Test not implemented");
  }
}
