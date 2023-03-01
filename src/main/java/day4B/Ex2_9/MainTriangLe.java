package day4B.Ex2_9;

import day4B.Ex2_6.MyPoint;

public class MainTriangLe {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(0, 3);
        MyPoint B = new MyPoint(4, 0);
        MyPoint C = new MyPoint(0, 0);

        MyTriangLe myTriangle = new MyTriangLe(A, B, C);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
    }

}
