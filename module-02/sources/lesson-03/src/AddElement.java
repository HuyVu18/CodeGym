import java.util.Scanner;

public class AddElement {
    public static void addElement(int[] arr, int numb, int index, int size) {
        int temp1 = numb;
        int temp2 = arr[index];
        for (int i = index; i <= size; i++) {
            temp2 = arr[i];
            arr[i] = temp1;
            temp1 = temp2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6 , 7, 0, 0, 0, 0};
        int size = 7; //size is the amount of element that does equal to 0
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value will be added: ");
        int value = scan.nextInt();
        System.out.print("Enter index of new element: ");
        int index = scan.nextInt();
        System.out.println("Array before adding:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        addElement(arr, value, index, size);
        System.out.println("Array after adding:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
