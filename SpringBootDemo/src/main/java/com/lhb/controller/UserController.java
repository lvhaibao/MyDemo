package com.lhb.controller;

import com.lhb.entity.Result;
import com.lhb.entity.User;
import com.lhb.service.UserService;
import com.lhb.utils.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ${吕海保}
 * 2017/10/19 11:58
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;
   /* @GetMapping(value = "/userList")
    public String  userList(Model model,Integer type){
        List<User> userList= userService.findAll();
        String name = "admin";
        model.addAttribute("userList",userList);
        model.addAttribute("username",name);
        return "userList";
    }
    @GetMapping(value = "/saveUser")
    public User saveUser(){
        User user = new User();
        user.setName("aaa");
        user.setAge(21);
        return userService.save(user);
    }*/

    /**
     * 添加数据
     * @param user
     * @return
     */
    @PostMapping(value = "/save")
    public User save(User user) throws Exception {
        return userService.save(user);
    }

    /**
     * 查找全部数据
     * @return
     */
    @GetMapping(value = "/find")
    public List<User> find() throws Exception {
        return userService.findAll();
    }

    /**
     * 通过id查找
     * @param id
     * @return
     */
    @GetMapping(value = "/findById")
    public Result<User> findById(Integer id) throws Exception {
        User user = userService.findById(id);
        if(null!=user){
            return ResultUtil.success(user);
        }
        else return ResultUtil.error();
    }

    /**
     * 根据id删除
     * @param id
     */
    @DeleteMapping(value = "/deleteById")
    public void deleteById(Integer id) throws Exception {
        userService.deleteById(id);
    }



}
