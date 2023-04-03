package LeapYear;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.printf("%c is leap year", year);
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.printf("%d is leap year", year);
            } else {
                System.out.printf("%d is not leap year", year);
            }
        }
    }
}
