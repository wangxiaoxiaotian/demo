package com.example.demologin.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private int uid;
    private String username;
    private Date birthday;
    private int sex;
    private String address;
}
