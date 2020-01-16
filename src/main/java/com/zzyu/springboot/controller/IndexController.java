package com.zzyu.springboot.controller;

import com.zzyu.springboot.util.redis.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@Api(description = "redis操作接口",value = "indexController")
public class IndexController {


    @Autowired
    RedisUtil redisUtil;

    @ApiOperation(value = "设置redis key Value", notes="返回value")
    @RequestMapping(value = "testRedis", method=RequestMethod.GET)
    @ResponseBody
    public String TestRedis(String key,String value){
        redisUtil.set(key,value);
        String  o = redisUtil.get(key).toString();
        return o;
    }
}
