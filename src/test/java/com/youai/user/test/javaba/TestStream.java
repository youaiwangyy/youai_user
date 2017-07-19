package com.youai.user.test.javaba;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by qingjiang on 2017/6/21.
 */
public class TestStream {


    @Test
    public void test3() {
        List<String> list = Lists.newArrayList("Qingjiang Li", "Fang Jie", "zhangyuliang", "liupenghua", "zhangyanhui", "cuiyushun");
        List<String> list2 = Lists.newArrayList("Fang Jie");
        List<Integer> integerList = new ArrayList<>();
        for (int i=0;i< 10300;i++) {
            integerList.add(i);
        }
/*
        boolean allMatch = list.stream().anyMatch(name -> name.contains("li"));
        System.out.println(allMatch);

        Stream<String> names = Stream.concat(list.stream(), list2.stream());
        names.peek(System.out::println).count();
        System.out.println("-----");
        Stream<String> names2 = Stream.concat(list.stream(), list2.stream());
        names2.distinct().peek(System.out::println).count();
*/
        Optional<Integer> min = integerList.stream().min((i1, i2) -> i1.compareTo(i2));
        Integer integer = min.get();
        System.out.println(integer);
    }


    @Test
    public void test() {
        List<String> parentList = Lists.newArrayList("liqingjiang", "dukeqiang", "zhangyuliang", "liupenghua", "zhangyanhui", "cuiyushun");
        List<String> subList = parentList.subList(1, 4);
        long count = parentList.stream().peek(System.out::println).count();
        System.out.println("count 1:" + count);
        count = subList.stream().peek(System.out::println).count();
        System.out.println("count 2:" + count);

        subList.remove(1);
        count = parentList.stream().peek(System.out::println).count();
        System.out.println("count 3:" + count);
        count = subList.stream().peek(System.out::println).count();
        System.out.println("count 4:" + count);

        parentList.add("wangyingying");
        count = parentList.stream().peek(System.out::println).count();
        System.out.println("count 5:" + count);
        //subList.stream().peek(System.out::println).count();

    }


    @Test
    public void test2() {
        List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);

        long total = nums.stream().
                filter(num -> num != null)
                .distinct()
                .mapToInt(num -> num * 2)
                .peek(System.out::println)
                .limit(4)
                .skip(2)
                .sum();
        System.out.println("total: " + total);

        long count = nums.stream().filter(num -> num != null)
                .distinct()
                .skip(2)
                .limit(4)
                .peek(System.out::println)
                .count();
        System.out.println("count:" + count);

    }

    @Test
    public void testCollect() {
        List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);

        nums.stream().filter(num -> num != null).max((num1, num2) -> num1.compareTo(num2)).ifPresent(num -> {
            System.out.println("num:" + num);
        });
        /*List<Integer> numsWithoutNull = nums.stream().filter(num -> num != null).filter(num -> num % 2 == 0).
                collect(() -> new ArrayList<Integer>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2)
                );*/
        /*List<Integer> numsWithoutNull = nums.stream().filter(num -> num != null).filter(num -> num % 2 == 0).
                collect(() -> new ArrayList<Integer>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2)
                );

        System.out.println(numsWithoutNull);*/
    }
}
