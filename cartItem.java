
/**
 *class represents an item in a shopping cart. It has several fields including name, id, quantity, unitPrice, and itemTotal
 */
public class CartItem {

    private String name;
    protected int id;
    protected int quantity;
    protected double unitPrice;
    protected double itemTotal;

   
    /**
     * takes an integer quantity and a Product object as arguments
     * @param quantity
     * @param p
     */

     public CartItem(int quantity ,Product p) {
        this.name = p.getName();
        this.id = id;
        this.unitPrice = p.getPrice();
        this.quantity = quantity;

        calculateItemTotal(p);
    }
    /**
     * this constructor takes a string name, integer id, integer quantity, and double unitPrice as arguments
     * @param name
     * @param id
     * @param quantity
     * @param unitPrice
     * 
     */

    CartItem(String name, int id, int quantity, double unitPrice) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.itemTotal = quantity * unitPrice;
    }


    
    /** 
     * The calculateItemTotal method calculates the total cost of the item by applying any discount from the given Product object
     * @param p
     * @return double
     */
    private double calculateItemTotal(Product p) {
               
                double discount = p.getDiscount();
                double disPrice = unitPrice * (1 - (discount/100));

                itemTotal += (disPrice * quantity );
            
            return itemTotal;


        }
    





    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /** 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.itemTotal = quantity * unitPrice;
    }
    
    /** 
     * @param unitPrice
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    /** 
     * @return String
     */
    
    public String getName() {
        return name;
    }
    
    /** 
     * @return int
     */
    public int getId() {
        return id;
    }
    
    /** 
     * @return int
     */
    public int getQuantity() {
        return quantity;
    }
    
    /** 
     * @return double
     */
    public double getUnitPrice() {
        return unitPrice;
    }
    
    /** 
     * @return double
     */
    public double getSubtotal() {
        return itemTotal;
    }
    
    /** 
     * @param quantity
     */
    public void addItemToCart(int quantity) {
        this.quantity += quantity;
        this.itemTotal += quantity * unitPrice;
    }
    
    /** 
     * @return double
     */
    public double getItemTotal() {
        return itemTotal;
    }
    
    /** 
     * @param itemTotal
     */
    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }
    

    
}
