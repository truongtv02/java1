package day4A;

public class HinhTru extends HinhTron {
    private double height = 1.0;

    public HinhTru(){}

    public HinhTru(double radius) {

        super(radius);
    }

    public HinhTru(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public HinhTru(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }
}

