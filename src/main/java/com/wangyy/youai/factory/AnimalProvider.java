package com.wangyy.youai.factory;

import com.wangyy.youai.service.AnimalService;

/**
 * Created by qingjiang on 2017/6/22.
 */
public interface AnimalProvider {

    AnimalService instance();

}
