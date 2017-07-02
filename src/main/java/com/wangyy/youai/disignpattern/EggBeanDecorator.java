package com.wangyy.youai.disignpattern;

/**
 * Created by Qingjiang Li on 2017/7/2.
 */
public class EggBeanDecorator extends Decorator {


    public EggBeanDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public String description() {
        return super.description() + " + 鸡蛋";
    }

    @Override
    public float cost() {
        return super.cost() + 2F;
    }
}
