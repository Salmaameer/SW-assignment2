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
    private String dateShipped; 
    private Customer oCustomer;
    private int oCustomerId;
    private String oCustomerName;
    private Address oCustomerAddress;
    private String oCustomerPhone;
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
        oCustomerName = customer.getUserName();
        oCustomerAddress = customer.getAddress();
        oCustomerPhone = oCustomer.getPhoneNo();

        DateTimeFormatter dateFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime no = LocalDateTime.now();  
        dateCreated = ((String)dateFormt.format(no));

        orderDetails = new OrderDetails(this);


        

    }

    public void putPaymentMethod(String payM){

        payment.setPaymentMethod(payM);

    }

   


    // public void orderSubTotal(){

    //     Cart cart = oCustomer.getcCart();
       
        
    //     if(payment.getPaymentMethod() ==  PaymentMethod.CASH){
    //         // will add 20 pound;
    //         orderDetails.setOrderSubTotal( (cart.getSubTotal() + 20));
    //     }else{
    //         orderDetails.setOrderSubTotal( cart.getSubTotal());
    //     }

    // }
    public void cancelOrder(){
        if(orderStatus == OrderStatus.SHIPPED ){
            System.out.println("Order can't be cancelled, It is on the way to you!");
        }
        else{
            orderStatus = OrderStatus.CANCELLED;
            System.out.println("Order has been canclled :(");

        }


    }

    public void sendOTP(){
        // take the phone number and send otp to it

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


    public static void setOrderID(int orderID) {
        Order.orderID = orderID;
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

    
}
