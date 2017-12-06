package gupta.shanu.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect1 {
	
	@Before("execution(public String getName())")
	public void LoggingAdvice(){
		System.out.println("LoggingAdvice gets called");
	}
}
