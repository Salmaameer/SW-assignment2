
import java.util.ArrayList;
import java.util.List;

public class OrderDetails {
    private int orderID;
    private Order order;
    private List<Product> products; 
    private double orderSubTotal ;




    
    public OrderDetails(Order order) {

        this.orderID = order.getOrderID();
        Customer customer = order.getoCustomer();
        Cart cart = customer.getcCart();
        orderSubTotal = cart.getSubTotal();
        // fill in the products
       products = cart.getItems();

       
    }

    public void showOrderDetails(){
        System.out.println("Order details :");
        System.out.println("Products ");
        for( Product p : products){
            System.out.println(p.getName());
            System.out.println(p.getDescription());
            System.out.print("Quantity : " + p.getProductQuantity() + " " );
            System.out.println("Price" + p.getPrice() );
        }


    }


    



    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public double getOrderSubTotal() {
        return orderSubTotal;
    }
    //
    public void setOrderSubTotal(double orderSubTotal) {
        
        this.orderSubTotal = orderSubTotal ;
    }


    public Product[] getProducts() {
        return products;
    }


    public void setProducts(Product[] products) {
        this.products = products;
    }

    
    


    
}
