package com.example.xdclass.mapper;

import com.example.xdclass.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserMapper {
    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("aaa",new User(1,"aaa","123"));
        userMap.put("bbb",new User(2,"bbb","123"));
        userMap.put("ccc",new User(3,"ccc","123"));

    }

    public User login(String username,String pwd){
        User user = userMap.get(username);
        if(user==null){
            return null;
        }
        if(user.getPwd().equals(pwd)){
             return user;

        }
        return null;
    }

    public List<User> listUser(){

        List<User> list = new ArrayList<>();
        list.addAll(userMap.values());
        return list;

    }


}
