package com.example.demologin.services;

import com.example.demologin.pojo.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UsersServices {

    public List<Users> queryUsers();

    public Users queryName(String username);

    public boolean upUsers(Users users);

    public boolean delUsers(int uid);

    public boolean intUsers(Users users);


    /**
     * 批量删除用户信息
     *
     */
    public boolean delPathUsers(List<Integer> uid);
}
