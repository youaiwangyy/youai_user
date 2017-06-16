package com.wangyy.youai.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wangyy.youai.dao.UserDao;
import com.wangyy.youai.po.User;
import com.wangyy.youai.service.UserService;
import com.wangyy.youai.util.ApiLogger;
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
        User user = userDao.queryUserByUid(uid);
        ApiLogger.info("User info:" + JSONObject.toJSONString(user));
        ApiLogger.debug("User info:" + JSONObject.toJSONString(user));
        ApiLogger.error("User info:" + JSONObject.toJSONString(user));
        return user;
    }
}
