package com.youai.user.test;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by qingjiang on 2017/6/14.
 */
public class TestLog4j2 {

    private static final Logger logger = LogManager.getLogger(TestLog4j2.class.getName());

    @Test
    public void testLog4j2() {
        boolean a =true;
        logger.error("Did it again!");   //error级别的信息，参数就是你输出的信息
        logger.info("我是info信息");    //info级别的信息
        logger.debug("我是debug信息");
        logger.warn("我是warn信息");
        logger.fatal("我是fatal信息");
        logger.log(Level.DEBUG, "我是debug信息");

    }
}
