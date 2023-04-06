import java.util.Scanner;

public class sumOfColumn {
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

    public static double sumColumn(double[][] arr, int column) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i][column];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of columns: ");
        int x = scan.nextInt();
        System.out.print("Enter number of rows: ");
        int y = scan.nextInt();
        double[][] arr;
        arr = new double[y][x];
//        writeArray2D(arr, scan);
        randomArray(arr);
        printArray2D(arr);
        System.out.print("Enter index of column: ");
        int column = scan.nextInt();
        double result = sumColumn(arr, column);
        System.out.printf("Sum of element in column %d is: %.2f", column, result);
    }
}
