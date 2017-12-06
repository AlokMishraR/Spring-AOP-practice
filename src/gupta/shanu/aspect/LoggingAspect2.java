package gupta.shanu.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect2 {
	//@Before("execution(public String gupta.shanu.model.Circle.getName())")
	//@Before("execution(public String gupta.shanu.model.Triangle.getName())")
	//@Before("execution(public * get*())")
	//@Before("execution(public * get*(*))")
	//@Before("execution(public * get*(..))")
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("LoggingAdvice gets called");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("secondAdvice gets called");
	}
	
	@Pointcut("execution(public * *.get*())")
	public void allGetters(){}
	
	@Pointcut("within(gupta.shanu.model.Circle)")
	public void allCircleMethods(){}
	
	@Pointcut("within(gupta.shanu.model..*)")
	public void allClassesMethodsWithinPackages() {}
}
