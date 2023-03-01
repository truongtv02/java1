package day3;

import java.util.Scanner;

public class bai115 {
    public static void trungbinh(double a, double b){
        if (a<0 || b<0 || a>10 || b>10){
            System.out.println("KHONG HOP LE!");
            return;
        }
        double diemTB = (a+b)/2;
        System.out.println("diem trung binh = "+diemTB);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap ten: ");
        String hoten = in.nextLine();
        System.out.print("Nhap diem toan: ");
        double a = in.nextDouble();
        System.out.print("Nhap diemvan: ");
        double b = in.nextDouble();
trungbinh(a,b);

    }
}
