package com.example.productlistview.entity;

public class Product {
    private String title;
    private String description;
    private float price;
    private int image;

    public Product() {
    }

    public Product(String title, String description, float price, int image) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
