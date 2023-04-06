import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{ " + "width = " + this.width + ", height = " + this.height + " }";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scan.nextDouble();
        System.out.print("Enter the height: ");
        double height = scan.nextDouble();
        Rectangle rect = new Rectangle(width, height);
        System.out.println(rect.display());
        System.out.printf("Perimeter: %.2f\n", rect.getPerimeter());
        System.out.printf("Area: %.2f\n", rect.getArea());
    }
}

