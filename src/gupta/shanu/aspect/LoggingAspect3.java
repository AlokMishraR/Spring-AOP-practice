package gupta.shanu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect3 {
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint jointPoint){
		System.out.println(jointPoint.toLongString());
		System.out.println(jointPoint.getTarget());
	}
	
/*	@Before("args(String)")
	public void allMethodsHavingStringArgument(){
		System.out.println("allMethodsHavingStringArgument called");
	}*/
	
	@Before("args(name)")
	public void allMethodsHavingStringArgument(String name){
		System.out.println("allMethodsHavingStringArgument called having value: " + name);
	}
	
	@Pointcut("execution(public * *.get*())")
	public void allGetters(){}
	
	@Pointcut("within(gupta.shanu.model.Circle)")
	public void allCircleMethods(){}
	
	@Pointcut("within(gupta.shanu.model..*)")
	public void allClassesMethodsWithinPackages() {}
}
