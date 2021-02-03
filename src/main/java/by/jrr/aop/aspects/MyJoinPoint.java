package by.jrr.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MyJoinPoint {

    Logger log = LoggerFactory.getLogger("Logging");

    @Pointcut("execution(* by.jrr.aop.service.*.*(..))")
    public void serviceExecution() {

    }
}
