// package com.mycompany.toffee;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class ToffeeManager {

    // public static void welcoming(){
    // System.out.println("Welcome to TOFFEE store, where you can find your
    // Adrenaline ;)");
    // System.out.println("1-register\n2-login\n3- Start Shopping\n 4-
    // checkout");

    // }

    public static void startShopping(Customer customer) {
        Scanner input = new Scanner(System.in);
        Catalog catalog = new Catalog();
        Product p1 = new Product("Galaxy", 70, "galaxy", "to7fa",10, 50);
        List<Product> products =  new ArrayList<>();
        products.add(p1);
        p1 = new Product("Milky Way", 70, "Milky Way", "to7fa",15, 20);
        products.add( p1);
        p1.setDiscount(30);
        Category category = new Category("chocolate",2, products, 0.2);
        catalog.addCategory(category);

        catalog.showItems();

        Product p2 = catalog.searchItemByBrand("chocolate", "galaxy");

        p2.setDiscount(0.3);
        p2.displayProductDetails();

        CartItem cartItem = new CartItem(2, p1);
        Cart cart = new Cart();

        cart.addToCartItem(cartItem);
        cart.viewCartDetails();

        

        // catalog.addCategory(new Category("Chocolate1", 700, new Product[]{new Product("Chocolate Bars", 1, "KitKat", "delicious chocolate bars", Product.ProductType.Unit, 7.5, "KitKat.jpg", Product.ProductStatus.on_sale, 200, 0.2),
        //         new Product("Chocolate2", 2, "Milky Way", "A delicious chocolate bar", Product.ProductType.Unit, 15, "Milk_way.jpg", Product.ProductStatus.on_sale, 170, 0.0),
        //         new Product("Chocolate3", 3, "Hershey's", "A delicious chocolate bar", Product.ProductType.Unit, 20, "herShey.txt", Product.ProductStatus.on_sale, 120, 0.05),
        //         new Product("Chocolate4", 4, "Cadbury", "A delicious chocolate bar", Product.ProductType.Unit, 8.5, "Cadbury.txt", Product.ProductStatus.on_sale, 50, 0.03),
        //         new Product("Chocolate5", 5, "Lindt", "A delicious chocolate bar", Product.ProductType.Unit, 30, "Lindt.txt", Product.ProductStatus.on_sale, 70, 0.0),
        //         new Product("Chocolate6", 6, "Twix", "delicious chocolate bars", Product.ProductType.Unit, 10, "Twix.txt", Product.ProductStatus.out_of_stock, 0, 0.0)}, 0.4));

        // catalog.addCategory(new Category("Candies", 50, new Product[]{new Product("candy1", 1, "Skittles", "A delicious candy", Product.ProductType.Loose, 7.5, "Skittles.jpg", Product.ProductStatus.on_sale, 200, 0.2),
        //         new Product("candy2", 2, "Starburst", "A delicious candy", Product.ProductType.Loose, 15, "Starburst.jpg", Product.ProductStatus.on_sale, 170, 0.0),
        //         new Product("candy3", 3, "Haribo Gummi Bears", "A delicious candy", Product.ProductType.Loose, 20, "Haribo.txt", Product.ProductStatus.on_sale, 120, 0.05),
        //         new Product("candy4", 4, "M&M's", "A delicious candy", Product.ProductType.Loose, 8.5, "M&M's.txt", Product.ProductStatus.on_sale, 50, 0.03),
        //         new Product("candy5", 5, "jelly cola", "A delicious candy", Product.ProductType.Loose, 30, "jelly.txt", Product.ProductStatus.on_sale, 70, 0.0),
        //         new Product("candy6", 6, "Swedish Fish", "A delicious candy", Product.ProductType.Loose, 10, "Swedish_Fish.txt", Product.ProductStatus.out_of_stock, 0, 0.0)}, 0.3));

        // catalog.addCategory(new Category("Chips", 500, new Product[]{new Product(" Chips1", 1, "Barbecue", "A delicious chips", Product.ProductType.Unit, 10, "Barbecue.jpg", Product.ProductStatus.on_sale, 100, 0.2),
        //         new Product("Chips2", 2, "Cheese", "A delicious chips", Product.ProductType.Unit, 15, "Cheese.jpg", Product.ProductStatus.on_sale, 100, 0.0),
        //         new Product("Chips3", 3, "Chili", "A delicious chips", Product.ProductType.Unit, 20, "Chili.txt", Product.ProductStatus.on_sale, 100, 0.05),
        //         new Product("Chips4", 4, "Garlic", "A delicious chips", Product.ProductType.Unit, 8.5, "Garlic.txt", Product.ProductStatus.on_sale, 100, 0.03),
        //         new Product("Chips5", 5, "Pizza", "A delicious chips", Product.ProductType.Unit, 30, "Pizza.txt", Product.ProductStatus.on_sale, 100, 0.0),
        //         new Product("Chips6", 6, "Salsa", "A delicious chips", Product.ProductType.Unit, 10, "Salsa.txt", Product.ProductStatus.out_of_stock, 0, 0.0)}, 0.3));
        
        
                
        
        //         input = new Scanner(System.in);
        // String categoryName = input.nextLine();
        // // System.out.println("Here are the available products in our catalog divided to categories: ");
        // // for (Category category : catalog.getCategories()) {
        // //     if (category.getName().equalsIgnoreCase(categoryName)) {
        // //         System.out.println("Category: " + category.getName());
        // //         for (Product product : category.getProducts()) {
        // //             System.out.println("Product: " + product.getName());
        // //             System.out.println("ID: " + product.getID());
        // //             System.out.println("Description: " + product.getDescription());
        // //             System.out.println("Type: " + product.getProductType());
        // //             System.out.println("Price: " + product.getPrice());
        // //             System.out.println("Image: " + product.getImageFile());
        // //             System.out.println("Status: " + product.getProductStatus());
        // //             System.out.println("Quantity: " + product.getAvailableQuantity());
        // //             System.out.println("Discount: " + product.getDiscount());
        // //             System.out.println();
        // //         }
        // //     }
        // // }
        // System.out.print("category name: ");
        // String searchCategory = input.nextLine();
        // System.out.print("Enter the name or brand name: ");
        // String searchItem = input.nextLine();

        // Product searchedItem = catalog.searchItemByName(searchItem,searchCategory);
        // System.out.print("Enter quantity : ");
        // int quantity = input.nextInt();

       

        // // ProductType pt = searchItem.getProductType();



        // // if(searchItem.getProductType() == ProductType.Loose){

        // // }
        // if(searchedItem != null){

        //     System.out.println("Not null");
        //     searchedItem.getDescription();
        // //CartItem cartItem = new CartItem(quantity, searchedItem);
        // }else{
        //     System.out.println("null");
        // }





       
        


    
        


        // Cart cart = new Cart();

        // cart.addToCartItem(cartItem);

        // cart.getItems();



    }


    public static void placeCustomerOrder(Customer customer) {

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
                .println("After this step you cant cancel the order, what do you want?  1-cancel 2- continue shipping");
        System.out.print("Enter your choice here:");
        choice = scanner.nextInt();

        if (choice == 1) {
            cOrder.cancelOrder();

        }

        // change order status to shipped

        oS = OrderStatus.SHIPPED;
        cOrder.setOrderStatus(oS);

    }
}

