package com.example.demologin.mapper;

import com.example.demologin.pojo.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UsersMapper {

    @Select("select * from user")
    public List<Users> queryUsers();

    @Select("select * from user where username = #{username}")
    public Users queryName(String username);

    @Update("update user set username = #{username},sex = #{sex},address = #{address} where uid = #{uid} ")
    public int upUsers(Users users);

    @Delete("delete from user where uid = #{uid}")
    public int delUsers(int uid);

    @Insert("insert into user (username,birthday,sex,address)values (#{username},#{birthday},#{sex},#{address})")
    public int intUsers(Users users);


    /**
     * 批量删除用户信息
     *
     */
    @Delete("delete from user where uid in #{uid}")
    public int delPathUsers(List<Integer> uid);
}
