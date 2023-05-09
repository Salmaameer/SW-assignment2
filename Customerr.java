
// demo class 

public class Customer {

    private static int customerId;
    private String customerName;
    private Address customerAddress;


    public Customer() {
            ++customerId;
            

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

    public void showAddress(){
        System.out.println(customerAddress.getGovernrate() + " ," + customerAddress.getDisrict() + " ," + customerAddress.getStreet() + " ,"+ customerAddress.getBuildingNo() + " ," + customerAddress.getApartmentNo() );

    }
    
    
}
