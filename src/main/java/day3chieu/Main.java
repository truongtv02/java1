package day3chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // se sd class -> can tao ra doi tuong cu the
        Dog d1 = new Dog();
        d1.name = "Cho bec ";
        d1.age = 1;
        d1.color = "Den";

        //su dung cac phuong thuc
        d1.eat();
        d1.run();

        //tao 1 doi tuong Dog d2
        //nhap du lieu tu banphim
        Scanner in = new Scanner(System.in);
        Dog d2 = new Dog();
        System.out.print("Nhap ten: ");
        d2.name = in.nextLine();
        System.out.print("Nhap tuoi: ");
        d2.age = Integer.parseInt(in.nextLine());
        System.out.print("Nhap mau: ");
        d2.color = in.nextLine();
        in.close();
        d2.run();
    }
}
