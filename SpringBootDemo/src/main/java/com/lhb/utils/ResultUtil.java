package com.lhb.utils;

import com.lhb.entity.Result;

/**
 * @author 吕海保
 * @date 2017/10/20 19:00
 * @Description
 */
public class ResultUtil {

    private ResultUtil(){

    }
    public static Result success (Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("ok");
        result.setData(object);
        return result;
    }
    public static Result error(){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("error");
        return result;
    }

}
