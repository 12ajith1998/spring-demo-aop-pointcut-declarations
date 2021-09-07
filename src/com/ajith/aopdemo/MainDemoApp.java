package com.ajith.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajith.aopdemo.dao.AccountDAO;
import com.ajith.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new 
				AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		MembershipDAO theMembershipDAO=context.getBean("membershipDAO",MembershipDAO.class);
		
		Account myAccount=new Account();
		theAccountDAO.addAccount(myAccount,true);
		theAccountDAO.dowork();
		
		theMembershipDAO.addsilly();
		theMembershipDAO.gotosleep();
		
		context.close();
		
	}
}

