package com.mycompany.toffee;

import java.util.ArrayList;
import java.util.List;
public class catalog {
    private static List<Category> categories;

    public catalog() {
        categories = new ArrayList<>();
    }

    public void setCategories(List<Category> categories) {
        catalog.categories = categories;
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

    public Product searchItemByName(String name) {
        for (Category category : categories) {
            for (Product product : category.getProducts()) {
                if (product.getName().equalsIgnoreCase(name)) {
                    return product;
                }
            }
        }
        return null;
    }
        public Product searchItemByBrand (String item) {
            for (Category category : categories) {
                for (Product product : category.getProducts()) {
                    if (product.getBrand().equalsIgnoreCase(item)) {
                        return product;
                    }
                }
            }
            return null;
        }

}