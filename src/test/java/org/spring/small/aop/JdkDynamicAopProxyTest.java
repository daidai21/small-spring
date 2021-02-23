package org.spring.small.aop;

import org.junit.Test;
import org.spring.small.HelloWorldService;
import org.spring.small.HelloWorldServiceImpl;
import org.spring.small.context.ApplicationContext;
import org.spring.small.context.ClassPathXmlApplicationContext;

public class JdkDynamicAopProxyTest {
    @Test
    public void testInterceptor() throws Exception {
        // ***** helloWorldService without AOP *****
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("small-ioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("HelloWorldService");
        helloWorldService.helloWorld();

        // ***** helloWorldService with AOP *****
        // 1. 设置被代理对象(Joinpoint)
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloWorldService, HelloWorldService.class);
        advisedSupport.setTargetSource(targetSource);

        // 2. 设置拦截器(Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        // 3. 创建代理(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloWorldService helloWorldServiceProxy = (HelloWorldService) jdkDynamicAopProxy.getProxy();

        // 4. 基于AOP的调用
        helloWorldService.helloWorld();
    }
}
