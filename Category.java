// package com.mycompany.toffee;


import java.util.ArrayList;
import java.util.List;


public class Category {
    private String name;
    private int pQuantity;
    private List<Product> products = new ArrayList<>() ;
    private double discountP;


    public Category(String name, int pQuantity, List<Product> products, double discountP) {
        this.name = name;
        this.pQuantity = pQuantity;
        this.products = products;
        this.discountP = discountP;
    }



    public void showItems() {
        for (Product p : products) {

            System.out.println("Product name : " + p.getName() + "\nPrice: " + p.getPrice());
            System.out.println("\n");

        }
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setPQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }
    public void setProducts(List<Product> products) {
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
    public List<Product> getProducts() {
        return products;
    }
    public double getDiscountP() {
        return discountP;
    }

       



}
