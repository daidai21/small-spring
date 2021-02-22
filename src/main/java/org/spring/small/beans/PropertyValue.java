package org.spring.small.beans;

import lombok.Data;

@Data
public class PropertyValue {
    private final String name;

    private final Object value;
}
