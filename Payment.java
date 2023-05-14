import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Date;


/**
 * enum named PaymentMethod that defines the possible payment methods
 */
enum PaymentMethod{

        CASH,
        eWALLET,
        LOYALTYPOINTS,
        GIFTCARD
}
/**
 * Payment class manipulates and intialize the informaation of the payment 
 */
public class Payment {
    private static int oPaymentId;
    //private int pOrderId;
    private String paymentDate;
    private PaymentMethod paymentMethod;


    /**
     * default constructor 
     */
    Payment() {
        oPaymentId++;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();  
        paymentDate = ((String)dateFormat.format(now));
        
        
        
    }


    /** 
     * @return int
     */
    public int getoPaymentId() {
        return oPaymentId;
    }
    
    /** 
     * @param oPaymentId
     */
    public void setoPaymentId(int oPaymentId) {
        this.oPaymentId = oPaymentId;
    }
   
    
    /** 
     * @return String
     */
    public String getPaymentDate() {
        return paymentDate;
    }
    
    /** 
     * @param paymentDate
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    /** 
     * @return PaymentMethod
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    
    /** 
     * @param payd
     * The setPaymentMethod method takes a string argument representing the payment method and sets the value of the paymentMethod field
     */
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
