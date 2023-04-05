public class MergeArray {

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int count = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[count];
            count++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11};
        System.out.print("Array 1 is: ");
        printArray(arr1);
        System.out.println();
        System.out.print("Array 2 is: ");
        printArray(arr2);
        System.out.println();
        int[] arr3 = mergeArray(arr1, arr2);
        System.out.print("Array after merging is: ");
        printArray(arr3);
    }
}
