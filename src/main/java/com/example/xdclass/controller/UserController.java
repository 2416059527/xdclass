package com.example.xdclass.controller;

import com.example.xdclass.domain.User;
import com.example.xdclass.mapper.UserMapper;
import com.example.xdclass.service.UserService;
import com.example.xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pub/user")
public class UserController {
    /*@PostMapping("/login")
    public JsonData login(String username,String pwd){
        System.out.println("username ="+username+" pwd="+pwd);
        return JsonData.buildSuccess("");
    }*/
    @Autowired
    private UserService userService;

    /**
     * 登录接口
     */

    @PostMapping("/login")
    public JsonData login(@RequestBody User user){

        System.out.println("user ="+user.toString());
        String token = userService.login(user.getUsername(), user.getPwd());

        return token!=null ? JsonData.buildSuccess(token) : JsonData.buildError("账号或者密码错误");
    }

    @GetMapping("list")
    public JsonData listUser(){

        return JsonData.buildSuccess(userService.listUser());

    }


}
