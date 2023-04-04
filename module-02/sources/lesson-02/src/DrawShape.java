import java.util.Scanner;

public class DrawShape {
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

    private static void drawSquareTriangle() {
        drawTopLeftSquareTriangle();
        System.out.print("\n");
        drawTopRightSquareTriangle();
        System.out.print("\n");
        drawBottomLeftSquareTriangle();
        System.out.print("\n");
        drawBottomRightSquareTriangle();
    }

    private static void drawTopLeftSquareTriangle() {
        for (int i = 6; i >= 1; i--) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                if (i == j) {
                    System.out.print("\n");
                }
                j++;
            }
        }
    }

    private static void drawTopRightSquareTriangle() {
        for (int i = 1; i <= 6; i++) {
            int j = 1;
            while (j <= 6) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                if (j == 6) {
                    System.out.print("\n");
                }
                j++;
            }
        }
    }

    private static void drawBottomLeftSquareTriangle() {
        for (int i = 1; i <= 6; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                if (j == i) {
                    System.out.print("\n");
                }
                j++;
            }
        }
    }

    private static void drawBottomRightSquareTriangle() {
        for (int i = 1; i <= 6; i++) {
            int j = 6;
            while (j >= 1) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                if (j == 1) {
                    System.out.print("\n");
                }
                j--;
            }
        }
    }

    private static void drawIsoscelesTriangle() {
        for (int i = 1; i <= 6; i++) {
            int j = 1;
            while (j <= 11) {
                if (j >= 6 - (i - 1) && j <= 6 + (i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                if (j == 11) {
                    System.out.print("\n");
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print the isosceles triangle");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> drawRectangle();
            case 2 -> drawSquareTriangle();
            case 3 -> drawIsoscelesTriangle();
            default -> System.out.println("No choice");
        }
    }
}
