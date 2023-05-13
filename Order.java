import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.random.*;
import java.util.List;







enum OrderStatus{
    waitPAYMENT,
    PAID,
    SHIPPED,
    CANCELLED

}

/**
 * Order class represents an order in an e-commerce system
 * it manipulates every thing related to the order so it can shows the details,
 * cancels the order , deifine the order information 
 */
public class Order {

    private  int orderID;
    private String dateCreated;
    private String dateShipped; 
    private Customer oCustomer = new Customer();
    private int oCustomerId;
    private String oCustomerName;
    private Address oCustomerAddress = new Address();
    private String oCustomerPhone;
    private OrderStatus orderStatus;
    private OrderDetails orderDetails ;
    private Payment payment = new Payment();
    

    

    


    
    

     public Order() {
    }


    /**
     * This is the constructor for the Order class. It takes a Customer object as an
     * argument and initializes the orderID, orderStatus, dateCreated, oCustomerId,
     * oCustomerName, oCustomerAddress, and orderDetails fields.
     * 
     * @param customer
     */

     Order(Customer customer){

        orderID = new Random().nextInt(9) + new Random().nextInt(9) + 
        new Random().nextInt(9) + new Random().nextInt(9) + new Random().nextInt(9);
 
         orderStatus = OrderStatus.waitPAYMENT;
         DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDateTime now = LocalDateTime.now();  
         dateCreated = ((String)dateFormat.format(now));
 
         oCustomerId = customer.getId();
         oCustomerName = customer.getUserName();
    
         // oCustomerPhone = oCustomer.getPhoneNo();
 
         DateTimeFormatter dateFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDateTime no = LocalDateTime.now();  
         dateCreated = ((String)dateFormt.format(no));
 
         orderDetails = new OrderDetails(this,customer.getcCart());

         Cart cart = new Cart();
         cart = oCustomer.getcCart();

        
 
 
 
         
 
     }
 
     
     /**
      * @param payM
      *             This method takes a string argument representing the payment
      *             method and sets it using the payment.setPaymentMethod() method.
      */
     public void putPaymentMethod(String payM){
        payment.setPaymentMethod(payM);
        if(payment.getPaymentMethod() == PaymentMethod.CASH){
            // will add 20 pound;
       orderDetails.setSubTotal( (orderDetails.getSubTotal() + 20));
        }
         
 
     }
 
     /**
      * This method creates an instance of the OrderDetails class and checks if there
      * are any products in the cart. If there are no products, it prints a message
      * to the console. Otherwise, it prints the order ID and details of the products
      * in the cart.
      */
 
    public void showOrderDetails(){
        

        if(orderDetails.getProducts().size() == 0){
            System.out.println("There is no products in the cart!");


        }else{
        System.out.println("your Order ID is : " + getOrderID());
        System.out.println("Order details :");
        System.out.println("Products ");
        for( CartItem p : orderDetails.getProducts()){
            System.out.println(p.getName());
            System.out.print("Quantity : " + p.getQuantity() + " " );
            System.out.println("Price :" + p.getItemTotal() );
        }

        System.out.println("order subTotal : " + orderDetails.getSubTotal());
    }


    }
   

/**
 * 
 * @return
 *         calculates and returns the subtotal for an order. It first retrieves
 *         the customer’s cart and checks the payment method. If the payment
 *         method is CASH, it adds 20 to the cart’s subtotal and sets the
 *         order’s subtotal to this value
 */
   

    /**
     * method is used to cancel an order. It first checks the current orderStatus of
     * the order. If the orderStatus is SHIPPED
     */

    public void cancelOrder(){
        if(orderStatus == OrderStatus.SHIPPED ){
            System.out.println("Order can't be cancelled, It is on the way to you!");
        }
        else{
            orderStatus = OrderStatus.CANCELLED;
            System.out.println("Order has been cancelled :(");

        }


    }


    public void setOrderStatus(OrderStatus os){
        if( os == OrderStatus.SHIPPED){
            orderDetails.setSubTotal((orderDetails.getSubTotal())+50);
        }
        orderStatus = os;

    
    }
    public void setCustomerID(int id){
       oCustomerId = id;

    
    }
    public void setCustomerName(String name){
       oCustomerName = name;

    
    }
    public void setCustomerAddress(Address ad){
        oCustomerAddress = ad;
    }

    
    public  int getOrderID() {
        return orderID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public int getCustomerId() {
        return oCustomerId;
    }

    public String getCusotmerName() {
        return oCustomerName;
    }

    public Address getCusotmerAddress() {
        return oCustomerAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }


    public  void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getoCustomer() {
        return oCustomer;
    }

    public void setoCustomer(Customer oCustomer) {
        this.oCustomer = oCustomer;
    }

    public int getoCustomerId() {
        return oCustomerId;
    }

    public void setoCustomerId(int oCustomerId) {
        this.oCustomerId = oCustomerId;
    }

    public String getoCustomerName() {
        return oCustomerName;
    }

    public void setoCustomerName(String oCustomerName) {
        this.oCustomerName = oCustomerName;
    }

    public Address getoCustomerAddress() {
        return oCustomerAddress;
    }

    public void setoCustomerAddress(Address oCustomerAddress) {
        this.oCustomerAddress = oCustomerAddress;
    }

    public String getoCustomerPhone() {
        return oCustomerPhone;
    }

    public void setoCustomerPhone(String oCustomerPhone) {
        this.oCustomerPhone = oCustomerPhone;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

   

    
}
