package com.wangyy.youai.single;

/**
 * Created by qingjiang on 2017/6/23.
 */
public class FactoryInfo {

    private static int id = 10005;
    private static String name = "car";
    private static String desc = "car desc";

    private static FactoryInfo factoryInfo = null;

    private FactoryInfo() {}

    private FactoryInfo(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    //懒汉式 1
    /*public static synchronized FactoryInfo getInstance() {
        if (factoryInfo == null) {
            return new FactoryInfo(id, name, desc);
        }
        return factoryInfo;
    }*/
    //懒汉式 2
    public static FactoryInfo getInstance() {
        if (factoryInfo == null) {
            synchronized (FactoryInfo.class) {
                if (factoryInfo == null) {
                    return new FactoryInfo(id, name, desc);
                }
            }
        }
        return factoryInfo;
    }

}
