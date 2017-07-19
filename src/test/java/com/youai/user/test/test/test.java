package com.youai.user.test.test;

import com.google.common.collect.Lists;
import com.wangyy.youai.po.User;
import org.junit.Test;

import java.util.List;

/**
 * Created by qingjiang on 2017/6/21.
 */
public class test {

    @Test
    public void test() throws Exception {
        User person1 = new User(1001L, "Qingjiang Li", "123456");
        User person2 = new User(1002L, "Keqiang Du", "123456");
        User person3 = new User(1003L, "Yuliang Zhang", "123456");
        User person4 = new User(1004L, "Penghua Liu", "123456");
        List<User> list = Lists.newArrayList(person1, person2, person3, person4);

        System.out.println(list);

        for (User user : list) {
            user.setPassword("lalala");
        }

        System.out.println(list);
    }

}
