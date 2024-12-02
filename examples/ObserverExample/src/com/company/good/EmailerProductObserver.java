package com.company.good;

import java.util.List;

public class EmailerProductObserver implements ProductObserverInterface {


    @Override
    public void update(ProductOrder newOrder, List<ProductOrder> currentProductOderList) {
        System.out.println("\n==== SENDING THE FOLLOWING EMAIL ===");
        System.out.println("Object: Your latest order");
        System.out.println("" + newOrder.getQuantity() +" of " + newOrder.getProductName());
        System.out.println("=======\n");
    }
}
