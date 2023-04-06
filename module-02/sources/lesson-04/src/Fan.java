public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FATS = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return String.format("%d %s %.1f fan is %s", speed, color, radius, (on ? "on" : "off"));
    }

    public static void main(String[] args) {
        final boolean on = true;
        final boolean off = false;
        Fan fan1 = new Fan(10, on, 10.0, "yellow");
        Fan fan2 = new Fan(5, off, 5.0, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
