package com.company.good;

import java.util.ArrayList;
import java.util.List;

public class ObservableProductController extends AbstractProductControllerObservable {
    private List<ProductOrder> allProductOrders = new ArrayList<>();

    public void placeProductOrder(int quantity, String productName) {
        /* Perform business logic with message */
        if (quantity <= 0) {
            System.err.println("Wrong quantity");
            return;
        }


        ProductOrder newProduct = new ProductOrder(quantity, productName);
        this.allProductOrders.add(newProduct);

        /* Notify observers */
        this.notifyObservers(newProduct, this.allProductOrders);
    }
}
