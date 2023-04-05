import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        while (true) {
            System.out.print("Enter list size: ");
            size = scan.nextInt();
            if (size > 20) {
                System.out.println("Size can't exceed 20");
            } else {
                break;
            }
        }
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter element " + i + ": ");
            list[i] = scan.nextInt();
        }
        System.out.println("Property list:");
        for (int money : list) {
            System.out.println(money + " ");
        }
        int max = list[0];
        int index = 0;
        int maxindex = 0;
        for (int money : list) {
            if (max < money) {
                max = money;
                maxindex = index;

            }
            index++;
        }
        System.out.println("The largest value is " + max + " at " + (maxindex + 1));
    }
}
