package org.spring.small.aop;

public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();
}
