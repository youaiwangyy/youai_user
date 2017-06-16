package com.wangyy.youai.web.controller.user.admin;

import com.wangyy.youai.http.ApiResUtil;
import com.wangyy.youai.po.User;
import com.wangyy.youai.service.UserService;
import com.wangyy.youai.util.ApiLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by qingjiang on 2017/6/15.
 */
@Controller
@RequestMapping("/admin/user")
public class UserAdminController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query(@RequestParam(value = "uid", required = true)long uid){
        try {
            long start = System.currentTimeMillis();
            User user = userService.queryUserByUid(uid);
            return ApiResUtil.responseOk(String.valueOf(System.currentTimeMillis() - start), user);
        } catch (Exception e) {
            ApiLogger.error("User query error", e);
            return ApiResUtil.responseFail();
        }
    }



}
