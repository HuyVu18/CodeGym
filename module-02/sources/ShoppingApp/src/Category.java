public class Category {
    private String id;
    private String name;
    private String image;
    private Product[] products;

    public Category() {
        this.id = "id";
        this.name = "name";
        this.image = "image";
        this.products = new Product[4];
    }

    public Category(String id, String name, String image, Product[] products) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.products = products;
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

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void printProductList() {
        String text = "";
        int count = 1;
        for (Product element : getProducts()) {
            text += count + ". ";
            text += element.getProductString() + "\n";
            count++;
        }
        System.out.print(text);
    }
}
