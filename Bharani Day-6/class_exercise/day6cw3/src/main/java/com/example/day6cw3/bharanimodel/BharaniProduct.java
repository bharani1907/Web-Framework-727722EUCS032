package com.example.day6cw3.bharanimodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BharaniProduct {
    @Id
    private int productId;
    private String productName;
    private String category;
    private int price;
    public BharaniProduct(int productId, String productName, String category, int price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }
    public BharaniProduct() {
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
