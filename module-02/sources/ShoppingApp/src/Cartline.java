public class Cartline {
    String id;
    Product product;
    int quantity;
    int totalPrice;

    public Cartline(String id, Product product, int quantity, int totalPrice) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Cartline() {
        this.id = "id";
        this.product = new Product();
        this.quantity = 0;
        this.totalPrice = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int gettotalPrice() {
        return totalPrice;
    }

    public void settotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int lineTotalprice() {
        return product.getPrice() * getQuantity();
    }

    public String getCartlineString() {
        return String.format("%s. %s x %d = %d", getId(), product.getProductString(), getQuantity(), lineTotalprice());
    }
}
