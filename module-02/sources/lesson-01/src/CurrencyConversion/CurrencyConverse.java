package CurrencyConversion;

import java.util.Scanner;

public class CurrencyConverse {
    public static void main(String[] args) {
        final int RATE = 23000;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter USD amount: ");
        int USD = scan.nextInt();
        System.out.printf("%s USD = %s VND", USD, USD * RATE);
    }
}
