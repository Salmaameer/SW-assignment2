import java.util.Scanner;


public class ToffeeManager {

    public void register(Customer customer){



    }
    
    public void palceCustomerOrder(Customer customer){
        

        System.out.println("Enter your address to deliver to ");

        Address cAddress = customer.getAddress();
        cAddress.setAddress();



        // start finishing the order details
        Order cOrder = new Order(customer);
        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("Choose the payment method : ");
        System.out.println("1- Cash \n" + "2- Loyalty points\n" + "3- E-wallet\n" + "4-Gift card");
        int choice = scanner.nextInt();

        String payMethod;

        switch(choice){
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
    }

    customer.setOrder(cOrder);


    }



}
