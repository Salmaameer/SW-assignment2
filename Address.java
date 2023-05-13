import java.util.Scanner;;


/**
 * Address class represents a physical address. It has fields for the
 * governrate, district, street, building number, and apartment number.
 */
public class Address {

    private String governrate;
    private String disrict;
    private String street;
    private String buildingNo;
    private String apartmentNo;


    
    
    
    /**
     * This method prints the address information to the console in a formatted
     * string.
     */

    public void showAddress(){
        System.out.println(getGovernrate() + " ," + getDisrict() + " ," + getStreet() + " ,"+ getBuildingNo() + " ," + getApartmentNo() );

    }



    //setters and getters
    /**
     * 
     * @param gover
     */
    public void setGovernrate(String gover){
        governrate  = gover;
    }
    
    /** 
     * @param dis
     */
    public void setDistrict(String dis){
        disrict = dis;
    }
    
    /** 
     * @param street
     */
    public void setStreet(String street){
       this.street = street;

    }
    /**
     * 
     * @param build
     */
    public void setBuildingNo(String build){
        this.buildingNo = build;
 
     }
     /**
      * 
      * @param apart
      */
     public void setApartmentNo(String apart){
        this.apartmentNo = apart;
 
     }

     /**
      * 
      * @return
      */

    public String getGovernrate() {
        return governrate;
    }
    /**
     * 
     * @return
     */
    public String getDisrict() {
        return disrict;
    }

    /**
     * 
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     * 
     * @return
     */
    public String getBuildingNo() {
        return buildingNo;
    }
    /**
     * 
     * @return
     */
    public String getApartmentNo() {
        return apartmentNo;
    }
}