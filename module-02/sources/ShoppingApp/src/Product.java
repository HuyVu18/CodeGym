public class Product {
    String id;
    String name;
    String image;
    int price;

    public Product() {
        this.id = "id";
        this.name = "name";
        this.image = "image";
        this.price = 0;
    }

    public Product(String id, String name, String image, int price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductString() {
        return String.format("%s  %d", getName(), getPrice());
    }
}
