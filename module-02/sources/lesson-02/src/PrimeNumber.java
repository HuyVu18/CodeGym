import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number < 2) {
            System.out.print(number + " is not a prime number");
        } else {
            for (int i = 2; i <= number; i++) {
                if (i == number) {
                    System.out.print(number + " is a prime number");
                } else if (number % i == 0) {
                    System.out.print(number + " is not a prime number");
                    break;
                }
            }
        }
    }
}
