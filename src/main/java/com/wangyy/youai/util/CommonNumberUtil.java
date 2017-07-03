package com.wangyy.youai.util;

import java.util.Random;

/**
 * Created by qingjiang on 2017/6/16.
 */
public class CommonNumberUtil {

    /**
     * 返回两个时间数值的差值
     * @param var1 time1
     * @param var2 time2
     * @return timeDiff
     */
    public static String timeDiff(long var1, long var2) {
        long abs = Math.abs(var1 - var2);
        return abs + "ms";
    }

    public static long randomLong() {
        Random random = new Random();
        return random.nextLong();
    }
}
