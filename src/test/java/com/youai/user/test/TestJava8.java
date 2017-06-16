package com.youai.user.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by qingjiang on 2017/6/14.
 */
public class TestJava8 {


    @Test
    public void test() {
        List<String> list = Arrays.asList("liqingjiang", "wangyy", "dukeqiang");
        list.forEach(e -> {
            System.out.println(e);
        });
    }



}
