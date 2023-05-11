 public class Customer {
     private String name;
    private int id;
    private String email;
    private String password;
    private String phoneNo;
    private double loyaltyPoints;
    private Address address;
    private Cart cCart;


    

    
    public Customer() {

    ++id;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

   
public void checkout(){

}
public void changeAddress(){

}



   
}
