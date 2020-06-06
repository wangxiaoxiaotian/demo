package com.example.demologin.services.imple;

import com.example.demologin.mapper.UsersMapper;
import com.example.demologin.pojo.Users;
import com.example.demologin.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersServicesImple implements UsersServices {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> queryUsers() {
        return usersMapper.queryUsers();
    }

    @Override
    public Users queryName(String username) {
        return usersMapper.queryName(username);
    }

    @Override
    public boolean upUsers(Users users) {
        return usersMapper.upUsers(users)>0;
    }

    @Override
    public boolean delUsers(int uid) {
        return usersMapper.delUsers(uid)>0;
    }

    @Override
    public boolean intUsers(Users users) {
        return usersMapper.intUsers(users)>0;
    }

    @Override
    public boolean delPathUsers(List<Integer> uid) {
        return usersMapper.delPathUsers(uid)>0;
    }
}
