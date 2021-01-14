package com.yuanyi.artemis.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class ResponseUtil {

    /**
     * ajax 成功响应
     *
     * @param message
     * @param object
     */
    public String success(String message, Object object) {
        JSONObject returnJsonObj = new JSONObject();
        returnJsonObj.put("code", "0");
        returnJsonObj.put("message", message);
        if (object != null){
            returnJsonObj.put("data", object);
        }
        return JSONObject.toJSONString(returnJsonObj);
    }

    /**
     * ajax 成功响应
     *
     * @param message
     * @param count
     * @param object
     */
    public String success(String message, long count, Object object) {
        JSONObject returnJsonObj = new JSONObject();
        returnJsonObj.put("code", "0");
        returnJsonObj.put("message", message);
        returnJsonObj.put("count", count);
        if (object != null){
            returnJsonObj.put("data", object);
        }
        return JSONObject.toJSONString(returnJsonObj);
    }

    /**
     * ajax 失败响应
     *
     * @param message
     * @param object
     */
    public String error(String message, Object object) {
        JSONObject returnJsonObj = new JSONObject();
        returnJsonObj.put("code", "-1");
        returnJsonObj.put("message", message);
        if (object != null){
            returnJsonObj.put("data", object);
        }
        return JSONObject.toJSONString(returnJsonObj);
    }
}
