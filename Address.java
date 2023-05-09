public class Address {

    private String governrate;
    private String disrict;
    private String street;
    private String buildingNo;
    private String apartmentNo;


    Address(String governrate, String district , String street , String buildingNo , String apartmentNo ){
        this.governrate = governrate;
        this.disrict = district;
        this.apartmentNo = apartmentNo;
        this.buildingNo = buildingNo;
        this.street = street;
    }
    public void setGovernrate(String gover){
        governrate  = gover;
    }
    public void setDistrict(String dis){
        disrict = dis;
    }
    public void setStreet(String street){
       this.street = street;

    }
    public void setBuildingNo(String build){
        this.buildingNo = build;
 
     }
     public void setApartmentNo(String apart){
        this.apartmentNo = apart;
 
     }


    
    
   
    
}
    public String getGovernrate() {
        return governrate;
    }
    public String getDisrict() {
        return disrict;
    }
    public String getStreet() {
        return street;
    }
    public String getBuildingNo() {
        return buildingNo;
    }
    public String getApartmentNo() {
        return apartmentNo;
    }
