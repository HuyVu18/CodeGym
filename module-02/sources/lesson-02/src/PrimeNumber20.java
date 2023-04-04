import java.util.Scanner;

public class PrimeNumber20 {
    private static boolean isPrime(int N) {
        boolean check = true;
        double numb = Math.sqrt(N);
        if (N == 1 || N == 2 || N == 3) {
            return check;
        } else {
            for (int i = 2; i <= numb; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of prime number n = ");
        int number = scan.nextInt();
        int count = 0;
        int N = 0;
        System.out.println(number + " first prime numbers: ");
        while (count <= number) {
            N++;
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
        }
    }
}
