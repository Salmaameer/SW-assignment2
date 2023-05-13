import java.util.random.RandomGenerator;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class mainDemo {

   
    public  static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

      

       Catalog catalog = new Catalog();
        Product p1 = new Product("Galaxy", 70, "galaxy", "to7fa",10, 50);
        List<Product> products =  new ArrayList<>();
        products.add(p1);
        p1 = new Product("Milky Way", 70, "Milky Way", "to7fa",15, 20);
        products.add( p1);
        p1.setDiscount(30);

        p1 = new Product("Lindt", 70, "Lindt", "to7fa",30.5, 20);
        products.add( p1);
        Category category = new Category("chocolate",2, products, 0.2);
        catalog.addCategory(category);
////////////////////////////////////

        Customer customer = new Customer();
        Cart cart = new Cart();

        System.out.println("Welcome to TOFFEE store, where you can find you Adrenaline ;)");
       System.out.println("1-registr \n2-login ");
       System.out.print("Enter your shoice:");
       int choice = scanner.nextInt();

       
       while(true){

      
      if( choice == 1){
        Register.register(customer);
        break;

      }else if (choice == 2){
        Login login = new Login();
        customer = login.userlogin();
        break;

      }else {
        System.out.println("Oops! invalid choice");
        break;

      }

    }

    

    while(true){
        System.out.println("1-Shopping \n2- checkout");
        System.out.print("Enter your shoice:");
        choice = scanner.nextInt();


        if( choice == 1){
            ToffeeManager.startShopping(cart, catalog);
            
    
          }else if (choice == 2){
            ToffeeManager.placeCustomerOrder(customer, cart);
        
    
          }else {
            System.out.println("Oops! invalid choice");
            
    
          }

    }
       
        

       






       



         


       

       

       
    // while(choice != 0 ){
    //     System.out.println("1-registr \n2-login \n3- Start Shopping \n4- checkout ");
    //    System.out.print("Enter your shoice:");
    //    choice = scanner.nextInt();
    //    switch (choice){

    //     case 1:
    //     Register.register(customer);
    //     break;

    //     case 2:
    //     Login login = new Login();
    //     customer = login.userlogin();
    //     break;

    //     // case 3:
    //     // ToffeeManager.startShopping(customer);


    //     // case 4:
    //     // ToffeeManager.placeCustomerOrder(customer);
    //     // break;

    //     default :
    //     System.out.println("Enter valid option :( ");
    //     break;


    //    }

    //    c

    // }

       


    //    Order order = new Order(customer);
    //    order.getOrderDetails();
      



       
        
    //     System.out.println("Choose the payment method : ");
    //     System.out.println("1- cash \n" + "2- Loyalty points" );
 
    //     Scanner scanner = new Scanner(System.in);
       
    //     System.out.println("Do you you want to login or register to the system?\n 1-regestr. \n 2-login.");
    //    int choice=scanner.nextInt();
    //     if(choice==1){
          
    //         Register registration = new Register();
    //         registration.register();
    //     }
    //     if(choice==2){
    //    login loginprocess=new login();
    //    loginprocess.userlogin();
    //     }
        
    //     Order o = new Order();

    //     System.out.println(o.getDateCreated());

    //     Customer c  = new Customer();
    //     c.setPhoneNo("00201104361948");



        // // c.getCustomerId;
        // // c.showAddress();
    

        // System.out.println(o.getOrderID());

        // Order o2 = new Order(c);
        // System.out.println(o2.getOrderID());
        // System.out.println(o2.getCustomerId());


        
// Payment pay = new Payment(o,"CASH")
//         System.out.println(pat.getPaymentMethod());

        

        
    }
    
}
