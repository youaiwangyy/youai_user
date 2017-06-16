package com.wangyy.youai.dao;

import com.wangyy.youai.common.enums.SexEnum;
import com.wangyy.youai.po.User;

import java.util.List;

/**
 * Created by qingjiang on 2017/6/14.
 */
public interface UserDao {

    User queryUserByUid(long uid);

    List<User> queryUserBySex(SexEnum sexEnum);

    boolean saveUser(User user);

    boolean deleteUserByUid();

    boolean updateUserPasswordByUid(long uid, String password);

}
