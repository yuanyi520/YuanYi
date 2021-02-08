package com.yuanyi.artemis.aspect;

import com.yuanyi.artemis.bean.AccessLog;
import com.yuanyi.artemis.service.AccessLogService;
import com.yuanyi.artemis.util.LogUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LogAspect {

    @Autowired
    private LogUtil logUtil;

    @Autowired
    private AccessLogService accessLogService;

    @Pointcut("@annotation(com.yuanyi.artemis.annotation.EnableLog)")
    public void controllerMethod() {}

    @Before("controllerMethod()")
    public void befor(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        try {
            accessLogService.saveAccessLog(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
