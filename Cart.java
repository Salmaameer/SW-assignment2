// package com.mycompany.toffee;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

/**
 * The Cart class is used to represent and manage a shopping cart. It provides methods to add and remove items from the cart, view the details of the items in the cart, and calculate the subtotal of the items in the cart. The class can be used in a shopping or e-commerce application to allow users to add items to their cart, view their cart, and proceed to checkout.
 */
public class Cart {
    private String imageFile;
    private int itemsQuantity;
    private double itemPrice;
    private double subTotal;
    private List<CartItem> items = new ArrayList<>();
    

    Cart(){

        
    }

    /**
     * 
     * @param imageFile
     * @param itemsQuantity
     * @param itemPrice
     */
    public Cart(String imageFile, int itemsQuantity, double itemPrice) {
        this.imageFile = imageFile;
        this.itemsQuantity = itemsQuantity;
        this.itemPrice = itemPrice;
        items = new ArrayList<>();
    }
/**
 * The viewCartDetails method displays the details of the items in the cart
 */
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
    
    /** 
     * The addToCartItem method adds an item to the cart and updates the itemsQuantity and subTotal fields
     * @param item
     */
    public void addToCartItem(CartItem item) {
            items.add(item);
            itemsQuantity += 1;
            subTotal += item.getItemTotal();
    }
    
    /** 
     * The removeItemFromCart method removes an item from the cart and updates the itemsQuantity and subTotal fields.
     * @param item
     */
    public void removeItemFromCart(CartItem item) {
        if ( items.contains(item) ) {
            items.remove(item);
            itemsQuantity -= 1;
            subTotal -= item.getItemTotal();
        }

    }




    
    /** 
     * @param imageFile
     */
    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    
    /** 
     * @param itemsQuantity
     */
    public void setItemsQuantity(int itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }

    
    /** 
     * @param itemPrice
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    
    /** 
     * @param subTotal
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    
    /** 
     * @param items
     */
    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    
    /** 
     * @return String
     */
    public String getImageFile() {
        return imageFile;
    }

    
    /** 
     * @return int
     */
    public int getItemsQuantity() {
        return itemsQuantity;
    }

    
    /** 
     * @return double
     */
    public double getItemPrice() {
        return itemPrice;
    }

    
    /** 
     * @return double
     */
    public double getSubTotal() {
        return subTotal;
    }

    
    /** 
     * @return List<CartItem>
     */
    public List<CartItem> getItems() {
        return items;
    }

    
    

    
}
