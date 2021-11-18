package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {

    public static List<String> getProductsList() {
        List<String> productsList = new ArrayList<>();
        productsList.add("FORK");
        productsList.add("MUG");
        productsList.add("PLATE");
        return productsList;
    }

}
