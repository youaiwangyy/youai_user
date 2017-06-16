package com.wangyy.youai.dao.impl;

import com.wangyy.youai.common.enums.SexEnum;
import com.wangyy.youai.dao.UserDao;
import com.wangyy.youai.po.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by qingjiang on 2017/6/14.
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    private Logger logger = LogManager.getLogger(UserDaoImpl.class.getName());

    private static final String QUERY_ONE_UID = "select * from user where uid = ?";
    private static final String QUERY_LIST_SEX = "select * from user where sex = ?";

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public User queryUserByUid(long uid) {

        return jdbcTemplate.query(QUERY_ONE_UID, new Object[]{uid}, (rs) -> {
            if (rs.next()) {
                return getUserByRs(rs);
            }
            return null;
        });
    }


    @Override
    public List<User> queryUserBySex(SexEnum sexEnum) {
        return jdbcTemplate.query(QUERY_LIST_SEX, new Object[]{sexEnum.getId()}, (rs, i) -> {
            return getUserByRs(rs);
        });
        /*RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbcTemplate.query(QUERY_LIST_SEX, new Object[]{sexEnum.getId()}, rowMapper);*/
    }

    @Override
    public boolean saveUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUserByUid() {
        return false;
    }

    @Override
    public boolean updateUserPasswordByUid(long uid, String password) {
        return false;
    }

    private User getUserByRs(ResultSet rs) throws SQLException {
        if (rs != null) {
            try {
                User user = new User();
                user.setUid(rs.getLong("uid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setSex(rs.getByte("sex"));
                user.setExt(rs.getString("ext"));
                return user;
            } catch (Exception e) {
                logger.error("Get user by result set error", e);
            }
        }
        return null;
    }
}
