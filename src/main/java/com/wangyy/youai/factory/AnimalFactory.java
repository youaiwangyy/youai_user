package com.wangyy.youai.factory;

import com.wangyy.youai.service.AnimalService;
import com.wangyy.youai.service.impl.CatServiceImpl;
import com.wangyy.youai.service.impl.DogServiceImpl;

/**
 * Created by qingjiang on 2017/6/22.
 */
public class AnimalFactory {
    public static AnimalService instanceCatService() {
            return new CatServiceImpl();
    }
    public static AnimalService instanceDogService() {
        return new DogServiceImpl();
    }
}


/*public class AnimalFactory {
    public AnimalService instance(AnimalEnum animalEnum) {
        if (animalEnum == null) {
            return null;
        }
        if (animalEnum == AnimalEnum.DOG) {
            return new DogServiceImpl();
        }
        if (animalEnum == AnimalEnum.CAT) {
            return new CatServiceImpl();
        }
        return null;
    }
}*/
