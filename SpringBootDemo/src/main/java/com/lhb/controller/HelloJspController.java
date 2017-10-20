package com.lhb.controller;

import com.lhb.entity.User;
import com.lhb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * 返回一个页面
 * Created by {吕海保}
 * 2017/10/19 17:53
 */
@Controller
public class HelloJspController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/index")
    public String hello(Map<String,Object> map,String  name){
        System.out.println(name); //获取参数了
        map.put("name", name);
        return "testFTL";
    }

    @RequestMapping(value = "/modelAndView",method = RequestMethod.GET)
    public ModelAndView modelAndView(){;
        ModelAndView modelAndView = new ModelAndView("testModelAndView");
        List<User> userList= userService.findAll();
        modelAndView.addObject("userList", userList);
        return  modelAndView;
    }

    @GetMapping(value = "test3/{id}")
    public String test3(@PathVariable("id") String id){
        System.out.println(id);
        return null;
    }

}
