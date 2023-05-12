import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.random.*;;





enum OrderStatus{
    waitPAYMENT,
    PAID,
    SHIPPED,
    CANCELLED

}


public class Order {

    private  int orderID;
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
    private double subTotal;

    

    


    
    

    Order(Customer customer){

       orderID = new Random().nextInt(9) + new Random().nextInt(9) + 
       new Random().nextInt(9) + new Random().nextInt(9) + new Random().nextInt(9);

        orderStatus = OrderStatus.waitPAYMENT;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();  
        dateCreated = ((String)dateFormat.format(now));

        oCustomerId = customer.getId();
        oCustomerName = customer.getUserName();
        oCustomerAddress = customer.getAddress();
        // oCustomerPhone = oCustomer.getPhoneNo();

        DateTimeFormatter dateFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime no = LocalDateTime.now();  
        dateCreated = ((String)dateFormt.format(no));

        orderDetails = new OrderDetails(this);



        

    }

    public void putPaymentMethod(String payM){

        payment.setPaymentMethod(payM);

    }

    public void showOrderDetails(){
        OrderDetails od = new OrderDetails(this);

        if(od.getProducts().size() == 0){
            System.out.println("There is no products in the cart!");


        }else{
        System.out.println("your Order ID is : " + getOrderID());
        System.out.println("Order details :");
        System.out.println("Products ");
        for( Product p : od.getProducts()){
            System.out.println(p.getName());
            System.out.println(p.getDescription());
            System.out.print("Quantity : " + p.getProductQuantity() + " " );
            System.out.println("Price" + p.getPrice() );
        }

        System.out.println("order subTotal : " + getSubTotal());
    }


    }
   


    public double orderSubTotal(){

        Cart cart = oCustomer.getcCart();

        
        if(payment.getPaymentMethod() ==  PaymentMethod.CASH){
            // will add 20 pound;
            setSubTotal( (cart.getSubTotal() + 20));
        }else{
            setSubTotal( cart.getSubTotal());
        }
        return subTotal;

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

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    
}
