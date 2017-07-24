package com.youai.user.test.exception;

import com.wangyy.youai.util.ApiLogger;
import org.junit.Test;

/**
 * Created by Qingjiang Li on 2017/7/24.
 */
public class TestException {


    @Test
    public void testException() {
        String str = "123s";
        Integer num = strToNumber(str);
        System.out.println(num);
    }

    private Integer strToNumber(String str) {
        try {
            return toNumber(str);
        } catch (Exception e) {
            ApiLogger.error("Test exception error");
        }
        return null;
    }

    private Integer toNumber(String str) {
        return Integer.valueOf(str);
    }


}
