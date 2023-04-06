import java.util.Scanner;

public class findMaxIndex2D {


    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
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

    public static int findMaxIndex(double[] arr) {
        double max = arr[0];
        int max_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                max_index = i;
            }
        }
        return max_index;
    }

    public static int findmaxIndex2D(double[][] arr) {
        int max_index = 0;
        double max = arr[0][findMaxIndex(arr[0])];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i][findMaxIndex(arr[i])]) {
                max = arr[i][findMaxIndex(arr[i])];
                max_index = i;
            }
        }
        return max_index;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter horizon length: ");
        int x = scan.nextInt();
        System.out.print("Enter vertical length: ");
        int y = scan.nextInt();
        double[][] arr;
        arr = new double[y][x];
        writeArray2D(arr, scan);
        printArray2D(arr);
        int max_index_y = findmaxIndex2D(arr);
        int max_index_x = findMaxIndex(arr[max_index_y]);
        System.out.println("Index of max value is "+ arr[max_index_y][max_index_x] + " at " + max_index_y + " " + max_index_x);
    }
}
