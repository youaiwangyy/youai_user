package com.wangyy.youai.factory;

import com.wangyy.youai.service.AnimalService;
import com.wangyy.youai.service.impl.CatServiceImpl;

/**
 * Created by qingjiang on 2017/6/22.
 */
public class CatFactory implements AnimalProvider {

    @Override
    public AnimalService instance() {
        return new CatServiceImpl();
    }

}
