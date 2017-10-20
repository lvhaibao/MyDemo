package com.lhb.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ${吕海保}
 * 2017/10/19 11:39
 */
@Entity
@Component
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    public User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
