package com.cs.stru.designpattern.behavior.strategy.ultimate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TotalPriceRange {

    PriceRange value() default @PriceRange;
}
