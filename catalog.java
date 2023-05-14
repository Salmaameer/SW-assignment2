// package com.mycompany.toffee;

import java.util.ArrayList;
import java.util.List;

/**
 *The Catalog class represents a collection of categories and their associated products
 *It provides methods for adding categories to the catalog, searching for products by name
 *or brand, and displaying the items in the catalog.
 * @author salma amir, shahd khaled
 */
public class Catalog{
    private  List<Category> categories = new ArrayList<>();

    /**
     *default constructor
     */
    public Catalog() {
       
    }
    /**
     * setter that sets the categories in the catalog to the specified list of categories.
     * @param categories the list of categories to set
     */
    public  void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     *getter that returns the list of categories in the catalog
     * @return the list of categories in the catalog
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     *adds the specified category to the catalog
     * @param category the category to add
     */
    public  void addCategory(Category category) {

        categories.add(category);

    }

    /**
     *Displays the items in the catalog, grouped by category.
     */

    public  void showItems() {
        for (Category category : categories) {
            System.out.println("Category Name: " + category.getName());
            category.showItems();
        }
    }

    /**
     *Searches for a product by name in the specified category
     * @param categoryName
     * @param productName
     * @return product with the specified name, or null if not found
     */
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

    /**
     *searches for a product by brand in the specified category
     * @param categoryName
     * @param productName
     * @return product with the specified name, or null if not found
     */
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