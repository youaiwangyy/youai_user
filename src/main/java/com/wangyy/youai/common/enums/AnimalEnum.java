package com.wangyy.youai.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 性别
 * Created by qingjiang on 2017/6/14.
 */
public enum AnimalEnum {

    DOG(1, "狗"),
    CAT(2, "猫"),
    BIRD(3, "鸟"),
    PIG(4, "猪");


    private int id;

    private String name;

    private static Map<Integer, AnimalEnum> VALUES = new HashMap<>();

    static {
        for (AnimalEnum enm : AnimalEnum.values()) {
            VALUES.put(enm.getId(), enm);
        }
    }

    public static final AnimalEnum parse(int id) {
        return VALUES.get(id);
    }

    AnimalEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
