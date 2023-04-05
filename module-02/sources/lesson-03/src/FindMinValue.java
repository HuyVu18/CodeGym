public class FindMinValue {
    public static int minValue(int[] arr) {
        int min = arr[0];
        int minindex = 0;
        int index = 0;
        for (int numb : arr) {
            if (min > numb) {
                min = numb;
                minindex = index;
            }
            index++;
        }
        return minindex;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + " at index " + index);
    }
}
