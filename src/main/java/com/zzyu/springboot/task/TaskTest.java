package com.zzyu.springboot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springbootShiro
 * @Package: com.zzyu.springboot.task
 * @ClassName: TaskTest
 * @Author: zeyu.zhang
 * @Description: ${description}
 * @Date: 2020/1/9 13:18
 * @Version: 1.0
 */

@Component
public class TaskTest {

    @Scheduled(cron = "0/5 * * * * ?")
    public void  lock(){
        System.out.println("=============定时任务开启=============");
    }
}
