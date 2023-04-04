import java.util.Scanner;

public class LargestDivisor {
    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        if (a >= b) {
            System.out.print("Greatest common divisor is " + gcd(b, a));
        } else {
            System.out.print("Greatest common divisor is " + gcd(a, b));
        }
    }
}
