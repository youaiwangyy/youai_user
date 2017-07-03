package com.wangyy.youai.service.impl;

import com.wangyy.youai.service.AnimalService;
import org.springframework.stereotype.Service;

/**
 * Created by qingjiang on 2017/6/22.
 */
@Service(value = "dogService")
public class DogServiceImpl implements AnimalService {

    @Override
    public void eat() {
        System.out.println("Dogs eat bones");
    }
}
