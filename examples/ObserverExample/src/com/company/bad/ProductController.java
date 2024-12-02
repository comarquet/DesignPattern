package com.company.bad;


import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<ProductOrder> allProductOrders = new ArrayList<>();
    EmailerProduct emailer = new EmailerProduct();
    LoggerProduct logger = new LoggerProduct();

    public void placeProductOrder(int quantity, String productName) {
        /* Perform business logic with message */
        if (quantity <= 0) {
            System.err.println("Wrong quantity");
            return;
        }

        ProductOrder newProduct = new ProductOrder(quantity, productName);
        this.allProductOrders.add(newProduct);

        this.emailer.email(newProduct, this.allProductOrders);
    }
}
