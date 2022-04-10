package com.example.demo;


import org.springframework.stereotype.Service;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AbTestService {

    public void abtestservice() throws InterruptedException {
        List<HashMap<String,Object>> scheduleList = new ArrayList<HashMap<String,Object>>();
        HashMap<String,Object> tempMap = new HashMap<>();
        for(int i=0; i<2;i++){
            tempMap.put("TEST_SEQ", LocalDate.now());
            tempMap.put("STAT","IN PROGRESS");
            scheduleList.add(tempMap);
        }
        System.out.printf(tempMap.toString());




    }

}
