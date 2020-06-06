package com.example.demologin.controller;

import com.example.demologin.pojo.Users;
import com.example.demologin.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UsersController {

    @Autowired
    private UsersServices usersServices;

    @RequestMapping(value = "queryUsers",method = RequestMethod.GET)
    public Map<String,Object> queryUsers (){
        List<Users> users = usersServices.queryUsers();
        Map<String,Object> map = new HashMap<>();
        map.put("msg",users);
        return map;
    }

    @RequestMapping(value = "queryName",method = RequestMethod.GET)
    public Map<String,Object> queryName(@RequestParam("username")String username){
        Map<String,Object> map = new HashMap<>();
        Users users = usersServices.queryName(username);
        map.put("msg",users);
        return map;
    }

    @RequestMapping(value = "upUsers",method = RequestMethod.PUT)
    public Map<String,Object> upUsers(){
        Map<String,Object> map = new HashMap<>();
        Users users = new Users();
        users.setSex(1);
        users.setAddress("山慈");
        users.setBirthday(new Date());
        boolean b = usersServices.upUsers(users);
        map.put("msg",b);
        return map;
    }

    @RequestMapping(value = "delUsers/{uid}",method = RequestMethod.DELETE)
    public Map<String,Object> delUsers(@PathVariable("uid")int uid){
        Map<String,Object> map = new HashMap<>();
        boolean b = usersServices.delUsers(uid);
        map.put("msg",b);
        return map;
    }

    @RequestMapping(value = "intUsers",method = RequestMethod.GET)
    public Map<String,Object> intUsers(){
        Map<String,Object> map = new HashMap<>();
        Users users = new Users();
        users.setSex(1);
        users.setAddress("llp");
        users.setUsername("kl");
        users.setBirthday(new Date());
        boolean b = usersServices.intUsers(users);
        map.put("msg",b);
        return map;
    }

    @RequestMapping(value = "delPathUsers",method = RequestMethod.DELETE)
    public Map<String,Object> delPathUsers(List<Integer> uid){
        Map<String,Object> map = new HashMap<>();
        boolean b = usersServices.delPathUsers(uid);
        map.put("msg",b);
        return map;
    }


}

























