// package com.mycompany.toffee;

/**
 *The Product class represents a product in an e-commerce system. It has fields for the
 *product name, ID, brand, description, price, image file, available quantity, and discount percentage
 *It also has fields for the product type and status, which are defined as enums
 * @author shahd khaled , salma amir
 */
public class Product {

    public String name;
    public int id;
    public String brand;
    public String description;
    private ProductType type;
    public double price;
    public String imageFile;
    public ProductStatus status;
    public int availableQuantity;
    public double discountPercentage;

    /**
     *enum represents the status of a product
     */
    public enum ProductStatus {
        out_of_stock,
        on_sale,
        not_on_sale
    }

    /**
     *enum represents the type of a product
     */
    public enum ProductType {
        Loose,
        Unit
    }

    /**
     *Constructs a new product with the specified name, ID, brand, description, price, and available quantity
     *The product type is set to Unit and the product status is set to on_sale by default
     * @param name
     * @param id
     * @param brand
     * @param description
     * @param price
     * @param availableQuantity
     */
    public Product(String name, int id, String brand, String description,
                   double price , int availableQuantity) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.type = ProductType.Unit;
        this.price = price;
        this.status = ProductStatus.on_sale;
        this.availableQuantity = availableQuantity;
        
    }

    /**
     *Displays the product information to the console in a formatted string
     */
    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Description: " + description);
        System.out.println("Product Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Product Status: " + status);
    }

    /**
     *setter that sets the name of the product
     * @param name
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     *setter that sets the id of the product
     * @param id
     */
    void setID(int id) {
        this.id = id;
    }

    /**
     *setter that sets the brand of the product
     * @param brand
     */
    void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *setter that sets the description of the product
     * @param description
     */
    void setDescription(String description) {
        this.description = description;
    }

    /**
     *setter that sets the type of the product
     * @param type
     */
    void setProductType(ProductType type) {
        this.type = type;
    }

    /**
     *setter that sets the price of the product
     * @param price
     */
    void setPrice(double price) {
        this.price = price;
    }

    /**
     *setter that sets the image file of the product
     * @param imageFile
     */
    void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    /**
     *setter that sets the status of the product
     * @param status
     */
    void setProductStatus(ProductStatus status) {
        this.status = status;
    }

    /**
     *setter that sets the available quantity of the product
     * @param availableQuantity
     */
    void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    /**
     *setter that sets the discount percentage of the product
     * @param discount
     */
    void setDiscount(double discount) {
        this.discountPercentage = discount;
    }

    /**
     *getter that returns the name of the product
     * @return name of product
     */
    public String getName() {
        return name;
    }

    /**
     *getter that returns the id of the product
     * @return id of product
     */

    public int getID() {
        return id;
    }

    /**
     *getter that returns the brand of the product
     * @return brand name of product
     */

    public String getBrand() {
        return brand;
    }

    /**
     *getter that returns the description of the product
     * @return description of product
     */

    public String getDescription() {
        return description;
    }

    /**
     *getter that returns the type of the product
     * @return type of product
     */

    public ProductType getProductType() {
        return type;
    }

    /**
     *getter that returns the price of the product
     * @return price of product
     */

    public double getPrice() {
        return price;
    }

    /**
     *getter that returns the image file of the product
     * @return image file of product
     */

    public String getImageFile() {
        return imageFile;
    }

    /**
     *getter that returns the status of the product
     * @return status of product
     */

    public ProductStatus getProductStatus() {
        return status;
    }

    /**
     *getter that returns the available quantity of the product
     * @return available qunatity of product
     */

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     *getter that returns the discount percentage of the product
     * @return discount percentage
     */

    public double getDiscount() {
        return discountPercentage;
    }

    /**
     *getter that returns the available quantity of the product
     * @return available qunatity of product
     */
    

    public int getProductQuantity() {
        return availableQuantity;
    }

    /**
     *Sets the status of the product based on a string representation
     * @param pStatus
     * @throws IllegalArgumentException if the product status is not valid
     */
    public void specifyProductStatus(String pStatus) {
        switch (pStatus.toLowerCase()) {
            case "out_of_stock" -> this.status = ProductStatus.out_of_stock;
            case "on_sale" -> this.status = ProductStatus.on_sale;
            case "not_on_sale" -> this.status = ProductStatus.not_on_sale;
            default -> throw new IllegalArgumentException("Incorrect product status");
        }
    }


}