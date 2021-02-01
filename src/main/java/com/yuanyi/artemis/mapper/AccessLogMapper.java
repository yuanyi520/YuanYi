package com.yuanyi.artemis.mapper;

import com.yuanyi.artemis.bean.AccessLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccessLogMapper {

    /**
     * 保存日志
     * @param accessLog
     * @throws Exception
     */
    void saveAccessLog(AccessLog accessLog) throws Exception;
}
