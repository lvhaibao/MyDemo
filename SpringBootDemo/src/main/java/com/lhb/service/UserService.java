package com.lhb.service;

import com.lhb.entity.User;

import java.util.List;

/**
 * Created by 吕海保
 * 2017/10/19 11:50.
 */

public interface UserService {

    public List<User> findAll() throws Exception;

    public User save(User user)throws Exception;

    public User findById(Integer id)throws Exception;

    public void deleteById(Integer id)throws Exception;



}
