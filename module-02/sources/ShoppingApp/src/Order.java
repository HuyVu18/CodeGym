import java.util.Date;

public class Order {
    private String id;
    private User customer;
    private Date receiveTime;
    private boolean shipped;
    private Cart cartOrder;

    public Order(String id, User customer, Date receiveTime, boolean shipped, Cart cartOrder) {
        this.id = id;
        this.customer = customer;
        this.receiveTime = receiveTime;
        this.shipped = shipped;
        this.cartOrder = cartOrder;
    }

    public Order() {
        this.id = "id";
        this.customer = new User();
        this.receiveTime = new Date();
        this.shipped = false;
        this.cartOrder = new Cart();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    public Cart getCartOrder() {
        return cartOrder;
    }

    public void setCartOrder(Cart cartOrder) {
        this.cartOrder = cartOrder;
    }

    public void printBill() {
        System.out.println("Order number: " + this.getId());
        System.out.println("Customer name: " + this.getCustomer().getName());
        System.out.println("Customer phone number: " + this.getCustomer().getPhone());
        System.out.println("Receive time: " + this.getReceiveTime().toString());
        System.out.println("List of product:");
        getCartOrder().printCart();
        System.out.println("Total price of your order is: " + this.getCartOrder().getCartPrice());
    }
}
