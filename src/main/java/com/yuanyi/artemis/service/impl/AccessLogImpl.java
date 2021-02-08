package com.yuanyi.artemis.service.impl;

import com.yuanyi.artemis.bean.AccessLog;
import com.yuanyi.artemis.mapper.AccessLogMapper;
import com.yuanyi.artemis.service.AccessLogService;
import com.yuanyi.artemis.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class AccessLogImpl implements AccessLogService {

    /**
     * 日志工具类
     */
    @Autowired
    private LogUtil logUtil;

    /**
     * 日志保存mapper
     */
    @Autowired
    private AccessLogMapper accessLogMapper;

    /**
     * 保存日志方法
     * @param request
     * @throws Exception
     */
    @Override
    public void saveAccessLog(HttpServletRequest request) throws Exception {
        String ip = logUtil.getIpAddress(request);
        String browserName = logUtil.getBrowserName(request);
        String osName = logUtil.getOsName(request);
        AccessLog log = new AccessLog();
        log.setIp(ip);
        log.setBrowsename(browserName);
        log.setTime(logUtil.getTime());
        log.setOs(osName);
        accessLogMapper.saveAccessLog(log);
    }
}
