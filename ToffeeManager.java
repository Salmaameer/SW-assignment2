import java.util.Scanner;

public class ToffeeManager {

    // public static void welcoming(){
    // System.out.println("Welcome to TOFFEE store, where you can find your
    // Adrenaline ;)");
    // System.out.println("1-regestr\n2-login\n3- Start Shopping\n 4-
    // checkout");

    // }

    public static void startShopping(Customer customer) {

    }

    public static void placeCustomerOrder(Customer customer) {

        System.out.println("Enter your address to deliver to ");

        Address cAddress = customer.getAddress();
        cAddress.setAddress();

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
