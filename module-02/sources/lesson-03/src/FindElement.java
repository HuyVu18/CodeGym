import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String[] students = {"Luneth", "Vaan", "Tidus", "Firion", "Noctls", "Bartz", "Zidane", "Squall", "Cloud", "Lightning", "Cecil", "Terra"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scan.nextLine();
        boolean check = false;
        int index = 0;
        for (String student : students) {
            if (student.equals(name)) {
                check = true;
                break;
            }
            index++;
        }
        if (check) {
            System.out.println("Student " + name + " is at position " + (index + 1));
        } else {
            System.out.println("There's no student name " + name + " in the list");
        }
    }
}
