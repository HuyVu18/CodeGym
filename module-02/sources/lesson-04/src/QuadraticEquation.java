import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        this.a = 1;
        this.b = 0;
        this.c = 1;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public String printEquation() {
        return a + "x^2 + " + b + " + " + c + " = 0";
    }

    public double getDisciminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        if (getDisciminant() >= 0) {
            return (-1 * b + Math.sqrt(getDisciminant())) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDisciminant() >= 0) {
            return (-1 * b - Math.sqrt(getDisciminant())) / (2 * a);
        } else {
            return 0;
        }
    }

    public String solveEquation() {
        if (getDisciminant() < 0) {
            return "Delta = " + String.format("%.2f", getDisciminant()) + ". \nThe equation has no real roots";
        } else if (getDisciminant() == 0) {
            return "Delta = " + String.format("%.2f", getDisciminant()) + ". \nThe equation has 1 root: x = " + String.format("%.2f", getRoot1());
        } else {
            return "Delta = " + String.format("%.2f", getDisciminant()) + ". \nThe equation has 2 roots: x1 = " + String.format("%.2f", getRoot1()) + ", x2 = " + String.format("%.2f", getRoot2());
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
//        System.out.print("a = ");
        a = scan.nextInt();
//        System.out.print("b = ");
        b = scan.nextInt();
//        System.out.print("c = ");
        c = scan.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println(equation.printEquation());
        System.out.println(equation.solveEquation());
    }
}
