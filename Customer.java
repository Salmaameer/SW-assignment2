import java.util.Random;

public class Customer {
    private String userName;
    private int id;
    private String email;
    private String password;
    private String phoneNo;
    private double loyaltyPoints;
    private Address address;
    private Cart cCart;
    private Order order;

    public Customer() {

        // generate the id for the customer
        id = new Random().nextInt(9) + new Random().nextInt(9) +
                new Random().nextInt(9) + new Random().nextInt(9) + new Random().nextInt(9);

    }

    public Customer(String email, String password) {

        // generate the id for the customer
        id = new Random().nextInt(9) + new Random().nextInt(9) +
                new Random().nextInt(9) + new Random().nextInt(9) + new Random().nextInt(9);

        this.email = email;
        this.password = password;

    }

    public void checkout() {

    }

    public void changeAddress() {

        System.out.println("Enter ");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(double loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cart getcCart() {
        return cCart;
    }

    public void setcCart(Cart cCart) {
        this.cCart = cCart;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
