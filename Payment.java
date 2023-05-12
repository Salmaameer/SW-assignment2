import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Date;



enum PaymentMethod{

        CASH,
        eWALLET,
        LOYALTYPOINTS,
        GIFTCARD
}

public class Payment {
    private static int oPaymentId;
    //private int pOrderId;
    private String paymentDate;
    private PaymentMethod paymentMethod;






    
    


    private Payment() {
        oPaymentId++;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();  
        paymentDate = ((String)dateFormat.format(now));
        
        
        
    }







    public int getoPaymentId() {
        return oPaymentId;
    }
    public void setoPaymentId(int oPaymentId) {
        this.oPaymentId = oPaymentId;
    }
   
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String payd) {

        payd = payd.toUpperCase();

       switch(payd){
        case "CASH" :
            System.out.println("Cash will cost you 20 pound more.");
            paymentMethod = PaymentMethod.CASH;
            break;

        case "eWALLET" :
            paymentMethod = PaymentMethod.eWALLET;
            break;    

        case "LOYALTYPOINTS" :
            paymentMethod = PaymentMethod.LOYALTYPOINTS;
            break;   
            
            
        case " GIFTCARD" :
            paymentMethod = PaymentMethod.GIFTCARD;
            break;      
       }
       
    }
    


}
