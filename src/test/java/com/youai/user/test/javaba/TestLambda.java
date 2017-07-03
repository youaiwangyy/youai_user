package com.youai.user.test.javaba;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.youai.user.util.StringTools;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by qingjiang on 2017/6/20.
 */
public class TestLambda {

    @Test
    public void test3() {
        List<String> list = Arrays.asList("LiQingJiang", "shiyuesheng", "fangjie", "dukeqiang", "liyuejie", "wangyingying", "zhangyuliang");
//        List<String> lowercaseNames = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> lowercaseNames = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowercaseNames);
    }

    @Test
    public void test1() {
        List<String> list = Arrays.asList("liqingjiang", "shiyuesheng", "fangjie", "dukeqiang", "liyuejie", "wangyingying", "zhangyuliang");
        list.forEach(System.out::println);

        String[] array = {"aa", "bb", "cc"};
        for(Integer i : Lists.newArrayList(1,2,3,4)){
            System.out.println("-----" + i);
            Stream.of(array).map(item -> Strings.padStart(item, i, '@')).forEach(System.out::println);
        }

        List<String> dateList = Arrays.asList("2015-12-23 20:20:20", "2016-12-24 20:20:20", "2017-12-25 20:20:20");
        dateList.forEach(StringTools::stringToDate);


    }


    @Test//List 排序
    public void test() {
        List<String> list = Arrays.asList("liqingjiang", "shiyuesheng", "fangjie", "dukeqiang", "liyuejie", "wangyingying", "zhangyuliang");
        Collections.sort(list);
        System.out.println(list);

        Person person1 = new Person(1001, "liqingjiang", (byte) 26, (byte) 1);
        Person person2 = new Person(1002, "shiyuesheng", (byte) 27, (byte) 1);
        Person person3 = new Person(1003, "fangjie", (byte) 26, (byte) 1);
        Person person4 = new Person(1004, "dukeqiang", (byte) 26, (byte) 1);
        Person person5 = new Person(1005, "liyuejie", (byte) 23, (byte) 1);
        Person person6 = new Person(1006, "wangyingying", (byte) 24, (byte) 1);
        Person person7 = new Person(1007, "zhangyuliang", (byte) 26, (byte) 1);
        Person person8 = new Person(1008, "liqingjiang", (byte) 26, (byte) 2);
        Person person9 = new Person(1009, "liqingjiang", (byte) 26, (byte) 2);
        Person person10 = new Person(1010, "liqingjiang", (byte) 26, (byte) 2);

        List<Person> persons = Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10);
        Collections.sort(persons, (p1, p2)->{
            if (p1.getAge() != p2.getAge()) {
                return (p1.getAge() - p2.getAge());
            }else if (!p1.getUsername().equalsIgnoreCase(p2.getUsername())) {
                return p1.getUsername().compareTo(p2.getUsername());
            } else if (p1.getSex() != p2.getSex()) {
                return (p1.getSex() - p2.getSex());
            } else {
                return (int)(p1.getId() - p2.getId());
            }
        });

        persons.forEach(person -> System.out.println(person));

    }

    class Person{
        private long id;
        private String username;
        private byte age;
        private byte sex;

        public Person() {
        }

        public Person(long id, String username, byte age, byte sex) {
            this.id = id;
            this.username = username;
            this.age = age;
            this.sex = sex;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public byte getAge() {
            return age;
        }

        public void setAge(byte age) {
            this.age = age;
        }

        public byte getSex() {
            return sex;
        }

        public void setSex(byte sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("id=").append(id);
            sb.append(", username='").append(username).append('\'');
            sb.append(", age=").append(age);
            sb.append(", sex=").append(sex);
            sb.append('}');
            return sb.toString();
        }
    }

}
