import java.util.Date;
import java.util.Scanner;

public class Main {
    public static User newUser = new User();
    public static Product[] products1 = initialProduct1();
    public static Category newCategory1 = new Category("0A", "Mobile phone", "img", products1);
    public static Product[] products2 = initialProduct2();
    public static Category newCategory2 = new Category("0B", "Gaming device", "img", products2);
    public static Cartline[] newCartLine = new Cartline[3];
    public static Cart newCart = decalreCart();
    public static Order newOrder = new Order();

    public static Product[] initialProduct1() {
        Product[] products = new Product[4];
        products[0] = new Product("01", "Samsung", "img", 2000);
        products[1] = new Product("02", "Iphone", "img", 5000);
        products[2] = new Product("03", "Xiaomi", "img", 3000);
        products[3] = new Product("04", "Nokia", "img", 4000);
        return products;
    }

    public static Product[] initialProduct2() {
        Product[] products = new Product[4];
        products[0] = new Product("01", "Nintendo", "img", 20000);
        products[1] = new Product("02", "Playstation", "img", 30000);
        products[2] = new Product("03", "Xbox", "img", 30000);
        products[3] = new Product("04", "PC", "img", 40000);
        return products;
    }

    public static Cart decalreCart () {
        Cart cart = new Cart("AA", newCartLine);
        cart.declareCartLine();
        return cart;
    }

    public static void printLoginScreen(User newUser) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Login required. Please enter your information");
        System.out.print("Username: ");
        String name = scan.nextLine();
        System.out.print("Password: ");
        String password = scan.nextLine();
        newUser.setName(name);
        newUser.setPassword(password);
        System.out.println();
    }

    public static void printMainScreen() {
        System.out.println("Choose a option: ");
        System.out.println("1. Config profile");
        System.out.println("2. Brown and add products");
        System.out.println("3. Remove product from cart");
        System.out.println("4. Checkout and print bill");
        System.out.println("5. Exit");
    }

    public static void configProfileScreen(User currentUser) {
        System.out.println("Your current information:");
        currentUser.printUserInfo();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to change");
            System.out.println("1. Phone number");
            System.out.println("2. Address");
            System.out.println("3. Exit");
            int option = choosingOption();
            switch (option) {
                case 1 -> updateProfileNumber(currentUser);
                case 2 -> updateProfileAddress(currentUser);
                default -> {
                    return;
                }
            }
        }

    }

    public static void updateProfileNumber(User currentUser) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter new phone number:");
        String phoneNumb = scan.nextLine();
        currentUser.setPhone(phoneNumb);
        System.out.println("Your current information: ");
        currentUser.printUserInfo();
        System.out.println();
    }

    public static void updateProfileAddress(User currentUser) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new address information:");
        System.out.print("Street name: ");
        String street = scan.nextLine();
        System.out.print("House number: ");
        String number = scan.nextLine();
        System.out.print("Ward: ");
        String ward = scan.nextLine();
        System.out.print("District: ");
        String district = scan.nextLine();
        currentUser.getAddress().updateAddressInfo(street, number, ward, district);
        System.out.println("Your current information: ");
        currentUser.printUserInfo();
        System.out.println();
    }

    public static void browseCategoryList() {
        System.out.println("Choose a category: ");
        System.out.println("1. " + newCategory1.getName());
        System.out.println("2. " + newCategory2.getName());
        System.out.println("3. Exit");
        int choice = choosingOption();
        switch (choice) {
            case 1 -> {
                browseCategory(newCategory1);
                browseCategoryList();
            }
            case 2 -> {
                browseCategory(newCategory2);
                browseCategoryList();
            }
            default -> {
                return;
            }
        }
    }

    public static void browseCategory(Category category) {
        while (true) {
            System.out.println("Choose a product to add to cart: ");
            category.printProductList();
            System.out.println("5. Exit");
            int choice = choosingOption();
            if (choice >= 5) {
                newCart.printCart();
                break;
            } else {
                newCart.addToCart(newCategory1.getProducts()[choice - 1]);
            }
        }

    }

    public static int choosingOption() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your choice: ");
        return scan.nextInt();
    }

    public static void main(String[] args) {
        printLoginScreen(newUser);
        while (true) {
            printMainScreen();
            int choice = choosingOption();
            switch (choice) {
                case 1 -> configProfileScreen(newUser);
                case 2 -> browseCategoryList();
                default -> {
                    return;
                }
            }
        }
    }
}