package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class AbTestServiceTest {

    @Test
    public void abtestservice() {

        Queue<HashMap<String,Object>> ququ = new LinkedList<>();


        for(int i=0; i<2;i++){
            HashMap<String,Object> tempMap = new HashMap<>();
            tempMap.put("TEST_SEQ", new Date().getTime()+i);
            tempMap.put("STAT","IN PROGRESS");
            ququ.offer(tempMap);
        }
        while(!ququ.isEmpty()){

        }

        for( HashMap<String,Object> temp : ququ ){
            System.out.println(temp.toString());
        }


    }
}