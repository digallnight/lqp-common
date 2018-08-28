package com.lqp.common.base.util;

import jdk.nashorn.internal.runtime.ECMAException;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * IP相关工具类
 */
public class IPUtil {

    /**
     * 获取本地IP
     */
    public static String getHostAddress() throws Exception {
        return InetAddress.getLocalHost().getHostAddress();
    }

    /**
     * 获取主机名
     */
    public static String getHostName() throws Exception{
        return InetAddress.getLocalHost().getHostName();
    }
    /**
     * 获取本地mac地址
     */
    public static String getLocalMac() throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();//获取本地IP对象
        //获得网络接口对象（即网卡），并得到mac地址，mac地址存在于一个byte数组中。
        byte[] mac = NetworkInterface.getByInetAddress(inetAddress).getHardwareAddress();

        //下面代码是把mac地址拼装成String
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < mac.length; i++) {
            if (i != 0) {
                sb.append("-");
            }
            //mac[i] & 0xFF 是为了把byte转化为正整数
            String s = Integer.toHexString(mac[i] & 0xFF);
            sb.append(s.length() == 1 ? 0 + s : s);
        }
        return sb.toString();
    }
}
