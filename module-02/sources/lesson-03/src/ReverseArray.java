import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter size of array: ");
            size = scan.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            } else {
                break;
            }
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scan.nextInt();
        }
        System.out.println("Elements in array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("Array after reverse:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
