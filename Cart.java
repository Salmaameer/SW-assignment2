// package com.mycompany.toffee;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Cart {
    private String imageFile;
    private int itemsQuantity;
    private double itemPrice;
    private double subTotal;
    private List<CartItem> items = new ArrayList<>();
    

    Cart(){

        
    }

    public Cart(String imageFile, int itemsQuantity, double itemPrice) {
        this.imageFile = imageFile;
        this.itemsQuantity = itemsQuantity;
        this.itemPrice = itemPrice;
        items = new ArrayList<>();
    }

    public void viewCartDetails() {
       
        if( items.size() > 0){
            System.out.println("Cart Details: ");
        for (CartItem item : items) {
            System.out.println("Name: " + item.getName() +  "\n Quantity: " + item.getQuantity() + "\n total price: " + item.getItemTotal());
        }
        System.out.println("subTotal is :" + getSubTotal());

    }else{
        System.out.println("Your Cart is empty");
    }
    }
    public void addToCartItem(CartItem item) {
            items.add(item);
            itemsQuantity += 1;
            subTotal += item.getItemTotal();
    }
    public void removeItemFromCart(CartItem item) {
        if ( items.contains(item) ) {
            items.remove(item);
            itemsQuantity -= 1;
            subTotal -= item.getItemTotal();
        }

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

    public void setItems(List<CartItem> items) {
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

    public List<CartItem> getItems() {
        return items;
    }

    
    

    
}
