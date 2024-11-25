package com.company.handlers;

import com.company.model.ProductRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingProductRequestHandler extends AbstractRequestHandler {
    /** This handler logs every product request */

    public void handleRequest(ProductRequest request) {
        String dateLogStr = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
        String logMsgStr = "Product " + request.getProductId() + " was ordered " + request.getQuantity() + " time(s)";
        System.out.println("LOG [" + dateLogStr + "] : " + logMsgStr + "\n");

        super.handleRequest(request);
    }
}
