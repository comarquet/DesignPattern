package com.company.good;

public class ProductOrder {
    protected int quantity;
    protected String productName;

    public ProductOrder(int quantity, String productName) {
        this.quantity = quantity;
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String toString() {
        return "Product name: " + this.productName + "; Quantity: " + this.quantity;
    }
}
