package com.wangyy.youai.web.controller.user.api;

import com.wangyy.youai.http.ApiResUtil;
import com.wangyy.youai.po.User;
import com.wangyy.youai.service.UserService;
import com.wangyy.youai.util.ApiLogger;
import com.wangyy.youai.util.CommonNumberUtil;
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
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query(@RequestParam(value = "uid", required = true)long uid){
        try {
            long start = System.currentTimeMillis();
            User user = userService.queryUserByUid(uid);
            return ApiResUtil.responseOk(CommonNumberUtil.timeDiff(start, System.currentTimeMillis()), user);
        } catch (Exception e) {
            ApiLogger.error("User query error", e);
            return ApiResUtil.responseFail();
        }
    }



}
