package com.indra.SpringAOP.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
private static Logger logger=Logger.getLogger(LoggerAspect.class);

@Pointcut("execution(* com.indra.SpringAOP.*.*.*(..))")
private void generalPointcut() {
	logger.info("estoy en generalPointCut");
}

@AfterThrowing(pointcut="generalPointcut() throws Exception", throwing="ex")
public void exceptionLog(JoinPoint joinPoint, Exception ex) throws Exception {
	logger.info(joinPoint.getTarget().getClass().getSimpleName()+" : " + joinPoint.getSignature().getName()
			+ " : " + ex.getMessage());
	}

@Before("generalPointcut()")
public void infoLog(JoinPoint joinPoint) {
	logger.info("estoy en infoLog");
	logger.info(joinPoint.getTarget().getClass().getSimpleName()+" : " + joinPoint.getSignature().getName());
}

}

//https://www.youtube.com/watch?v=lTfK_hOBVJc