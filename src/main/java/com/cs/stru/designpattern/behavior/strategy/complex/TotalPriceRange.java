package com.cs.stru.designpattern.behavior.strategy.complex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TotalPriceRange {
    int max() default Integer.MAX_VALUE;

    int min() default Integer.MIN_VALUE;
}
