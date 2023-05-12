
import java.util.ArrayList;
import java.util.List;

public class OrderDetails {
    private int orderID;
    private List<Product> products; 
    




    
    public OrderDetails(Order order) {

        this.orderID = order.getOrderID();
        Customer customer = order.getoCustomer();
        Cart cart = customer.getcCart();
    
        // fill in the products
       products = cart.getItems();

       
    }

   


    



    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    
    


    
}
