package org.spring.small.aop;

import lombok.Getter;

@Getter
public class TargetSource {

    private Class targetClass;

    private Object target;

    public TargetSource(Object target, Class<?> targetClass) {
        this.target = target;
        this.targetClass = targetClass;
    }
}
