import java.util.Scanner;

public class DrawingMenu {
    private static void drawTriangle() {
        System.out.println("Draw the triangle");
        for (int i = 6; i >= 1; i--) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                if (j == i) {
                    System.out.print("\n");
                }
                j++;
            }
        }
    }

    private static void drawSquare() {
        System.out.println("Draw the square");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("* ");
                if (j == 7) {
                    System.out.print("\n");
                }
            }
        }
    }

    private static void drawRectangle() {
        System.out.println("Draw the rectangle");
        for (int i = 1; i <= 4; i++) {
            int j = 1;
            while (j <= 6) {
                System.out.print("* ");
                if (j == 6) {
                    System.out.print("\n");
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1 -> drawTriangle();
            case 2 -> drawSquare();
            case 3 -> drawRectangle();
            default -> System.out.println("No choice");
        }
    }
}
