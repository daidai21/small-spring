package org.spring.small;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue propertyValue) {
        // TODO: judge repeat
        this.propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
