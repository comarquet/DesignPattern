package com.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ObserverLogger extends EventObserver {
    @Override
    public void update(String message) {
        String dateLogStr = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
        System.out.println("LOG [" + dateLogStr + "] : " + message + "\n");
    }
}
