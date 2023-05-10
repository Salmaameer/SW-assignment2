
// demo class 

public class Customer {

    private static int customerId;
    private String customerName;
    private Address customerAddress;
     private String email;
    private String password;
    private String phoneNo;


    public Customer() {
            ++customerId;
            

    }
    public Customer(String email, String password) {
       
        this.email = email;
        this.password = password;
      
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String cusotmerName) {
        this.customerName = cusotmerName;
    }
    public Address getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(Address cusotmerAddress) {
        this.customerAddress = cusotmerAddress;
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
    public void showAddress(){
        System.out.println(customerAddress.getGovernrate() + " ," + customerAddress.getDisrict() + " ," + customerAddress.getStreet() + " ,"+ customerAddress.getBuildingNo() + " ," + customerAddress.getApartmentNo() );

    }
    
    
}
