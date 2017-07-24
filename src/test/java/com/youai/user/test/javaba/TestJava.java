package com.youai.user.test.javaba;

import com.wangyy.youai.http.ActionStatus;
import com.wangyy.youai.util.ApiLogger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qingjiang on 2017/6/16.
 */
public class TestJava {



    @Test
    public void testApiLogger() {
        ApiLogger.info("INFO info");
        ApiLogger.error("ERROR info");
        ApiLogger.requset("REQUEST info");
        ApiLogger.dbInfo("DB info");
        ApiLogger.debug("DUBUG info");

    }

    @Test
    public void test() {
        ActionStatus actionStatus = ActionStatus.PARAMAS_ERROR;
        String s = actionStatus.toJson();
        System.out.println(s);
    }

    @Test
    public void testSubList() {
        List<String> originalList = new ArrayList<String>();

        for(int i = 0; i < 5; i++){
            originalList.add(String.valueOf(i));
        }

        List<String> subList = originalList.subList(2, 4);
        for(String s : subList){
            System.out.println(s);
            //输出: 2, 3
        }
        System.out.println("-----");

        //非结构性的修改子列表subList，将会影响到原列表originalList 一同修改
        subList.set(0, "22");
        for(String s : originalList){
            System.out.println(s);
            //输出: 0, 1, 22, 3, 4
        }
        System.out.println("-----");

        //structural modification by sublist, reflect parentList
        subList.add(String.valueOf(2.5));
        for(String s : originalList){
            System.out.println(s);
            //output:0, 1, 22, ,3, 2.5,    4
        }
        System.out.println("-----");

        //non-structural modification by parentList, reflect sublist
        originalList.set(3, "33");
        for(String s : subList){
            System.out.println(s);
            //output: 22, 33, 2.5
        }
        System.out.println("-----");

        //structural modification by parentList, sublist becomes undefined(throw exception)
        originalList.add("6");
//        for(String s : subList){
//            System.out.println(s);
//        }
        subList.get(0);
    }
}
