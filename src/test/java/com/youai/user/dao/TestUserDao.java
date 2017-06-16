package com.youai.user.dao;

import com.alibaba.fastjson.JSONObject;
import com.wangyy.youai.common.enums.SexEnum;
import com.wangyy.youai.dao.UserDao;
import com.wangyy.youai.po.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qingjiang on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/commons/mvc-dispatcher-servlet.xml")
public class TestUserDao {

    private static final Logger logger = LogManager.getLogger(TestUserDao.class);
    @Resource
    private UserDao userDao;

    @Test
    public void testQueryUserById() {
        User user = userDao.queryUserByUid(1001);

        logger.debug("user:" + JSONObject.toJSONString(user));
        logger.info("user:" + JSONObject.toJSONString(user));
        logger.warn("user:" + JSONObject.toJSONString(user));
        logger.error("user:" + JSONObject.toJSONString(user));
    }


    @Test
    public void testQueryUserBySex() {
        List<User> users = userDao.queryUserBySex(SexEnum.MALE);
        System.out.println("user:" + JSONObject.toJSONString(users));
    }

}
