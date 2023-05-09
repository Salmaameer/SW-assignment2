public class mainDemo {

    public  static void  main(String[] args){
        Order o = new Order();

        System.out.println(o.getDateCreated());

        Customer c  = new Customer();
        // c.getCustomerId;
        // c.showAddress();
    

        System.out.println(o.getOrderID());

        Order o2 = new Order(c);
        System.out.println(o2.getOrderID());
        System.out.println(o2.getCustomerId());

        
Payment pay = new Payment(o,"CASH")
        System.out.println(pat.getPaymentMethod());
        

        
    }
    
}
