package btvnday2;

import java.util.Scanner;

public class bai111b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,h;
        System.out.println("Nhap chieu cao h= ");
        h = in.nextInt();
        System.out.print("\n Ve tam giac can * rong\n");
        for (a=1;a<=h;a++)
        {
            if (a!=h)
                for (b=1;b<=2*h-1;b++)
                    if ((b==h-a+1)||(b==h+a-1)) System.out.print("*\t");
                    else System.out.print(" \t");
            else
                for (b=1;b<=2*h-1;b++) System.out.print("*\t");
            System.out.print("\n");
        }

    }
}
