package com.wangyy.youai.designpattern;

/**
 * Created by Qingjiang Li on 2017/7/2.
 */
public class SugarDecorator extends Decorator {

    public SugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public String description() {
        return super.description() + " + 糖";
    }

    @Override
    public float cost() {
        return super.cost() + 0.5F;
    }
}
