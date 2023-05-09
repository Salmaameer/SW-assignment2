package toffee;

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
    public double discount;
    public enum ProductStatus {
        out_of_stock,
        on_sale,
        not_on_sale
    }
    public enum ProductType {
        Loose,
        Unit
    }
    public Product(String name, int id, String brand, String description, ProductType type,
                   double price, String imageFile, ProductStatus status, int availableQuantity, double discount) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.type = type;
        this.price = price;
        this.imageFile = imageFile;
        this.status = status;
        this.availableQuantity = availableQuantity;
        this.discount = discount;
    }
    void setName(String name) {
        this.name = name;
    }
    void setID(int id) {
        this.id = id;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }
    void setDescription(String description) {
        this.description = description;
    }
    void setProductType(ProductType type) {
        this.type = type;
    }
    void setPrice(double price) {
        this.price = price;
    }
    void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
    void setProductStatus(ProductStatus status) {
        this.status = status;
    }
    void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    void setDiscount(double discount) {
        this.discount = discount;
    }
    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public ProductType getProductType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getImageFile() {
        return imageFile;
    }

    public ProductStatus getProductStatus() {
        return status;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getDiscount() {
        return discount;
    }
    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Description: " + description);
        System.out.println("Product Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Image File: " + imageFile);
        System.out.println("Product Status: " + status);
    }
    public void displayProductDetails() {
        displayProduct();
        System.out.println("Available Quantity: " + availableQuantity);
        System.out.println("Discount: " + discount);
    }

    public int getProductQuantity() {
        return availableQuantity;
    }
    public void specifyProductStatus(String pStatus) {
        switch (pStatus.toLowerCase()) {
            case "out_of_stock" -> this.status = ProductStatus.out_of_stock;
            case "on_sale" -> this.status = ProductStatus.on_sale;
            case "not_on_sale" -> this.status = ProductStatus.not_on_sale;
            default -> throw new IllegalArgumentException("Incorrect product status");
        }
    }

}
