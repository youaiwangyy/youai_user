package com.wangyy.youai.designpattern;

/**
 * Created by Qingjiang Li on 2017/7/2.
 */
public class BlackDecorator extends Decorator {

    public BlackDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public String description() {
        return super.description() + " + 黑豆";
    }

    @Override
    public float cost() {
        return super.cost() + 2.5F;
    }
}
