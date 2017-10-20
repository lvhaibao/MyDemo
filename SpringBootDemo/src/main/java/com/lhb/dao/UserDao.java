package com.lhb.dao;

import com.lhb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by ${吕海保}
 * 2017/10/19 11:47.
 */
//@Component 其实这里是不用的
public interface UserDao extends JpaRepository<User,Integer>{

}
