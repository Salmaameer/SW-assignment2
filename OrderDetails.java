
import java.util.ArrayList;
import java.util.List;

public class OrderDetails {
    private int orderID;
    private Order order = new Order();
    private List<CartItem> products;
    private Cart cart = new Cart();
    private double subTotal;

    /**
     * 
     * @param order
     *              This is the constructor for the OrderDetails class. It takes an
     *              Order object as an argument and initializes the orderID and
     *              products fields. The orderID is set to the ID of the given Order
     *              object, and the products field is set to the items in the
     *              customer’s cart.
     */
    public OrderDetails(Order order,Cart cart) {

        this.orderID = order.getOrderID();
        
        this.cart = cart;

         // fill in the products
       
        setProducts(cart.getItems());
        setSubTotal(cart.getSubTotal());

       

    }

    /**
     * @return int
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * 
     * @param orderID
     *                setOrderID(int orderID): This method takes an integer argument
     *                representing the order ID and sets the value of the orderID
     *                field.
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return List<Product>
     * 
     *         This method takes a list of Product objects as an argument and sets
     *         the value of the products field.
     */
    public List<CartItem> getProducts() {
        return products;
    }

    public void setProducts(List<CartItem> products) {
        this.products = products;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

}
