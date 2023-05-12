import java.util.Scanner;;

public class Address {

    private String governrate;
    private String disrict;
    private String street;
    private String buildingNo;
    private String apartmentNo;


    
    public void setAddress(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Governrate:");
        governrate = scanner.nextLine();

        System.out.print("Enter Disrict:");
        disrict = scanner.nextLine();

        System.out.print("Enter Street:");
        street = scanner.nextLine();

        System.out.print("Enter building number:");
        buildingNo = scanner.nextLine();

        System.out.print("Enter apatment number:");
        apartmentNo = scanner.nextLine();


    }

    public void showAddress(){
        System.out.println(getGovernrate() + " ," + getDisrict() + " ," + getStreet() + " ,"+ getBuildingNo() + " ," + getApartmentNo() );

    }



    //setters and getters
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
}