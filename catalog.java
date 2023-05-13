// package com.mycompany.toffee;

import java.util.ArrayList;
import java.util.List;

public class Catalog{
    private  List<Category> categories = new ArrayList<>();


    public Catalog() {
       
    }

    public  void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public  void addCategory(Category category) {

        categories.add(category);

    }

    public  void showItems() {
        for (Category category : categories) {
            System.out.println("Category Name: " + category.getName());
            category.showItems();
        }
    }

    public Product searchItemByName(String categoryName, String productName) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                for (Product product : category.getProducts()) {
                    if (product.getName().equalsIgnoreCase(productName)) {
                        return product;
                    }
                }
            }
        }
        return null;
    }
    public Product searchItemByBrand(String categoryName, String productName) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                for (Product product : category.getProducts()) {
                    if (product.getBrand().equalsIgnoreCase(productName)) {
                        return product;
                    }
                }
            }
        }
        return null;
    }

}