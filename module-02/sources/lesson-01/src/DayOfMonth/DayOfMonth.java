package DayOfMonth;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.printf("The month %c has 31 days", month);
            case 4, 6, 9, 11 -> System.out.printf("The month %c has 30 days", month);
            case 2 -> System.out.print("The month 2 has 28 or 29 days");
        }
    }
}
