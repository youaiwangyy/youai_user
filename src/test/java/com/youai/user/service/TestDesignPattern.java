package com.youai.user.service;

import com.wangyy.youai.factory.AnimalProvider;
import com.wangyy.youai.factory.DogFactory;
import com.wangyy.youai.service.AnimalService;
import org.junit.Test;

/**
 * Created by qingjiang on 2017/6/22.
 */
public class TestDesignPattern {

    @Test
    public void testFactoryPattern() {
        AnimalProvider provider = new DogFactory();
        AnimalService animalService = provider.instance();
        animalService.eat();
    }

}
