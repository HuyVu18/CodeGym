import java.util.Scanner;

public class findCharRate {
    public static int countChar(String str, char c) {
        int count = 0;
        int size = str.length();
        for (int index = 0; index < size; index++) {
            if (c == str.charAt(index)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "My dream is to have a big adventure where I can fight monster, collect bounty, finding treasure";
        System.out.println(str);
        System.out.print("Enter the character: ");
        char c = scan.next().charAt(0);
        int result = countChar(str, c);
        System.out.printf("Number of appearance of character %c in string is %d", c, result);
    }
}
