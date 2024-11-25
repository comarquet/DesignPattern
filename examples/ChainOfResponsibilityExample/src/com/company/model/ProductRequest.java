package com.company.model;

public class ProductRequest {
    private String productId;
    private int quantity;

    public ProductRequest(String productId, int quantity) {
        this.quantity = quantity;
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductId() {
        return productId;
    }

}
