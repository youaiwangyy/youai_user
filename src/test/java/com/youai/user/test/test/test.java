package com.youai.user.test.test;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.wangyy.youai.po.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    @Test
    public void testList() {
        List<String> list1 = new ArrayList<>();
        list1.add("Qingjiang Li");
        list1.add("Keqiang Du");
        list1.add("Yujie Li");
        list1.add("Zijun Yu");
        list1.add("Jie Fang");

        List<String> list2 = new ArrayList<>();
        list2.add("Jie Fang");
        list2.add("Yujie Li");

        System.out.println(list1);
        System.out.println(list2);

        boolean b = list1.removeAll(list2);
        System.out.println(b);
        System.out.println(list1);
    }

    @Test
    public void testStringByte() {
        String name1 = "Qingjiang Li";
        String name2 = "Jie Fang";
        String name3 = "Zijun Yu";
        String name4 = "Xiong Long";

        List<String> nameList = Lists.newArrayList(name1, name2, name3, name4);
        System.out.println(nameList);

        byte[][] nameBytes = new byte[nameList.size()][];
        for (int i=0;i<nameBytes.length;i++) {
            byte[] nameByte = nameList.get(i).getBytes();
            nameBytes[i] = nameByte;
        }

        List<String> nameByteList = Stream.of(nameBytes).map(name -> new String(name)).collect(Collectors.toList());
        System.out.println(nameByteList);


    }

    @Test
    public void testBean() {
        User user = new User(1001, "Qingjiang Li", "123456");
        System.out.println(JSONObject.toJSONString(user));
        String userJson = "{\"age\":0,\"uid\":1001,\"username\":\"Qingjiang Li\"}";

        User user1 = JSONObject.parseObject(userJson, User.class);
        System.out.println(JSONObject.toJSONString(user1));

    }


}
