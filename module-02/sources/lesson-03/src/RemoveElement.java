import java.util.Scanner;

public class RemoveElement {
    public static int findIndex(int[] arr, int numb) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numb) {
                index = i;
            }
        }
        return index;
    }

    public static void removeIndex(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = scan.nextInt();
        int[] arr = {1, 2, 3, 7, 5, 6, 7, 8, 9 ,10};
        int index = findIndex(arr, value);
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        if (index == -1) {
            System.out.println("There's no value " + value + " in array");
        }
        while (index != -1) {
            removeIndex(arr, index);
            index = findIndex(arr, value);
            if (index == -1) {
                System.out.println("Array after remove value " + value + " is");
                for (int element : arr) {
                    System.out.print(element + " ");
                }
            }
        }
    }

}
