import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Date;



enum OrderStatus{
    waitPAYMENT,
    PAID,
    SHIPPED,
    CANCELLED

}


public class Order {

    private static int orderID;
    private String dateCreated;
    // private Date dateShipped; 
    private Customer oCustomer;
    private int oCustomerId;
    private String oCustomerName;
    private Address oCustomerAddress;
    private OrderStatus orderStatus;
    private OrderDetails orderDetails;
    private Payment payment;
    


    
    


    

    Order(){
        ++orderID;
        orderStatus = OrderStatus.waitPAYMENT;
        

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();  
        dateCreated = ((String)dateFormat.format(now));
        


        
    }

    Order(Customer customer){

       ++orderID;
       
        orderStatus = OrderStatus.waitPAYMENT;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();  
        dateCreated = ((String)dateFormat.format(now));

        oCustomerId = customer.getId();
        oCustomerName = customer.getName();
        oCustomerAddress = customer.getAddress();

        DateTimeFormatter dateFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime no = LocalDateTime.now();  
        dateCreated = ((String)dateFormt.format(no));
        

    }


    public void pay(){
        Payment pay ;
        if(payment.getPaymentMethod() ==  PaymentMethod.CASH){
            
        }
        

    }


    public void orderSubTotal(){

        // Cart cart = customer.getcCart();
        // if(paymen)
        // orderDetails.setOrderSubTotal( cart.getSubTotal());

    }

    public void setOrderStatus(OrderStatus os){
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

    



   

    public static int getOrderID() {
        return orderID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    // public Date getDateShipped() {
    //     return dateShipped;
    // }

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


    public void cancelOrder(){
        if(orderStatus == OrderStatus.SHIPPED ){
            System.out.println("Order can't be cancelled, It is on the way to you!");
        }
        else{
            orderStatus = OrderStatus.CANCELLED;
            System.out.println("Order has been canclled :(");

        }


    }

    
}
