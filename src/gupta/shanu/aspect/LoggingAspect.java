package gupta.shanu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAspect {
	
	public void loggingAdvice(){
		System.out.println("LoggingAdvice gets called");
	}
	
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJP){
		Object value = null;
		try {
			System.out.println("Before Advice");
			value = proceedingJP.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After throwing");
			e.printStackTrace();
		}
		System.out.println("After finally");
		return value;
	}
}
