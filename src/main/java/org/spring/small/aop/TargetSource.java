package org.spring.small.aop;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class TargetSource {

    private Object target;

    private Class<?>[] targetClass;

    public TargetSource(Object target, Class<?>... targetClass) {
        this.target = target;
        this.targetClass = targetClass;
    }
}
