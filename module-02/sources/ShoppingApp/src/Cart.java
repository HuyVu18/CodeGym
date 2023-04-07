public class Cart {
    String id;
    Cartline[] cartlines;
    int totalPrice;

    public Cart() {
        this.id = "id";
        this.cartlines = new Cartline[0];
        this.totalPrice = 0;
    }

    public Cart(String id, Cartline[] cartlines, int totalPrice) {
        this.id = id;
        this.cartlines = cartlines;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cartline[] getCartlines() {
        return cartlines;
    }

    public void setCartlines(Cartline[] cartlines) {
        this.cartlines = cartlines;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int calculateTotalPrice() {
        int sum = 0;
        for (Cartline cartline : getCartlines()) {
            sum += cartline.gettotalPrice();
        }
        return sum;
    }

    public String printCart() {
        String text = "";
        for (Cartline element : cartlines) {
            text += element.getCartlineString() + "\n";
        }
        return text;
    }
}
