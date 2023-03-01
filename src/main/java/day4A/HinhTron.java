package day4A;

public class HinhTron {
    private double radius = 1.0;
    private String color = "red";

    public HinhTron() {
    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron[" +
                "radius=" + radius +
                ",color='" + color + '\'' +
                ']';
    }
}