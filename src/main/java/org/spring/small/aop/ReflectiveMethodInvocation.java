package org.spring.small.aop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

@AllArgsConstructor
public class ReflectiveMethodInvocation implements MethodInvocation {

    private Object target;

    @Getter
    private Method method;

    private Object[] args;

    @Override
    public Object[] getArguments() {
        return args;
    }

    @Override
    public Object proceed() throws Throwable {
        return method.invoke(target, args);
    }

    @Override
    public Object getThis() {
        return target;
    }

    @Override
    public AccessibleObject getStaticPart() {
        return method;
    }
}
