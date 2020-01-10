package com.zzyu.springboot.controller;

import com.zzyu.springboot.util.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: springbootShiro
 * @Package: com.zzyu.springboot.controller
 * @ClassName: IndexController
 * @Author: zeyu.zhang
 * @Description: ${description}
 * @Date: 2020/1/10 11:11
 * @Version: 1.0
 */

@Controller
public class IndexController {


    @Autowired
    RedisUtil redisUtil;


    @RequestMapping("testRedis")
    @ResponseBody
    public String TestRedis(String key,String value){
        redisUtil.set(key,value);
        String  o = redisUtil.get(key).toString();
        return o;
    }
}
