package com.lqp.common.base.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * IPUtil Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>$todate</pre>
 */
public class IPUtilTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getHostAddress()
     */
    @Test
    public void testGetHostAddress() throws Exception {
        System.out.println(IPUtil.getHostAddress());
    }

    @Test
    public void testGetHostName() throws Exception{
        System.out.println(IPUtil.getHostName());
    }

    @Test
    public void testGetLocalMac() throws Exception{
        System.out.println(IPUtil.getLocalMac());
    }


} 
