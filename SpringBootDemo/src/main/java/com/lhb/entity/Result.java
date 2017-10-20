package com.lhb.entity;

/**
 * @author 吕海保
 * @date 2017/10/20 18:57
 * @Description
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;   //相等与代表一个object

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
