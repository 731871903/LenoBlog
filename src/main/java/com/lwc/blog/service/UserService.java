package com.lwc.blog.service;


import com.lwc.blog.po.User;

/**
 * Created by limi on 2017/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
