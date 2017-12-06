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

@Aspect
public class LoggingAspect4 {
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint jointPoint){
		//System.out.println(jointPoint.toLongString());
		//System.out.println(jointPoint.getTarget());
	}
	
	//@After("args(name)")
	@AfterReturning(pointcut="args(name)",returning="returnValue")
	public void allMethodsHavingStringArgument(String name, String returnValue){
		System.out.println("allMethodsHavingStringArgument called having value: " + name);
		System.out.println("Return value: "+ returnValue);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void allMethodsThrowingException(String name,Exception ex){
		System.out.println("allMethodsThrowingException called having value: " + name);
		System.out.println("Exception is: " + ex);
	}
	
	//@Around("allGetters()")
	@Around("@annotation(gupta.shanu.annotations.Loggable)")
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
	
	@Pointcut("execution(public * *.get*())")
	public void allGetters(){}
	
	@Pointcut("within(gupta.shanu.model.Circle)")
	public void allCircleMethods(){}
	
	@Pointcut("within(gupta.shanu.model..*)")
	public void allClassesMethodsWithinPackages() {}
}
