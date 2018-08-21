package com.lqp.common.base.util;

import com.lqp.common.base.dict.EnumRegx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUtil {
    /**
     * 判断是否符合邮箱格式
     *
     * @param str
     * @return
     */
    public static boolean isEmail(String str) {
        Pattern pattern = Pattern.compile(EnumRegx.CHECK_EMAIL.getCode());
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
