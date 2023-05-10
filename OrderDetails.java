

public class OrderDetails {
    private int orderID;
    private Order order;
    Product[] products; 
    private double orderSubTotal ;




    
    public OrderDetails(Order order) {

        this.orderID = order.getOrderID();
        // take the 

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
