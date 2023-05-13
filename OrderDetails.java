
import java.util.ArrayList;
import java.util.List;

public class OrderDetails {
    private int orderID;
    private Order order;
    private List<Product> products;

    /**
     * 
     * @param order
     *              This is the constructor for the OrderDetails class. It takes an
     *              Order object as an argument and initializes the orderID and
     *              products fields. The orderID is set to the ID of the given Order
     *              object, and the products field is set to the items in the
     *              customer’s cart.
     */
    public OrderDetails(Order order) {

        this.orderID = order.getOrderID();
        Customer customer = order.getoCustomer();
        Cart cart = customer.getcCart();

        // fill in the products
        products = cart.getItems();

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
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
