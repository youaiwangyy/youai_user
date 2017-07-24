package com.wangyy.youai.designpattern;

/**
 * Created by Qingjiang Li on 2017/7/2.
 */
public abstract class Decorator implements Drink{

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String description() {
        return drink.description();
    }

    @Override
    public float cost() {
        return drink.cost();
    }

}
