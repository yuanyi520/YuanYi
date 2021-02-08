package com.yuanyi.artemis.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EnableLog {

    /**
     *方法描述
     */
    String detail () default "";
}
