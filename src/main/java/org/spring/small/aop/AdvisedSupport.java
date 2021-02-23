package org.spring.small.aop;


import lombok.Getter;
import lombok.Setter;
import org.aopalliance.intercept.MethodInterceptor;

@Getter
@Setter
public class AdvisedSupport {

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;
}
