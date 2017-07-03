package com.youai.user.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qingjiang on 2017/6/20.
 */
public class StringTools {

    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public static Date stringToDate(String source) {
        DateFormat dateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        System.out.println(source);
        try {
            return dateFormat.parse(source);
        } catch (Exception e) {
            return null;
        }
    }

}
