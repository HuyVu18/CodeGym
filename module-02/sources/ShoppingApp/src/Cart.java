public class Cart {
    private String id;
    private Cartline[] cartline;

    public Cart() {
        this.id = "id";
        this.cartline = new Cartline[3];
    }

    public Cart(String id, Cartline[] cartline) {
        this.id = id;
        this.cartline = cartline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cartline[] getcartline() {
        return cartline;
    }

    public void setCartLine(Cartline[] cartline) {
        this.cartline = cartline;
    }

    public int getCartPrice() {
        int sum = 0;
        for (Cartline cartline : getcartline()) {
            sum += cartline.getLinePrice();
        }
        return sum;
    }

    public void declareCartLine() {
        for (int i = 0; i < cartline.length; i++) {
            cartline[i] = new Cartline();
        }
    }

    public int checkCartExist(Product product) {
        int check = -1;
        for (int index = 0; index < cartline.length; index++) {
            if (cartline[index].getProduct().getName() == product.getName()) {
                check = index;
                break;
            }
        }
        return check;
    }

    public int checkCartSlot() {
        int check = -1;
        for (int i = 0; i < cartline.length; i++) {
            if (cartline[i].getQuantity() == 0) {
                check = i;
                break;
            }
        }
        return check;
    }

    public void addToCart(Product product) {
        int checkExist = checkCartExist(product);
        int checkSlot = checkCartSlot();
        if (checkExist != -1) {
            cartline[checkExist].updateCartLine(cartline[checkExist].getQuantity() + 1);
        } else {
            if (checkSlot == -1) {
                System.out.println("Cart is full");
            } else {
                cartline[checkSlot] = new Cartline(Integer.toString(checkSlot + 1) + "C", product, 1);
            }
        }
    }

    public void printCart() {
        for (Cartline element : cartline) {
            System.out.println(element.getCartlineString());
        }
    }
}
