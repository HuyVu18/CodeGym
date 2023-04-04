public class PrimeNumber100 {
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
        System.out.println("Prime numbers lesser than 100 is:");
        int numb = 0;
        while (numb <= 100) {
            numb++;
            if (isPrime(numb)) {
                System.out.print(numb + " ");
            }
        }
    }
}
