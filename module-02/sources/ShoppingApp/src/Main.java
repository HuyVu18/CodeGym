import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void printScreen() {
        System.out.println("Choose a option: ");
        System.out.println("1. User register");
        System.out.println("2. Brown and add products");
        System.out.println("3. Checkout and print bill");
    }

    public static void choiceOption(int choice) {

    }

    public static void main(String[] args) {

        //Create a category with an array of 10 product
        Product[] productsList = new Product[10];
        for (int index = 0; index < productsList.length; index++) {
            String numbOrder = Integer.toString(index + 1);
            productsList[index] = new Product(numbOrder, "Phone" + numbOrder, "img", (index + 1) * 1000);
        }
        Category mobilePhone = new Category("02011998", "Mobile Phone", "img", productsList);


//        Scanner scan = new Scanner(System.in);
//        int choice = 0;
//        while (true) {
//            printScreen();
//            choice = scan.nextInt();
//
//        }

        //Print the list of products in category Mobile Phone
        System.out.println("List of product in category Mobile Phone:");
        System.out.println(mobilePhone.printProductList());

        //Create address and user. Because I'm too lazy!!
        Address address = new Address("NVT", "21K", "14", "PN");
        User user = new User("01", "CPP", "abc", "123", address);

        //Create an array of 3 Cartline
        Cartline[] cartline = new Cartline[3];

        //User add one product 1, two products 2 and three products 3
        cartline[0] = new Cartline("1", productsList[1], 1, productsList[1].getPrice());
        cartline[1] = new Cartline("2", productsList[2], 2, productsList[2].getPrice() * 2);
        cartline[2] = new Cartline("3", productsList[3], 3, productsList[3].getPrice() * 3);

        //Create an Cart that contain products user added
        Cart cart = new Cart("007", cartline, 0);
        cart.setTotalPrice(cart.calculateTotalPrice());

        //create an Order object name yourBill, yourBill is receipt
        Order yourBill = new Order("ABC", true, 0, address, "CPP", "190", new Date(), cart);

        //The code below calculate total price of all cartline.
        //yourBill.getOrderBill() is to get attribute cart of yourBill
        //calculateTotalPrice()) is method belong to Cart
        yourBill.setTotalPrice(yourBill.getOrderBill().calculateTotalPrice());

        System.out.println("Your bill: ");
        System.out.println(yourBill.printBill());
    }
}