package com.yuanyi.artemis.util;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LogUtil {

    /**
     * 获取ip地址
     * @param request
     * @return
     */
    public String getIpAddress(HttpServletRequest request) {
        String ip = request.getRemoteAddr().equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : request.getRemoteAddr();
        return ip;
    }

    /**
     * 获取请求浏览器的名字
     * @param request
     * @return
     */
    public String getBrowserName(HttpServletRequest request) {
        String  browserDetails  =   request.getHeader("User-Agent");
        String  userAgent       =   browserDetails;
        String  user            =   userAgent.toLowerCase();

        String browser = "";

        if (user.contains("edge")) {
            browser=(userAgent.substring(userAgent.indexOf("Edge")).split(" ")[0]).replace("/", "-");
        } else if (user.contains("msie")) {
            String substring=userAgent.substring(userAgent.indexOf("MSIE")).split(";")[0];
            browser=substring.split(" ")[0].replace("MSIE", "IE")+"-"+substring.split(" ")[1];
        } else if (user.contains("safari") && user.contains("version")) {
            browser=(userAgent.substring(userAgent.indexOf("Safari")).split(" ")[0]).split("/")[0]
                    + "-" +(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
        } else if ( user.contains("opr") || user.contains("opera")) {
            if(user.contains("opera")){
                browser=(userAgent.substring(userAgent.indexOf("Opera")).split(" ")[0]).split("/")[0]
                        +"-"+(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
            }else if(user.contains("opr")){
                browser=((userAgent.substring(userAgent.indexOf("OPR")).split(" ")[0]).replace("/", "-"))
                        .replace("OPR", "Opera");
            }

        } else if (user.contains("chrome")) {
            browser=(userAgent.substring(userAgent.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
        } else if ((user.indexOf("mozilla/7.0") > -1) || (user.indexOf("netscape6") != -1)  ||
                (user.indexOf("mozilla/4.7") != -1) || (user.indexOf("mozilla/4.78") != -1) ||
                (user.indexOf("mozilla/4.08") != -1) || (user.indexOf("mozilla/3") != -1) ) {
            browser = "Netscape-?";

        } else if (user.contains("firefox")) {
            browser=(userAgent.substring(userAgent.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
        } else if(user.contains("rv")) {
            String IEVersion = (userAgent.substring(userAgent.indexOf("rv")).split(" ")[0]).replace("rv:", "-");
            browser="IE" + IEVersion.substring(0,IEVersion.length() - 1);
        } else {
            browser = "UnKnown, More-Info: "+userAgent;
        }

        return browser;
    }

    /**
     * 获取请求系统
     * @param request
     * @return
     */
    public String getOsName(HttpServletRequest request) {
        String  browserDetails  =   request.getHeader("User-Agent");
        String  userAgent       =   browserDetails;

        String os = "";

        if (userAgent.toLowerCase().indexOf("windows") >= 0 ) {
            os = "Windows";
        } else if(userAgent.toLowerCase().indexOf("mac") >= 0) {
            os = "Mac";
        } else if(userAgent.toLowerCase().indexOf("x11") >= 0) {
            os = "Unix";
        } else if(userAgent.toLowerCase().indexOf("android") >= 0) {
            os = "Android";
        } else if(userAgent.toLowerCase().indexOf("iphone") >= 0) {
            os = "IPhone";
        }else{
            os = "UnKnown, More-Info: "+userAgent;
        }

        return os;
    }

    /**
     * 获取请求时间
     * @param request
     * @return
     */
    public String getTime() {
        long timeMillis = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(timeMillis);
        return dateFormat.format(date);
    }
}
