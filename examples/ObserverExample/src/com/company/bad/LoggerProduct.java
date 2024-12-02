package com.company.bad;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LoggerProduct {



    public void log(ProductOrder newOrder, List<ProductOrder> currentProductOderList) {
        String dateLogStr = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
        System.out.println("LOG [" + dateLogStr + "] Order placed (" + newOrder.toString() + ")" );
        System.out.println("LOG [" + dateLogStr + "] Total number of orders : " + currentProductOderList.size());
    }
}
