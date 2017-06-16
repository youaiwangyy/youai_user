package com.wangyy.youai.web.controller;

import com.alibaba.fastjson.JSON;
import com.wangyy.youai.po.User;
import com.wangyy.youai.service.UserService;
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
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET, headers = "Accept=application/json")
    public String query(@RequestParam(value = "uid", required = true) long uid){
        User user = userService.queryUserByUid(uid);
        return JSON.toJSONString(user);
    }



}
