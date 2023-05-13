// package com.mycompany.toffee;

import java.util.ArrayList;
import java.util.List;

public class Catalog{
    private static List<Category> categories;

    public Catalog() {
        categories = new ArrayList<>();
    }

    public static void setCategories(List<Category> categories) {
        Catalog.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public static void addCategory(Category category) {
        categories.add(category);
    }

    public void showItems() {
        for (Category category : categories) {
            category.showItem();
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