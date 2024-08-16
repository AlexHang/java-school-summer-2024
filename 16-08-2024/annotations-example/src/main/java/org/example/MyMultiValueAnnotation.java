package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface MyMultiValueAnnotation {
    int val1() default 0;
    String val2() default "TEST";
}
