package com.youai.user.test.designPattern;

import com.wangyy.youai.designpattern.*;
import org.junit.Test;

/**
 * Created by Qingjiang Li on 2017/7/2.
 */
public class TestDesignPattern {

    @Test
    public void testDecorator() {
        Drink drink = new SoybeanMilk();

        drink = new SugarDecorator(drink);

        drink = new EggBeanDecorator(drink);

        drink = new BlackDecorator(drink);

        System.out.println("豆浆4:" + drink.description());
        System.out.println("花费4:" + drink.cost());


    }

}
