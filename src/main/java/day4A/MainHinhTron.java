package day4A;

public class MainHinhTron {
    public static void main(String[] args) {
        // Tao doi tuong Circle
        HinhTron c1 = new HinhTron(3);
        System.out.println(c1);
        System.out.println("Area: "+ c1.getArea());

        // Tao doi tuong Hinh Tru
        HinhTru cy1 = new HinhTru();
        System.out.println("Volume: "+ cy1.getVolume());

        HinhTru cy2 = new HinhTru(8);
        System.out.println("Volume: "+ cy2.getVolume());

    }
}
