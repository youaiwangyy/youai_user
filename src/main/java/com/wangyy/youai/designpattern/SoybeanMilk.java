package com.wangyy.youai.designpattern;

/**
 * Created by Qingjiang Li on 2017/7/2.
 */
public class SoybeanMilk implements Drink {

    @Override
    public String description() {
        return "豆浆";
    }

    @Override
    public float cost() {
        return 3F;
    }
}
