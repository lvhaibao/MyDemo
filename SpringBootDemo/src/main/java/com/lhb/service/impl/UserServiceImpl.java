package com.lhb.service.impl;

import com.lhb.dao.UserDao;
import com.lhb.entity.User;
import com.lhb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ${吕海保}
 * 2017/10/19 11:56.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() throws Exception{
        return userDao.findAll();
    }

    @Override
    public User save(User user) throws Exception{
        return userDao.save(user);
    }

    @Override
    public User findById(Integer id) throws Exception{
        return userDao.findOne(id);
    }

    @Override
    public void deleteById(Integer id) throws Exception{
        userDao.delete(id);
    }
}
