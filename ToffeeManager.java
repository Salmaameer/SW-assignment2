// package com.mycompany.toffee;

import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;


/**
 * ToffeeManager class it manages and maintains the sequence of the system and provides the start shopping and place order methods 
 */
public class ToffeeManager {

    

    
    /** 
     * @param cart
     * @param catalog
     * this method prompts the user to enter a category name and product name, then searches for the product in the catalog.
     * 
     */
    public static void startShopping(Cart cart , Catalog catalog) {

       
        Scanner input = new Scanner(System.in);
        
        System.out.print("category name: ");
        String CategoryName = input.nextLine();
        System.out.print("Enter the product name: ");
        String ItemName = input.nextLine();

        Product searchedItem = catalog.searchItemByName(CategoryName,ItemName);

        int quantity ;

      
        if(searchedItem != null){
            searchedItem.displayProductDetails();
            System.out.print("\n");
            System.out.print("do you want to add to cart?(y/n):");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase("y")){
                System.out.print("Enter quantity : ");
                quantity = input.nextInt();
                CartItem cartItem = new CartItem(quantity,searchedItem );
                cart.addToCartItem(cartItem);
            }
            

        }else{
            System.out.println("This item doesnt exsit ");
        }
    

       
       

       

    }


    
    /** 
     * @param customer
     * @param cart
     * 
     * this method allows the customer to view their cart details, enter their address, choose a payment method, and place an order
     */
    public static void placeCustomerOrder(Customer customer,Cart cart) {

        if(cart.getItemsQuantity() == 0){
            System.out.println("Your cart is empty");
            return;
        }

        cart.viewCartDetails();
        customer.setcCart(cart);
        



        System.out.println("Enter your address to deliver to: ");

        
        customer.setAddress();

        // start finishing the order details
        Order cOrder = new Order(customer);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the payment method : ");
        System.out.println("1- Cash \n" + "2- Loyalty points\n" + "3- E-wallet\n" + "4-Gift card");
        System.out.print("Enter your choice here:");
        int choice = scanner.nextInt();

        String payMethod;

        switch (choice) {
            case 1:
                payMethod = "CASH";
                cOrder.putPaymentMethod(payMethod);
                break;

            case 2:
                payMethod = "LOYALTYPOINTS";
                cOrder.putPaymentMethod(payMethod);
                break;

            case 3:
                payMethod = "eWALLET";
                cOrder.putPaymentMethod(payMethod);
                break;

            case 4:
                payMethod = "GIFTCARD";
                cOrder.putPaymentMethod(payMethod);
                break;

            default:
                System.out.println("this choice doesn't exsit ");

        }

        // change order status

        OrderStatus oS = OrderStatus.PAID;
        cOrder.setOrderStatus(oS);

        // assign the order to the customer

        customer.setOrder(cOrder);


        cOrder.showOrderDetails();
        System.out
                .println("After this step you cant cancel the order, what do you want?  1-cancel 2- confirm shipping");
        System.out.print("Enter your choice here:");
        choice = scanner.nextInt();

        if (choice == 1) {
            cOrder.cancelOrder();

        }else{
             // change order status to shipped

        oS = OrderStatus.SHIPPED;
        cOrder.setOrderStatus(oS);
        }
        cOrder.showOrderDetails();
        System.out.println("Thank you for shopping from us ;)");



       
    
    }
}
