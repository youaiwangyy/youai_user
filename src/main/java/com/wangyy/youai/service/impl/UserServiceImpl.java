package com.wangyy.youai.service.impl;

import com.wangyy.youai.dao.UserDao;
import com.wangyy.youai.po.User;
import com.wangyy.youai.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by qingjiang on 2017/6/15.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User queryUserByUid(long uid) {
        return userDao.queryUserByUid(uid);
    }
}
