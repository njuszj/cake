package com.njuszj.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
    /*
    * 获取当前标准时间，以yyyy-MM-dd HH:mm:ss格式字符串返回
    * */
    public static String currTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dt = LocalDateTime.now();
        return dtf.format(dt);
    }
    /*
     * 获取当前标准时间，以纯数字字符串格式返回
     * */
    public static String currTimePureNumber() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime dt = LocalDateTime.now();
        return dtf.format(dt);
    }
}

