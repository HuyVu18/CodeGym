import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product[] productsList = new Product[10];
        for (int index = 0; index < productsList.length; index++) {
            String numbOrder = Integer.toString(index + 1);
            productsList[index] = new Product(numbOrder, "Phone" + numbOrder, "img", (index + 1) * 1000);
        }
//        for (Product element : productsList) {
//            System.out.print(element.getProductString() + "\n");
//        }
        System.out.println("List of product in category Mobile Phone:");
        Category mobilePhone = new Category("02011998", "Mobile Phone", "img", productsList);
        System.out.println(mobilePhone.printProductList()); //Print the list of products in category Mobile Phone
        Address address = new Address("NVT", "21K", "14", "PN");
        User user = new User("01", "CPP", "abc", "123", address);
        Cartline[] cartline = new Cartline[3];
        cartline[0] = new Cartline("1", productsList[1], 1, productsList[1].getPrice());
        cartline[1] = new Cartline("2", productsList[2], 2, productsList[2].getPrice() * 2);
        cartline[2] = new Cartline("3", productsList[3], 3, productsList[3].getPrice() * 3);
        Cart cart = new Cart("007", cartline, 0);
        cart.setTotalPrice(cart.calculateTotalPrice());
        Order yourBill = new Order("ABC", true, 0, address, "CPP", "190", new Date(), cart);
        yourBill.setTotalPrice(yourBill.getOrderBill().calculateTotalPrice());
        System.out.println(yourBill.printBill());
    }
}