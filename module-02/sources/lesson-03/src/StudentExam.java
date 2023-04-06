import java.util.Scanner;

public class StudentExam {
    public static void writeList(int[] arr, Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }
    }

    public static void printList(int[] arr) {
        System.out.println("List of marks is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int[] checkPassing(int[] arr) {
        int[] check = new int[arr.length];
        int index = 0;
        for (int element : arr) {
            if (element >= 5) {
                check[index] = 1;
            } else {
                check[index] = 0;
            }
            index++;
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        while (true) {
            System.out.print("Enter number of students: ");
            size = scan.nextInt();
            if (size > 20) {
                System.out.println("A class can not have more 30 students");
            } else if (size <= 0) {
                System.out.println("Number of students must be greater than 0");
            } else {
                break;
            }
        }
        int[] Student = new int[size];
        writeList(Student, scan);
        printList(Student);
        System.out.println();
        int[] check = checkPassing(Student);
        int pass = 0;
        for (int j : check) {
            if (j == 1) {
                pass++;
            }
        }
        System.out.println("Number of students passing is: " + pass);
    }
}
