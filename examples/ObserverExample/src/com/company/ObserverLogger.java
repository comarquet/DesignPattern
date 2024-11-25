package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ObserverLogger implements AbstractEventObserver {


    @Override
    public void update(String message) {
        String dateLogStr = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
        System.out.println("LOG [" + dateLogStr + "] : " + message + "\n");
    }
}
