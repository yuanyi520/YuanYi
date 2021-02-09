package com.yuanyi.artemis.annotation;

import com.yuanyi.artemis.enums.LogType;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EnableLog {

    /**
     *方法描述
     */
    String message() default "";

    /**
     * 操作类型
     */
    LogType operatingType() default LogType.UNKNOWN;
}
