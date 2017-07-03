package com.youai.user.test.javaba;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by qingjiang on 2017/6/14.
 */
public class TestJava8 {

    private static final Logger logger = LogManager.getLogger(TestJava8.class.getName());


    @Test
    public void testJsonArray() {
        JSONArray jsonArray = new JSONArray();

        jsonArray.add("{'name':'Qingjiang Li'}");

        jsonArray.stream().forEach(name ->{
            JSONObject jsonObject = JSON.parseObject(name.toString());
            System.out.println(jsonObject);
        });

    }

    @Test
    public void testCreateStream() {
        //Stream.of()
        /*Stream<String> stream = Stream.of("Qingjiang Li");
        stream.forEach(System.out::println);
        Stream<String> stream2 = Stream.of("Qingjiang Li", "Keqiang Du");
        stream2.forEach(System.out::println);*/

        //Collection.stream()
        /*Collection<String> collection = Lists.newArrayList("Qingjiang Li", "Keqiang Du");
        collection.stream().forEach(System.out::println);*/

        /*Stream.generate(new Supplier<Long>() {
            @Override
            public Long get() {
                Random random = new Random();
                return random.nextLong();
            }
        }).filter(num -> num > 0)
                .limit(10)
                .forEach(System.out::println);*/

        /*Stream.generate(() -> {
            Random random = new Random();
            return random.nextLong();
        }).filter(num -> num > 0)
                .limit(10)
                .forEach(System.out::println);*/

        /*Stream.generate(Math::random).filter(num -> num > 0)
                .limit(10)
                .forEach(System.out::println);*/

        /*Stream.iterate(2, num -> num * 2).limit(10).forEach(System.out::println);*/


        /*Optional<String> name = Optional.of("Sanaulla");
        Optional<String> optional = name.flatMap(value -> Optional.of(value.toUpperCase()));
        String lala = optional.orElse("lala");
        System.out.println(lala);*/
        List<String> list = Lists.newArrayList("Qingjiang Li", "Keqiang Du", "Yingying Wang");
        list.stream().flatMap(name -> Stream.of(name.toUpperCase())).peek(TestJava8::printStr).count();



    }

    public static void printStr(String string) {
        System.out.println(string);
    }


    @Test
    public void testListToArray() {
        List<String> list = Arrays.asList("Qingjiang Li", "Yujie Li        ", "Keqiang Du", "Yingying Wang");
        List<Character> charList = list.stream().map(String::trim).filter(name -> name.length() >= 10).map(name -> name.charAt(0)).collect(Collectors.toList());
        System.out.println(charList);
       /* List<String> list = Arrays.asList("Qingjiang Li", "Yujie Li", "Keqiang Du", "Yingying Wang");
        String[] names = list.toArray(new String[4]);
        Stream.of(names).peek(System.out::println).count();*/

        /*List<String> list = Arrays.asList("Qingjiang Li", "Yujie Li", "Keqiang Du", "Yingying Wang");
        String [] names = list.stream().toArray(String[]::new);
        Stream.of(names).peek(System.out::println).count();*/

        /*String[] names = {"Qingjiang Li", "Yujie Li", "", "Keqiang Du", null, "  ", "Yingying Wang", "", " "};
        List<String> list = Stream.of(names)
                .filter(name -> null != name && name.trim().length() != 0)
                .collect(Collectors.toList());
        list.stream().peek(System.out::println).count();*/


    }

    @Test
    public void test() {
        List<String> list = Arrays.asList("Qingjiang Li", "Yujie Li", "Keqiang Du", "Yingying Wang");
        Collections.sort(list);//默认按字典顺序排序
        Collections.sort(list, (e1, e2) -> e1.compareToIgnoreCase(e2));//可自定义排序规则
        Collections.sort(list, String::compareToIgnoreCase);//可自定义排序规则
        logger.info(list);

        /*List<String> list = Arrays.asList("Qingjiang Li", "Yujie Li", "Keqiang Du", "Yingying Wang");
        list.forEach((String name) -> {System.out.println(name);});
        list.forEach((name) -> {System.out.println(name);});
        list.forEach(name -> {System.out.println(name);});
        list.forEach(name -> System.out.println(name));
        list.forEach(System.out::println);*/
        /*logger.info("===");
        Set<String> set = Sets.newHashSet("Qingjiang Li", "Yujie Li", "Keqiang Du", "Yingying Wang");
        set.forEach((String name) -> {System.out.println(name);});
        set.forEach((name) -> {System.out.println(name);});
        set.forEach(name -> {System.out.println(name);});
        set.forEach(name -> System.out.println(name));
        set.forEach(System.out::println);*/

        /*logger.info("===");
        Map<Long, String> map = Maps.newHashMap();
        map.put(100005L, "Qingjiang Li");
        map.put(100006L, "Yujie Li");
        map.put(100007L, "Keqiang Du");
        map.put(100008L, "Yingying Wang");
        map.forEach((Long k,String v) ->{System.out.println(k + ":" + v);});
        map.forEach((k, v) -> {System.out.println(k + ":" + v);});*/
    }

    @Test
    public void testListNull() {
        List<Integer> list = Lists.newArrayList(null, 1, null, 32, null, 6);

        list = list.stream().filter(e -> null != e).collect(Collectors.toList());

        logger.info(list);

        List<Integer> cardIdList = Arrays.asList(124, 99, 114);//默认prod

        logger.info("cardidLIST:" + cardIdList);

    }

    @Test
    public void testFilterListNull() {
        List<Integer> list = Lists.newArrayList(0, 1, 2, 3, 4, 5);
        List<String> listStr = list.stream().map(TestJava8::getStr).filter(e -> null != e && !("".equals(e.trim()))).collect(Collectors.toList());
        System.out.println(listStr);
    }

    public static String getStr(int index) {
        List<String> list = Lists.newArrayList("liqingjiang", "fangjie", null, "shiyuesheng", null, "");
        return list.get(index);
    }


}
