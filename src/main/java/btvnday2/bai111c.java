package btvnday2;

import java.util.Scanner;

public class bai111c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu cao h= ");
        int a,b,h;
        h = in.nextInt();
        System.out.println("Ve tam giac can chieu cao h: \n");
        for (a=1; a<=h; a++)
        {
            for (b=1; b<=h; b++)
                System.out.print(" ");
            for (b=1; b<=2*a-1; b++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
