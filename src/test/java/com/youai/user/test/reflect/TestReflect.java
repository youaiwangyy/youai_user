package com.youai.user.test.reflect;

import com.wangyy.youai.po.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.stream.Stream;

/**
 * Created by qingjiang on 2017/6/21.
 */
public class TestReflect {

    @Test
    public void test5() {

    }

    @Test
    public void test4() throws Exception{
        Class<?> class1 = null;
        class1 = Class.forName("com.wangyy.youai.po.User");
        // 第一种方法，实例化默认构造方法，调用set赋值
        User user = (User) class1.newInstance();
        user.setAge(20);
        user.setUsername("Rollen");
        System.out.println(user);
        // 结果 User [age=20, name=Rollen]
        // 第二种方法 取得全部的构造函数 使用构造函数赋值
        Constructor<?> cons[] = class1.getConstructors();
        // 查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }
    }

    @Test
    public void test3() {
        User user = new User();
        Class<? extends User> clazz = user.getClass();
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass);
        Class<?>[] interfaces = clazz.getInterfaces();
        Stream.of(interfaces).peek(System.out::println).count();
    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = Class.forName("com.wangyy.youai.po.User");
        class2 = new User().getClass();
        class3 = User.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
    }

    @Test
    public void test() {
        User user = new User();
        String clazzName = user.getClass().getName();
        System.out.println(clazzName);
    }


}
