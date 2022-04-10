package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

@Component
public class ABTestSchedule {


    private static Logger logger = LoggerFactory.getLogger(ABTestSchedule.class);

    //    @Scheduled(fixedDelay = 10000,fixedDelayString = )fixedDelayString


    @Scheduled(fixedDelay = 1000)
    public HashMap<String ,Object> test(){

        Queue<HashMap<String,Object>> ququ = new LinkedList<>();
        for(int i=0; i<2;i++){
            HashMap<String,Object> tempMap = new HashMap<>();
            tempMap.put("TEST_SEQ", new Date().getTime()+i);
            tempMap.put("STAT","IN PROGRESS");
            ququ.offer(tempMap);
        }


        return ququ.poll();
    }

    @Async
    public void treaddd() throws InterruptedException {
        Thread.sleep(10000);
    }

    @Async

    public void alert() {

        logger.info("현재 시간 : {}", new Date());
        logger.info("");
    }

}
