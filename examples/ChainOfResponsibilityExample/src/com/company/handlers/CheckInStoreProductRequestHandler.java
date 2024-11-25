package com.company.handlers;

import com.company.model.ProductRequest;
import com.company.model.ProductStore;

import java.util.List;

public class CheckInStoreProductRequestHandler extends AbstractRequestHandler {
    /** This handler checks if the requested product exists in store */

    public void handleRequest(ProductRequest request) {
        List<String> pList = ProductStore.getProductsList();
        String pId = request.getProductId();
        Boolean res = pList.contains(pId);


        if (!ProductStore.getProductsList().contains(request.getProductId())) {
            System.out.println("The product does not exist in store, we stop the request handling and send a message");
        } else {
            super.handleRequest(request);
        }
    }
}
