public class Cartline {
    private String id;
    private Product product;
    private int quantity;
    private int linePrice;

    public Cartline(String id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.linePrice = product.getPrice() * quantity;
    }

    public Cartline() {
        this.id = "id";
        this.product = new Product();
        this.quantity = 0;
        this.linePrice = 0;
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

    public int getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(int linePrice) {
        this.linePrice = linePrice;
    }

    public String getCartlineString() {
        return String.format("%s. %s x %d = %d", getId(), product.getProductString(), getQuantity(), getLinePrice());
    }

    public void updateCartLine(int quantityChange) {
        this.quantity = quantityChange;
        this.linePrice = this.product.getPrice() * quantityChange;
    }
}
