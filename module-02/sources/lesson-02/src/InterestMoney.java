import java.util.Scanner;

public class InterestMoney {
    public static double Interest(double inamout, double rate, int month) {
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += inamout * (rate / 100) / 12 * month;
        }
        return totalInterest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input money amount: ");
        double money = scan.nextDouble();
        System.out.print("Input interest rate: ");
        double rate = scan.nextDouble();
        System.out.print("Input month: ");
        int month = scan.nextInt();

        System.out.print("Interest is: " + Interest(money, rate, month));
    }
}
