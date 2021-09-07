package com.ajith.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.ajith.aopdemo.dao.*.*(..))")
	private void forDaopackage(){}
	
	@Before("forDaopackage()")
	public void beforeAddAccountAdvice(){
		System.out.println("\n=====>>> Execution @Before advice on method()");
	}
	@Before("forDaopackage()")
	public void performapiAnalytics(){
		System.out.println("\n=====>>> Performing API Analytics()");
	}
}
