package toffee;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Cart {
    private String imageFile;
    private int itemsQuantity;
    private double itemPrice;
    private double subTotal;
    private List<Product> items;

    public Cart(String imageFile, int itemsQuantity, double itemPrice) {
        this.imageFile = imageFile;
        this.itemsQuantity = itemsQuantity;
        this.itemPrice = itemPrice;
        items = new ArrayList<>();
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public void setItemsQuantity(int itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    public void setItems(List<Product> items) {
        this.items = items;
    }

    public String getImageFile() {
        return imageFile;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public double getSubTotal() {
        return subTotal;
    }
    public List<Product> getItems() {
        return items;
    }

    public void addCartItem(Product item) {
        items.add(item);
    }

    public void removeCartItem(Product item) {
        items.remove(item);
    }

    public void updateItemQuantity(Product items, int itemQuantity) {
        items.setAvailableQuantity(itemQuantity);
    }

    public double calculateSubTotal() {
        double subTotal = 0.0;
        for (Product item : items) {
            double discount = item.getDiscount();
            double price = item.getPrice();
            int quantity = item.getAvailableQuantity();
            subTotal += (price * quantity * discount);
        }
        return subTotal;
    }

    public void viewCartDetails() {
        out.println("Cart Details: ");
        for (Product item : items) {
            out.println(item.getName() + item.getAvailableQuantity() + item.getPrice() * item.getAvailableQuantity());
        }
        System.out.println("Subtotal: " + calculateSubTotal());
    }



}
