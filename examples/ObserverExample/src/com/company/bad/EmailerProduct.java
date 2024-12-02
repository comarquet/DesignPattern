package com.company.bad;

import java.util.List;

public class EmailerProduct {

    public void email(ProductOrder newOrder, List<ProductOrder> currentProductOderList) {
        System.out.println("\n==== SENDING THE FOLLOWING EMAIL ===");
        System.out.println("Object: Your latest order");
        System.out.println("" + newOrder.getQuantity() +" of " + newOrder.getProductName());
        System.out.println("=======\n");
    }
}
