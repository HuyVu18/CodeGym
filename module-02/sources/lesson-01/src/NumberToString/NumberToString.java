package NumberToString;

import java.util.Scanner;

public class NumberToString {
    public static String unitNumber(int numb) {
        String text = null;
        switch (numb) {
            case 1 -> {
                text = "one";
            }
            case 2 -> {
                text = "two";
            }
            case 3 -> {
                text = "three";
            }
            case 4 -> {
                text = "four";
            }
            case 5 -> {
                text = "five";
            }
            case 6 -> {
                text = "six";
            }
            case 7 -> {
                text = "seven";
            }
            case 8 -> {
                text = "eight";
            }
            case 9 -> {
                text = "nine";
            }
            case 0 -> {
                text = "zero";
            }
            case 10 -> {
                text = "ten";
            }
        }
        return text;
    }
    public static String teenNumber(int numb) {
        String text = null;
        switch (numb) {
            case 11 -> {
                text = "eleven";
            }
            case 12 -> {
                text = "twelve";
            }
            case 13 -> {
                text = "thirteen";
            }
            case 14 -> {
                text = "fourteen";
            }
            case 15 -> {
                text = "fifteen";
            }
            case 16 -> {
                text = "sixteen";
            }
            case 17 -> {
                text = "seventeen";
            }
            case 18 -> {
                text = "eighteen";
            }
            case 19 -> {
                text = "nineteen";
            }
        }
        return text;
    }
    public static String tenNumber(int numb) {
        String text = null;
        switch (numb) {
            case 2 -> {
                text = "twenty";
            }
            case 3 -> {
                text = "thirty";
            }
            case 4 -> {
                text = "forty";
            }
            case 5 -> {
                text = "fixity";
            }
            case 6 -> {
                text = "sixty";
            }
            case 7 -> {
                text = "seventy";
            }
            case 8 -> {
                text = "eighty";
            }
            case 9 -> {
                text = "ninety";
            }
        }
        return text;
    }
    public static String hundredNumber(int numb) {
        String text = null;
        switch (numb) {
            case 1 -> {
                text = "one hundred";
            }
            case 2 -> {
                text = "two hundred";
            }
            case 3 -> {
                text = "three hundred";
            }
            case 4 -> {
                text = "four hundred";
            }
            case 5 -> {
                text = "five hundred";
            }
            case 6 -> {
                text = "six hundred";
            }
            case 7 -> {
                text = "seven hundred";
            }
            case 8 -> {
                text = "eight hundred";
            }
            case 9 -> {
                text = "nine hundred";
            }
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numb = scan.nextInt();

        int hundred = numb / 100;
        int ten = (numb - (100 * hundred)) / 10;
        int unit = numb % 10;
        if (numb <= 10) {
            System.out.print(unitNumber(numb));
        } else if (numb < 100) {
            if (ten == 1) {
                System.out.print(teenNumber(numb));
            } else {
                System.out.print(tenNumber(ten) + " " + unitNumber(unit));
            }
        } else {
            if (ten == 1) {
                System.out.print(hundredNumber(hundred) + " and " + teenNumber(numb - hundred * 100));
            } else if (ten == 0) {
                System.out.print(hundredNumber(hundred) + " and " + unitNumber(unit));
            } else {
                System.out.print(hundredNumber(hundred) + " " + tenNumber(ten) + " " + unitNumber(unit));
            }
        }
    }
}
