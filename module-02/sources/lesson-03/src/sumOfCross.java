import java.util.Scanner;

public class sumOfCross {
    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.printf("%.2f %5s",element,"");
        }
    }

    public static void printArray2D(double[][] arr) {
        for (double[] doubles : arr) {
            printArray(doubles);
            System.out.println();
        }
    }

    public static void writeArray2D(double[][] arr, Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j );
                arr[i][j] = scan.nextDouble();
            }
        }
    }

    public static void randomArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (Math.random() * 99) + 1;
            }
        }
    }

    public static double sumCorss(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l;
        while (true) {
            System.out.print("Enter length of square: ");
            l = scan.nextInt();
            if (l > 1) {
                break;
            } else {
                System.out.println("Square length must be greater than 1");
            }
        }
        double[][] arr;
        arr = new double[l][l];
        writeArray2D(arr, scan);
        printArray2D(arr);
        double result = sumCorss(arr);
        System.out.printf("Sum of main cross is %.2f", result);
    }
}
