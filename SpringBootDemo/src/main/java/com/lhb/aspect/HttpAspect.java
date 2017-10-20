package com.lhb.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author 吕海保
 * @date 2017/10/20 11:24
 * @Description 请求拦截，获取做日志处理
 */
@Aspect
@Component
public class HttpAspect {
    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    @Pointcut("execution(public * com.lhb.controller.UserController.*(..))")
    public void log(){

    }
    @Before("log()")
    public void doBefore(){
        //拦截
        logger.info("log......");
    }
}
