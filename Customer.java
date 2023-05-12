 public class Customer {
     private String userName;
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


    public Customer(String email, String password) {
       
        this.email = email;
        this.password = password;
      
    }

    public void showAddress(){
        System.out.println(address.getGovernrate() + " ," + address.getDisrict() + " ," + address.getStreet() + " ,"+ address.getBuildingNo() + " ," + address.getApartmentNo() );

    }
   
    public void checkout(){

    }
    public void changeAddress(){

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

    

   
}
