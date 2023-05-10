public class mainDemo {

    public  static void  main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Do you you want to login or register to the system?\n 1-regestr. \n 2-login.");
       int choice=scanner.nextInt();
        if(choice==1){
          
            Register registration = new Register();
            registration.register();
        }
        if(choice==2){
       login loginprocess=new login();
       loginprocess.userlogin();
        }
        
        Order o = new Order();

        System.out.println(o.getDateCreated());

        Customerr c  = new Customer();
        // c.getCustomerId;
        // c.showAddress();
    

        System.out.println(o.getOrderID());

        Order o2 = new Order(c);
        System.out.println(o2.getOrderID());
        System.out.println(o2.getCustomerId());

        
// Payment pay = new Payment(o,"CASH")
//         System.out.println(pat.getPaymentMethod());
        

        
    }
    
}
