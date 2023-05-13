import java.util.Random;
import java.util.Scanner;


/**
 * Customer class represents a customer in an e-commerce system
 * it manipulates every thing related to the customer 
 * that is either logged in or registerd
 * 
 */
public class Customer {
    private String userName;
    private int id;
    private String email;
    private String password;
    private String phoneNo;
    private double loyaltyPoints;
    private Address address = new Address();
    private Cart cCart = new Cart();
    private Order order = new Order();

    /**
     * This is the default constructor for the Customer class. It generates a random
     * ID for the customer and sets the value of the id field.
     */
    public Customer() {

        // generate the id for the customer
        id = new Random().nextInt(9) + new Random().nextInt(9) +
                new Random().nextInt(9) + new Random().nextInt(9) + new Random().nextInt(9);

    }


    /**
     * 
     * @param email
     * @param password
     * 
     *                 This is an overloaded constructor for the Customer class. It
     *                 takes arguments for the customer’s email and password and
     *                 sets the corresponding fields. It also generates a random ID
     *                 for the customer and sets the value of the id field.
     */

    public Customer(String email, String password) {

        // generate the id for the customer
        id = new Random().nextInt(9) + new Random().nextInt(9) +
                new Random().nextInt(9) + new Random().nextInt(9) + new Random().nextInt(9);

        this.email = email;
        this.password = password;

    }

    /**
     * this method if the customer wants 
     * to change his address to another one
     */
   
     public void setAddress(){

        Scanner scanner = new Scanner(System.in);
        String in;
        System.out.print("Enter Governrate:");
        in = scanner.nextLine();
        address.setGovernrate(in);

        System.out.print("Enter Disrict:");
        in = scanner.nextLine();
        address.setDistrict(in);

        System.out.print("Enter Street:");
        in = scanner.nextLine();
        address.setStreet(in);

        System.out.print("Enter building number:");
        in = scanner.nextLine();
        address.setBuildingNo(in);

        System.out.print("Enter apatment number:");
        in = scanner.nextLine();
        address.setApartmentNo(in);


    }
    public void changeAddress() {

       setAddress();
    }
    /**
     * 
     * @return
     */

    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param name
     */
    public void setUserName(String name) {
        this.userName = name;
    }

    /**
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * 
     * @return
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 
     * @param phoneNo
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * 
     * @return
     */
    public double getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * 
     * @param loyaltyPoints
     */
    public void setLoyaltyPoints(double loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    /**
     * 
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * 
     * @return
     */
    public Cart getcCart() {
        return cCart;
    }

    /**
     * 
     * @param cCart
     */
    public void setcCart(Cart cCart) {
        this.cCart = cCart;
    }

    /**
     * 
     * @return
     */
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
