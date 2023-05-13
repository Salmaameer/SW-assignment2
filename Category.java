package com.mycompany.toffee;

public class Category {
    private String name;
    private int pQuantity;
    private Product[] products;
    private double discountP;
    public Category(String name, int pQuantity, Product[] products, double discountP) {
        this.name = name;
        this.pQuantity = pQuantity;
        this.products = products;
        this.discountP = discountP;
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setPQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void setDiscountP(double discountP) {
        this.discountP = discountP;
    }
    public String getName() {
        return name;
    }
    public int getPQuantity() {
        return pQuantity;
    }
    public Product[] getProducts() {
        return products;
    }
    public double getDiscountP() {
        return discountP;
    }

        public void showItem() {
        System.out.println("Category Name: " + name);
        System.out.println("Num Of Products: " + pQuantity);
        System.out.println("Discount Percentage: " + discountP);
    }



}
