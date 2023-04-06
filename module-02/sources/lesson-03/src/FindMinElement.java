import java.util.Scanner;

public class FindMinElement {
    public static int findMinIndex(int[] arr) {
        int min = arr[0];
        int min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void writeArray(int[] arr, Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int l = scan.nextInt();
        int[] array = new int[l];
        writeArray(array, scan);
        System.out.println("The array is: ");
        printArray(array);
        System.out.println();
        int min_index = findMinIndex(array);
        System.out.println("Min value of array is " + array[min_index] + " at index " + min_index);
    }
}
