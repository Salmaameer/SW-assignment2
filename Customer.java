 public class Customer {
     private String name;
    private int id;
    private String email;
    private String password;
    private String phoneNo;
    private double loyaltyPoints;
    private Address address;
    private Cart cCart;
    

    public Cart getcCart() {
        return cCart;
    }

    public void setcCart(Cart cCart) {
        this.cCart = cCart;
    }

    public Customer() {
        ++id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public void setLoyaltyPoints(double loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
