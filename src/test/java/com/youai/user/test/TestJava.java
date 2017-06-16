package com.youai.user.test;

import com.wangyy.youai.http.ActionStatus;
import org.junit.Test;

/**
 * Created by qingjiang on 2017/6/16.
 */
public class TestJava {

    @Test
    public void test() {
        ActionStatus actionStatus = ActionStatus.PARAMAS_ERROR;
        String s = actionStatus.toJson();
        System.out.println(s);
    }

}
