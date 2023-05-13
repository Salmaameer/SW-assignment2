public class CartItem {

    private String name;
    protected int id;
    protected int quantity;
    protected double unitPrice;
    protected double itemTotal;

   

     public CartItem(int quantity ,Product p) {
        this.name = p.getName();
        this.id = id;
        this.unitPrice = p.getPrice();
        this.quantity = quantity;

        calculateItemTotal(p);
    }

    CartItem(String name, int id, int quantity, double unitPrice) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.itemTotal = quantity * unitPrice;
    }


    private double calculateItemTotal(Product p) {
               
                double discount = p.getDiscount();
                double disPrice = unitPrice * (1 - (discount/100));

                itemTotal += (disPrice * quantity );
            
            return itemTotal;


        }
    





    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.itemTotal = quantity * unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    // public void setSubtotal(double subtotal) {
    //     this.itemTotal = quantity * unitPrice;
    // }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double getSubtotal() {
        return itemTotal;
    }
    public void addItemToCart(int quantity) {
        this.quantity += quantity;
        this.itemTotal += quantity * unitPrice;
    }
    public double getItemTotal() {
        return itemTotal;
    }
    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }
    

    
}
