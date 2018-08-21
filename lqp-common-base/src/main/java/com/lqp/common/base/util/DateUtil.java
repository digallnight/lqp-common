package com.lqp.common.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    /**
     * 获取当前时间戳：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String now() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }

    /**
     * 获取当前时间戳
     * @param formatStr
     * @return
     */
    public static String now(String formatStr) {
        SimpleDateFormat df = new SimpleDateFormat(formatStr);
        return df.format(new Date());
    }
}
