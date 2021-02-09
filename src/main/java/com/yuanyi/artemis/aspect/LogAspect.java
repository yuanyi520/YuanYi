package com.yuanyi.artemis.aspect;

import com.yuanyi.artemis.annotation.EnableLog;
import com.yuanyi.artemis.service.AccessLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LogAspect {

    @Autowired
    private AccessLogService accessLogService;

    @Pointcut("@annotation(com.yuanyi.artemis.annotation.EnableLog)")
    public void controllerMethod() {}

    @Before("controllerMethod()")
    public void befor(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        EnableLog enableLog = signature.getMethod().getAnnotation(EnableLog.class);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        try {
            accessLogService.saveAccessLog(request,enableLog.operatingType().getValue() ,enableLog.message());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
