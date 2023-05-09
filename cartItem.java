package toffee;

public class cartItem {
    private String name;
    protected int id;
    protected int quantity;
    protected double unitPrice;
    protected double subtotal;

    public cartItem(String name, int id, int quantity, double unitPrice) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = quantity * unitPrice;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.subtotal = quantity * unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = quantity * unitPrice;
    }
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
        return subtotal;
    }
    public void addItemToCart(int quantity) {
        this.quantity += quantity;
        this.subtotal += quantity * unitPrice;
    }

}
