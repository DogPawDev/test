package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AbTestService {

    private static Logger logger = LoggerFactory.getLogger(AbTestService.class);


    @Async
    public void treaddd(Integer map) throws InterruptedException {

            logger.info("실행 중인 스케줄 : {}",map);
            Thread.sleep(10000);




    }

}
