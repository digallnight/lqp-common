package com.lqp.common.base.util;

import com.lqp.common.base.dict.EnumRegx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileUtil {
    /**
     * 判断一个字符串是否为手机号
     *
     * @param str
     * @return true/false
     */
    public static boolean isMobile(String str) {
        Pattern pattern = Pattern.compile(EnumRegx.CHECK_MOBILE_T.getCode());
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * 随机生成一个手机号
     * @return
     */
    public static String genMobile(){

       return null;
    }
}
