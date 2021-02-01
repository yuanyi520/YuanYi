package com.yuanyi.artemis.service;

import javax.servlet.http.HttpServletRequest;

public interface AccessLogService {

    void saveAccessLog(HttpServletRequest request) throws Exception;
}
