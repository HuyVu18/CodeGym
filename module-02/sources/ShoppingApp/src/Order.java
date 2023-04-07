import java.util.Date;

public class Order {
    String id;
    boolean shipped;
    int totalPrice;
    Address address;
    String customer;
    String phone;
    Date receiveTime;
    Cart orderBill;

    public Order(String id, boolean shipped, int totalPrice, Address address, String customer, String phone, Date receiveTime, Cart orderBill) {
        this.id = id;
        this.shipped = shipped;
        this.totalPrice = totalPrice;
        this.address = address;
        this.customer = customer;
        this.phone = phone;
        this.receiveTime = receiveTime;
        this.orderBill = orderBill;
    }

    public Order() {
        this.id = "id";
        this.shipped = false;
        this.totalPrice = 0;
        this.address = new Address();
        this.customer = "customer";
        this.phone = "120";
        this.receiveTime = new Date();
        this.orderBill = new Cart();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Cart getOrderBill() {
        return orderBill;
    }

    public void setOrderBill(Cart orderBill) {
        this.orderBill = orderBill;
    }

    public String printBill() {
        String text = "";
        text += "Order number: " + this.getId() + "\n";
        text += "Customer name: " + this.getCustomer() + "\n";
        text += "Customer phone number: " + this.getPhone() + "\n";
        text += "Receive time: " + this.getReceiveTime().toString() + "\n";
        text += "List of product: \n";
        text += this.getOrderBill().printCart() + "\n";
        text += "Total price of your order is: " + this.getOrderBill().calculateTotalPrice() + "\n";
        return text;
    }
}
