package com.ajith.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.ajith.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vip){
		System.out.println(getClass()+": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	public boolean dowork(){
		System.out.println(getClass()+" : doWork !");
		return false;
	}
}
