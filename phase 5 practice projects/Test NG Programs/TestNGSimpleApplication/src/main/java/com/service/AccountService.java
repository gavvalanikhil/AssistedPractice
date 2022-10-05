package com.service;

import com.bean.Account;
import com.dao.AccountDao;

public class AccountService {
	AccountDao ad = new AccountDao();
	public String createAccount(Account account) {
		/*
		 * We will DAO method and that method call db to create the account
		 */
		if(account.getAmount()<500) {
			return "Min amount must be 500";
		}
		else if(ad.createAccount(account)>0){
			return "Account created";
		}
		else {
			return "Account didnt create";
		}
	}
	
	public String findBalance(int accno) {
		/*
		 * 
		 * 
		 * 
		 */
		//return "your account balance is 5000";
		//return "Account number doesnt exist";
		float balanceAmount = ad.findBalance(accno);
		if(balanceAmount>=0) {
			return "Your account balance is "+balanceAmount;
			
		}if(balanceAmount==-1) {
			return "Account number doesnt exist";
		}else {
			return "Exception generated";
		}
	}
	
	public String withdrawn(Account account) {
		/*
		 * 
		 * 
		 * 
		 */
		//return "withdrawn successfully";
		//return "you cant withdraw";
		float balanceAmount = ad.findBalance(account.getAccno());
		if(balanceAmount - account.getAmount() > 500) {
			
			if(ad.withdrawn(account)>0) {
				return "Withdrawn done successfully";
			}else {
				return "Didnt withdraw"; 
			}
		}else {
			return "You cant withdraw you have to maintain min 500";
		}
	}
	
	public String deposit(Account account) {
		/*
		 * 
		 * 
		 * 
		 */
		//return "Deposited Successfully";
		//return "you cant deposit";
		if(account.getAmount()>500000) {
			return "You cant deposit 500000 at time";
			
		}else if(ad.deposit(account)>0){
			return "Deposit done successfully";
		}else {
			return "Didnt deposit";
		}
	}

}
