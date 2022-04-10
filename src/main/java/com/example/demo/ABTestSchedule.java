package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ABTestSchedule {


    private static Logger logger = LoggerFactory.getLogger(ABTestSchedule.class);
    public AbTestService abTestService;

    public Queue<Integer> ququ = new LinkedList<Integer>();
    public List<HashMap<String ,Object>> maplist = new ArrayList<>();
    public ABTestSchedule(AbTestService abTestService) {
        this.abTestService = abTestService;

//        for (int i = 0; i < 10; i++) {
//            HashMap<String,Object> temp = new HashMap<>();
//            temp.put("TEST_SEQ",i);
//            temp.put("IS PROCESS",0);
//            ququ.offer(temp);
//        }

        for (int i = 0; i <100 ; i++) {
            HashMap<String,Object> test = new HashMap<>();
            test.put("TEST_SEQ",(new Date().getTime()+i));
            test.put("SEPC","REVIEW");
            maplist.add(test);
            ququ.offer((int) (new Date().getTime()+i));
        }





    }



    //    @Scheduled(fixedDelay = 10000,fixedDelayString = )fixedDelayString


    @Scheduled(fixedDelay = 2000)
    public String test() throws InterruptedException {

        if(ququ.isEmpty()){
            logger.info("END");
            return "end";
        }else{
            abTestService.treaddd(ququ.poll());
            return "statt";
        }


//        if(ququ.poll().get("IS PROCESS").equals(0)){
//
//        }


    }




}
