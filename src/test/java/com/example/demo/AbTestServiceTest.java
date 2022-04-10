package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@RunWith(SpringRunner.class)
public class AbTestServiceTest {

    @Test
    public void abtestservice() {


        for(int i=0; i<2;i++){
            HashMap<String,Object> tempMap = new HashMap<>();
            tempMap.put("TEST_SEQ", new Date().getTime()+i);
            tempMap.put("STAT","IN PROGRESS");

        }




    }
}